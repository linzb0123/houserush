package org.apache.servicecomb.samples.practise.houserush.sale.service;

import org.apache.servicecomb.samples.practise.houserush.sale.aggregate.HouseOrder;

public interface HouseOrderService {
    HouseOrder createHouseOrder(HouseOrder houseOrder);
}
