package org.apache.servicecomb.samples.practise.houserush.customer.manage.api;

import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.apache.servicecomb.samples.practise.houserush.customer.manage.aggregate.Customer;
import org.apache.servicecomb.samples.practise.houserush.customer.manage.aggregate.Qualification;
import org.apache.servicecomb.samples.practise.houserush.customer.manage.service.CustomerManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Path;
import java.util.List;

@RestSchema(schemaId = "customerManageApiRest")
@RequestMapping("/")
public class CustomerManageApiRestImpl implements CustomerManageApi {
    @Autowired
    private CustomerManageService customerManageService;

    @PostMapping("/customers")
    public Customer createCustomer(Customer customer) {
        return customerManageService.createCustomer(customer);
    }

    @GetMapping("/customers/{id}")
    public Customer findCustomer(@PathVariable int id) {
        return customerManageService.findCustomer(id);
    }

    @PutMapping("customers/{id}")
    public Customer updateCustomer(@PathVariable int id, Customer customer) {
        customer.setId(id);
        return customerManageService.updateCustomer(customer);
    }

    @DeleteMapping("customers/{id}")
    public void removeCustomer(int id) {
        customerManageService.removeCustomer(id);

    }

    @PutMapping("customers/{id}")
    public Customer updateCustomerQualifications(int id, List<Qualification> qualifications) {
        Customer customer = customerManageService.findCustomer(id);
        customerManageService.updateCustomerQualifications(customer, qualifications);
        return customer;
    }
}
