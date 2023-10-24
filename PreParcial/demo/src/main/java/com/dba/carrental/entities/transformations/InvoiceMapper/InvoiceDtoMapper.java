package com.dba.carrental.entities.transformations.InvoiceMapper;

import com.dba.carrental.entities.Invoice;
import com.dba.carrental.entities.dtoEntitie.InvoiceDto;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class InvoiceDtoMapper implements Function<Invoice, InvoiceDto> {
    @Override
    public InvoiceDto apply(Invoice invoice) {
        return new InvoiceDto(
                invoice.getInvoiceId(),
                invoice.getCustomer().getCustomerId(),
                invoice.getInvoiceDate(),
                invoice.getBilingAddress(),
                invoice.getBilingCity(),
                invoice.getBilingState(),
                invoice.getBilingCountry(),
                invoice.getBilingPostalCode(),
                invoice.getTotal()
        );
    }
}
