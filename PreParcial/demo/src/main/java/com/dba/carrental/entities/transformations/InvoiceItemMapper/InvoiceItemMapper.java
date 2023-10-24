package com.dba.carrental.entities.transformations.InvoiceItemMapper;


import com.dba.carrental.entities.Invoice_item;
import com.dba.carrental.entities.dtoEntitie.InvoiceItemDto;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class InvoiceItemMapper implements Function<InvoiceItemDto, Invoice_item> {
    @Override
    public Invoice_item apply(InvoiceItemDto invoiceItemDto) {
        return new Invoice_item(
                invoiceItemDto.getInvoiceLineId(),
                null,
                invoiceItemDto.getTrack(),
                invoiceItemDto.getUnitPrice(),
                invoiceItemDto.getQuantity());
    }
}
