package org.apache.servicecomb.samples.practise.houserush.sale.dao;

import org.apache.servicecomb.samples.practise.houserush.sale.aggregate.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleDao extends JpaRepository<Sale, Integer> {
}
