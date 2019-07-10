package org.apache.servicecomb.samples.practise.houserush.customer.manage.api;

import org.apache.servicecomb.samples.practise.houserush.customer.manage.aggregate.Customer;
import org.apache.servicecomb.samples.practise.houserush.customer.manage.aggregate.Qualification;

import java.util.List;

public interface CustomerManageApi {
    Customer createCustomer(Customer customer);

    Customer findCustomer(int id);

    Customer updateCustomer(int id, Customer customer);

    void removeCustomer(int id);

    Customer updateCustomerQualifications(int id, List<Qualification> qualifications);
}
