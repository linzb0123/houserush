package org.apache.servicecomb.samples.practise.houserush.dao;

import org.apache.servicecomb.samples.practise.houserush.aggregate.House;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseDao extends JpaRepository<House, Integer> {

}
