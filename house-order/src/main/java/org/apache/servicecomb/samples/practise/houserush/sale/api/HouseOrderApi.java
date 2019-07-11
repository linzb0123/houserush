package org.apache.servicecomb.samples.practise.houserush.sale.api;

import org.apache.servicecomb.samples.practise.houserush.sale.aggregate.HouseOrder;

public interface HouseOrderApi {
    HouseOrder createHouseOrder(HouseOrder houseOrder);
}
