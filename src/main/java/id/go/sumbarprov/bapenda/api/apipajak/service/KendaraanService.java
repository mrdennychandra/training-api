package id.go.sumbarprov.bapenda.api.apipajak.service;

import id.go.sumbarprov.bapenda.api.apipajak.model.Kendaraan;

import java.util.List;

public interface KendaraanService {
    Kendaraan saveKendaraan(Kendaraan kendaraan); // Menyimpan kendaraan baru
    Kendaraan updateStatusPajak(Long id, String statusPajak); // Mengupdate status pajak kendaraan
    List<Kendaraan> findAllKendaraan(); // Mendapatkan semua kendaraan
    List<Kendaraan> findByStatusPajak(String statusPajak); // Mencari kendaraan berdasarkan status pajak
    Kendaraan findKendaraanById(Long id); // Mencari kendaraan berdasarkan ID
    void deleteKendaraan(Long id); // Menghapus kendaraan berdasarkan ID
}

