package com.dba.carrental.entities.transformations.CustomerMapper;

import com.dba.carrental.entities.Customer;
import com.dba.carrental.entities.dtoEntitie.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.function.Function;
@Service
public class CustomerDtoMapper implements Function<Customer, CustomerDto> {
    @Override
    public CustomerDto apply(Customer customer) {
        return new CustomerDto(
                customer.getCustomerId(),
                customer.getFirstName(),
                customer.getLastName(),
                customer.getCompany(),
                customer.getAddress(),
                customer.getCity(),
                customer.getState(),
                customer.getCountry(),
                customer.getPostalCode(),
                customer.getPhone(),
                customer.getFax(),
                customer.getEmail()
        );
    }
}
