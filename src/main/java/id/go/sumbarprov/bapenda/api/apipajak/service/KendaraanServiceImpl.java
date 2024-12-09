package id.go.sumbarprov.bapenda.api.apipajak.service;

import id.go.sumbarprov.bapenda.api.apipajak.model.Kendaraan;
import id.go.sumbarprov.bapenda.api.apipajak.repository.KendaraanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KendaraanServiceImpl implements KendaraanService {

    private final KendaraanRepository repository;

    @Autowired
    public KendaraanServiceImpl(KendaraanRepository repository) {
        this.repository = repository;
    }

    @Override
    public Kendaraan saveKendaraan(Kendaraan kendaraan) {
        return repository.save(kendaraan);
    }

    @Override
    public Kendaraan updateStatusPajak(Long id, String statusPajak) {
        Kendaraan kendaraan = repository.findById(id).orElseThrow(() ->
                new RuntimeException("Kendaraan dengan ID " + id + " tidak ditemukan."));
        kendaraan.setStatusPajak(statusPajak);
        return repository.save(kendaraan);
    }

    @Override
    public List<Kendaraan> findAllKendaraan() {
        return repository.findAll();
    }

    @Override
    public List<Kendaraan> findByStatusPajak(String statusPajak) {
        return repository.findByStatusPajak(statusPajak);
    }

    @Override
    public Kendaraan findKendaraanById(Long id) {
        return repository.findById(id).orElseThrow(() ->
                new RuntimeException("Kendaraan dengan ID " + id + " tidak ditemukan."));
    }

    @Override
    public void deleteKendaraan(Long id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Kendaraan dengan ID " + id + " tidak ditemukan.");
        }
        repository.deleteById(id);
    }
}

