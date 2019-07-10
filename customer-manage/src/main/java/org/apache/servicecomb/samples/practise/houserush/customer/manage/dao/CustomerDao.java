package org.apache.servicecomb.samples.practise.houserush.customer.manage.dao;

import org.apache.servicecomb.samples.practise.houserush.customer.manage.aggregate.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDao extends JpaRepository<Customer, Integer> {
}
