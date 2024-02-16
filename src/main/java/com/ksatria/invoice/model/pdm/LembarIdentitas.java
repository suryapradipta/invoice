package com.ksatria.invoice.model.pdm;

import lombok.Getter;
import lombok.Setter;
import org.openxava.model.Identifiable;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class LembarIdentitas extends Identifiable {
    private String nomorRekamMedis;

    @Column(length = 11)
    private String nomorIHSPasien;

    @Column(length = 16)
    private String nik;

    private String idPelanggan;

    private String namaPasien;

    private LocalDate tanggalLahirPasien;

    private int tinggiBadanPasien;

    private double beratBadanPasien;

    private double luasPermukaanTubuhAnak;
}
