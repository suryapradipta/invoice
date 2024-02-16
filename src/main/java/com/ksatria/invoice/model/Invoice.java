package com.ksatria.invoice.model;

import java.time.*;
import java.util.Collection;
import javax.persistence.*;

import com.ksatria.invoice.calculator.NextNumberForYearCalculator;
import org.hibernate.annotations.GenericGenerator;
import org.openxava.annotations.*;
import org.openxava.calculators.*;
import lombok.*;
import org.openxava.model.Identifiable;

@Entity @Getter @Setter
public class Invoice extends Identifiable {
    @DefaultValueCalculator(CurrentYearCalculator.class) // Current year
    int year;

    @DefaultValueCalculator(value= NextNumberForYearCalculator.class,
        properties=@PropertyValue(name="year") // To inject the value of year from Invoice to
        // the calculator before calling to calculate()
    )
    int number;

    @DefaultValueCalculator(CurrentLocalDateCalculator.class) // Current date
    LocalDate date;

    @TextArea
    String remarks;

    @ManyToOne(fetch=FetchType.LAZY)
    Customer customer;

    @ElementCollection
    @ListProperties("product.number, product.description, quantity")
    Collection<Detail> details;
}
