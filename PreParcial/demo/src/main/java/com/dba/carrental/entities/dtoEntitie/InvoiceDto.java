package com.dba.carrental.entities.dtoEntitie;

import com.dba.carrental.entities.Customer;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class InvoiceDto {
    private long InvoiceId;
    private long customer;
    private LocalDateTime InvoiceDate;
    private String BilingAddress;
    private String BilingCity;
    private String BilingState;
    private String BilingCountry;
    private String BilingPostalCode;
    private Double  Total;
}

