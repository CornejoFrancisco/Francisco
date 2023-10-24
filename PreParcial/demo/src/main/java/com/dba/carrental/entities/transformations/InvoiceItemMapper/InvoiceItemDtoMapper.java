package com.dba.carrental.entities.transformations.InvoiceItemMapper;

import com.dba.carrental.entities.Invoice_item;
import com.dba.carrental.entities.dtoEntitie.InvoiceItemDto;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class InvoiceItemDtoMapper implements Function<Invoice_item, InvoiceItemDto> {
    @Override
    public InvoiceItemDto apply(Invoice_item invoiceItem) {
        return new InvoiceItemDto(
                invoiceItem.getInvoiceLineId(),
                invoiceItem.getInvoice().getInvoiceId(),
                invoiceItem.getTrack(),
                invoiceItem.getUnitPrice(),
                invoiceItem.getQuantity());
    }

}
