package com.ksatria.invoice.model;

import javax.persistence.*;
import lombok.*;

@Entity @Getter @Setter
public class Product {
    @Id
    int number;

    String description;
}
