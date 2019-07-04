package org.apache.servicecomb.samples.practise.houserush.dao;

import org.apache.servicecomb.samples.practise.houserush.aggregate.Realestate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RealestateDao extends JpaRepository<Realestate, Integer> {
}
