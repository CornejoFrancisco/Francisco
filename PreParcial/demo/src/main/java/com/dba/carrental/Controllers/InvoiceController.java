package com.dba.carrental.Controllers;


import com.dba.carrental.entities.dtoEntitie.CustomerDto;
import com.dba.carrental.entities.dtoEntitie.InvoiceDto;
import com.dba.carrental.services.InoviceService.InvoiceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/invoice")
public class InvoiceController {
    private final InvoiceService invoiceService;
    public InvoiceController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @GetMapping
    public ResponseEntity<List<InvoiceDto>> getAll() {
        List<InvoiceDto> values = invoiceService.getAll();
        return ResponseEntity.ok(values);
    }

    @GetMapping("/{id}")
    public ResponseEntity<InvoiceDto> getById(@PathVariable("id") Long id) {
        InvoiceDto value = invoiceService.getById(id);
        return ResponseEntity.ok(value);
    }
    @PostMapping
    public ResponseEntity<Void> add(@RequestBody InvoiceDto entity) {
        invoiceService.add(entity);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    @PutMapping()
    public ResponseEntity<InvoiceDto> update(@RequestBody InvoiceDto entity) {
        invoiceService.add(entity);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<InvoiceDto> delete(@PathVariable("id") Long id) {
        invoiceService.delete(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
