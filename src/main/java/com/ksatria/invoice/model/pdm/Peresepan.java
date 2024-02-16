package com.ksatria.invoice.model.pdm;

import lombok.*;
import org.openxava.annotations.TextArea;
import org.openxava.model.Identifiable;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Peresepan extends Identifiable {
    @ManyToOne(fetch = FetchType.LAZY)
    private LembarIdentitas lembarIdentitas;

    private String idPelanggan;

    private String idResep;

    @TextArea
    private String catatan;
}
