package org.apache.servicecomb.samples.practise.houserush.dao;

import org.apache.servicecomb.samples.practise.houserush.aggregate.Building;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuildingDao extends JpaRepository<Building, Integer> {
}
