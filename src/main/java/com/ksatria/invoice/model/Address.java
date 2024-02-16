package com.ksatria.invoice.model;

import javax.persistence.*;
import lombok.*;

@Embeddable // We use @Embeddable instead of @Entity
@Getter @Setter
public class Address {

    @Column(length = 30) // The members are annotated as in entity case
    String street;

    String state;

}
