package org.apache.servicecomb.samples.practise.houserush.realestate.dao;

import org.apache.servicecomb.samples.practise.houserush.realestate.aggregate.House;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseDao extends JpaRepository<House, Integer> {

}
