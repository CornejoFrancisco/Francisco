package com.dba.carrental.entities.dtoEntitie;

import com.dba.carrental.entities.Invoice;
import com.dba.carrental.entities.Track;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class InvoiceItemDto {
    private long InvoiceLineId;
    private long invoice;
    private Track track;
    private Integer unitPrice;
    private Integer quantity;
}
