package com.dba.carrental.services.CustomerService;

import com.dba.carrental.entities.Customer;
import com.dba.carrental.entities.dtoEntitie.CustomerDto;
import com.dba.carrental.entities.transformations.CustomerMapper.CustomerDtoMapper;
import com.dba.carrental.entities.transformations.CustomerMapper.CustomerMapper;
import com.dba.carrental.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Service
public class CustomerServiceImpl implements CustomerService{
    private final CustomerDtoMapper customerDtoMapper;
    private final CustomerMapper customerMapper;
    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerDtoMapper customerDtoMapper, CustomerMapper customerMapper, CustomerRepository customerRepository) {
        this.customerDtoMapper = customerDtoMapper;
        this.customerMapper = customerMapper;
        this.customerRepository = customerRepository;
    }

    @Override
    public void add(CustomerDto entity) {
        CustomerDto customerDto = new CustomerDto();
        customerDto.setCustomerId(entity.getCustomerId());
        customerDto.setFirstName(entity.getFirstName());
        customerDto.setLastName(entity.getLastName());
        customerDto.setCity(entity.getCity());
        customerDto.setState(entity.getState());
        customerDto.setCountry(entity.getCountry());
        customerDto.setPostalCode(entity.getPostalCode());
        customerDto.setPhone(entity.getPhone());
        customerDto.setFax(entity.getFax());
        customerDto.setEmail(entity.getEmail());
    }

    @Override
    public CustomerDto getById(Long id) {
        Optional<Customer> customer = customerRepository.findById(id);
        return customer.map(customerDtoMapper).orElseThrow();
    }

    @Override
    public List<CustomerDto> getAll() {
        List<Customer> values = customerRepository.findAll();
        return values.stream().map(customerDtoMapper).toList();
    }

    @Override
    public CustomerDto delete(Long id) {
        Optional<Customer> optionalCustomer = customerRepository.findById(id);
        optionalCustomer.ifPresent(customerRepository::delete);
        return optionalCustomer.map(customerDtoMapper).orElseThrow();
    }

    @Override
    public void update(CustomerDto entity) {
        Optional<Customer> customer = Stream.of(entity)
                .map(customerMapper)
                .findAny();
        customer.ifPresent(customerRepository:: save);
    }
}
