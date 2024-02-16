package com.ksatria.invoice.model;

import javax.persistence.*;
import org.openxava.annotations.*;
import lombok.*;

@Entity @Getter @Setter
public class Customer {

    @Id
    int number;

    String name;

    @Embedded // This is the way to reference an embeddable class
    Address address; // A regular Java reference
}
