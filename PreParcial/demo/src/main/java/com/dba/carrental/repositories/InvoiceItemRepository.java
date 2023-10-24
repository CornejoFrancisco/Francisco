package com.dba.carrental.repositories;

import com.dba.carrental.entities.Invoice_item;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceItemRepository
    extends JpaRepository<Invoice_item, Long> {
}
