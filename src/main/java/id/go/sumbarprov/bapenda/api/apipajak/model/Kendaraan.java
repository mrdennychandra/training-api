package id.go.sumbarprov.bapenda.api.apipajak.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Kendaraan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomorPolisi;
    private String namaPemilik;
    private String statusPajak; // "SUDAH_BAYAR" or "BELUM_BAYAR" as String
    private Date jatuhTempoPajak;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomorPolisi() {
        return nomorPolisi;
    }

    public void setNomorPolisi(String nomorPolisi) {
        this.nomorPolisi = nomorPolisi;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public void setNamaPemilik(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }

    public String getStatusPajak() {
        return statusPajak;
    }

    public void setStatusPajak(String statusPajak) {
        this.statusPajak = statusPajak;
    }

    public Date getJatuhTempoPajak() {
        return jatuhTempoPajak;
    }

    public void setJatuhTempoPajak(Date jatuhTempoPajak) {
        this.jatuhTempoPajak = jatuhTempoPajak;
    }
}

