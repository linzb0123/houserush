package org.apache.servicecomb.samples.practise.houserush.customer.manage.service;

import org.apache.servicecomb.samples.practise.houserush.customer.manage.aggregate.Customer;
import org.apache.servicecomb.samples.practise.houserush.customer.manage.aggregate.Qualification;

import java.util.List;

public interface CustomerManageService {
    Customer createCustomer(Customer customer);

    Customer findCustomer(int id);

    Customer updateCustomer(Customer customer);

    void removeCustomer(int id);

    boolean updateCustomerQualifications(Customer customer, List<Qualification> qualifications);
}
