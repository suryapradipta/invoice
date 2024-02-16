package com.ksatria.invoice.model.pdm;

import org.openxava.annotations.TextArea;

public class AturanPakai {
    private String metodePemberian;

    private String dosisObatDiberikan;

    private String unit;

    private String frekuensi;

    @TextArea
    private String aturanTambahan;
}
