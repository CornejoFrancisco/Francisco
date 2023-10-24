package com.dba.carrental.entities.transformations.CustomerMapper;

import com.dba.carrental.entities.Customer;
import com.dba.carrental.entities.dtoEntitie.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class CustomerMapper implements Function<CustomerDto, Customer> {
    @Override
    public Customer apply(CustomerDto customerDto) {
        return new Customer(
                customerDto.getCustomerId(),
                customerDto.getFirstName(),
                customerDto.getLastName(),
                customerDto.getCompany(),
                customerDto.getAddress(),
                customerDto.getCity(),
                customerDto.getState(),
                customerDto.getCountry(),
                customerDto.getPostalCode(),
                customerDto.getPhone(),
                customerDto.getFax(),
                customerDto.getEmail());
    }
}
