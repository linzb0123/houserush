package org.apache.servicecomb.samples.practise.houserush.sale.dao;

import org.apache.servicecomb.samples.practise.houserush.sale.aggregate.HouseOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseOrderDao extends JpaRepository<HouseOrder, Integer> {
}
