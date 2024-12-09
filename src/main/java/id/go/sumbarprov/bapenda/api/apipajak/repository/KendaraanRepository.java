package id.go.sumbarprov.bapenda.api.apipajak.repository;

import id.go.sumbarprov.bapenda.api.apipajak.model.Kendaraan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KendaraanRepository extends JpaRepository<Kendaraan, Long> {
    // Method untuk mencari kendaraan berdasarkan status pajak
    List<Kendaraan> findByStatusPajak(String statusPajak);
}

