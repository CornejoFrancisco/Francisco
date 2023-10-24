package com.dba.carrental.entities.transformations.InvoiceMapper;

import com.dba.carrental.entities.Invoice;
import com.dba.carrental.entities.dtoEntitie.InvoiceDto;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class InvoiceMapper implements Function<InvoiceDto, Invoice> {
    @Override
    public Invoice apply(InvoiceDto invoiceDto) {
        return new Invoice(
                invoiceDto.getInvoiceId(),
                null,
                invoiceDto.getInvoiceDate(),
                invoiceDto.getBilingAddress(),
                invoiceDto.getBilingCity(),
                invoiceDto.getBilingState(),
                invoiceDto.getBilingCountry(),
                invoiceDto.getBilingPostalCode(),
                invoiceDto.getTotal()
        );
    }
}
