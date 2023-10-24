package com.dba.carrental.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "invoice_items")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Invoice_item {
    @Id
    @GeneratedValue(generator = "invoice_items")
    @TableGenerator(name = "invoice_items", table = "sqlite_sequence",
            pkColumnName = "name", valueColumnName = "seq",
            pkColumnValue="Invoice_items",
            initialValue=1, allocationSize=1)

    private long InvoiceLineId;

    @ManyToOne
    @JoinColumn(name = "InvoiceId")
    private Invoice invoice;

    @ManyToOne
    @JoinColumn(name = "TrackId")
    private Track track;

    @Column(name = "UnitPrice")
    private Integer unitPrice;
    @Column(name = "Quantity")
    private Integer quantity;

}
