package org.apache.servicecomb.samples.practise.houserush.customer.manage.api;

import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.apache.servicecomb.samples.practise.houserush.customer.manage.service.CustomerManageService;
import org.apache.servicecomb.samples.practise.houserush.customer.manage.aggregate.Customer;
import org.apache.servicecomb.samples.practise.houserush.customer.manage.aggregate.Qualification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestSchema(schemaId = "customerManageApiRest")
@RequestMapping("/")
public class CustomerManageApiRestImpl implements CustomerManageApi {
    @Autowired
    private CustomerManageService customerManageService;


    @PostMapping("customers")
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerManageService.createCustomer(customer);
    }

    @GetMapping("customers/{id}")
    public Customer findCustomer(@PathVariable int id) {
        return customerManageService.findCustomer(id);
    }



    @PutMapping("customers/{id}")
    public Customer updateCustomer(@PathVariable int id, @RequestBody Customer customer) {
        customer.setId(id);
        return customerManageService.updateCustomer(customer);
    }

    @DeleteMapping("customers/{id}")
    public void removeCustomer(@PathVariable int id) {
        customerManageService.removeCustomer(id);
    }

    @GetMapping("customers")
    public List<Customer> indexCustomers() {
        return customerManageService.indexCustomers();
    }

    @PutMapping("customers/{id}/update_qualifications")
    public Customer updateCustomerQualifications(@PathVariable  int id, @RequestBody List<Qualification> qualifications) {
        Customer customer = customerManageService.findCustomer(id);
        customerManageService.updateCustomerQualifications(customer, qualifications);
        return customer;
    }


}
