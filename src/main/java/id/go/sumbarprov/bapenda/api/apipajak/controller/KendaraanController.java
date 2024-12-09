package id.go.sumbarprov.bapenda.api.apipajak.controller;


import id.go.sumbarprov.bapenda.api.apipajak.model.Kendaraan;
import id.go.sumbarprov.bapenda.api.apipajak.service.KendaraanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/kendaraan")
public class KendaraanController {

    private final KendaraanService kendaraanService;

    @Autowired
    public KendaraanController(KendaraanService kendaraanService) {
        this.kendaraanService = kendaraanService;
    }

    // Endpoint untuk mendapatkan semua kendaraan
    @GetMapping
    public ResponseEntity<List<Kendaraan>> getAllKendaraan() {
        List<Kendaraan> kendaraanList = kendaraanService.findAllKendaraan();
        return ResponseEntity.ok(kendaraanList);
    }

    // Endpoint untuk mendapatkan kendaraan berdasarkan ID
    @GetMapping("/{id}")
    public ResponseEntity<Kendaraan> getKendaraanById(@PathVariable Long id) {
        Kendaraan kendaraan = kendaraanService.findKendaraanById(id);
        return ResponseEntity.ok(kendaraan);
    }

    // Endpoint untuk membuat kendaraan baru
    @PostMapping
    public ResponseEntity<Kendaraan> createKendaraan(@RequestBody Kendaraan kendaraan) {
        Kendaraan savedKendaraan = kendaraanService.saveKendaraan(kendaraan);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedKendaraan);
    }

    // Endpoint untuk memperbarui status pajak kendaraan
    @PutMapping("/{id}/status-pajak")
    public ResponseEntity<Kendaraan> updateStatusPajak(@PathVariable Long id, @RequestBody String statusPajak) {
        Kendaraan updatedKendaraan = kendaraanService.updateStatusPajak(id, statusPajak);
        return ResponseEntity.ok(updatedKendaraan);
    }

    // Endpoint untuk menghapus kendaraan berdasarkan ID
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteKendaraan(@PathVariable Long id) {
        kendaraanService.deleteKendaraan(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Kendaraan berhasil dihapus");
    }

    // Endpoint untuk mendapatkan kendaraan berdasarkan status pajak
    @GetMapping("/status/{statusPajak}")
    public ResponseEntity<List<Kendaraan>> getKendaraanByStatusPajak(@PathVariable String statusPajak) {
        List<Kendaraan> kendaraanList = kendaraanService.findByStatusPajak(statusPajak);
        return ResponseEntity.ok(kendaraanList);
    }
}

