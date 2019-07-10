package org.apache.servicecomb.samples.practise.houserush.customer.manage.dao;

import org.apache.servicecomb.samples.practise.houserush.customer.manage.aggregate.Qualification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QualificationDao extends JpaRepository<Qualification, Integer> {
}
