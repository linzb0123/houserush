package org.apache.servicecomb.samples.practise.houserush.customer.manage.service;

;
import org.apache.servicecomb.samples.practise.houserush.customer.manage.aggregate.Customer;
import org.apache.servicecomb.samples.practise.houserush.customer.manage.aggregate.Qualification;
import org.apache.servicecomb.samples.practise.houserush.customer.manage.dao.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataRetrievalFailureException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerManageServiceImpl implements CustomerManageService {
    @Autowired
    private CustomerDao customerDao;

    @Override
    public Customer createCustomer(Customer customer) {
        return customerDao.save(customer);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        int id = customer.getId();
        if (customerDao.exists(id)) {
            return customerDao.save(customer);
        }
        else {
            throw new DataRetrievalFailureException("cannot update the non-existed customer");
        }
    }

    @Override
    public Customer findCustomer(int id) {
        return customerDao.findOne(id);
    }

    @Override
    public void removeCustomer(int id) {
        customerDao.delete(id);
    }

    @Override
    public List<Customer> indexCustomers() {
        return customerDao.findAll();
    }

    @Override
    public boolean updateCustomerQualifications(Customer customer, List<Qualification> qualifications) {
        customer.setQualifications(qualifications);
        customerDao.save(customer);
        return true;
    }
}
