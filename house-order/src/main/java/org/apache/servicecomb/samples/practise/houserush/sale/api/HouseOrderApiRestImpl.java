package org.apache.servicecomb.samples.practise.houserush.sale.api;

import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.apache.servicecomb.samples.practise.houserush.sale.aggregate.HouseOrder;
import org.apache.servicecomb.samples.practise.houserush.sale.service.HouseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestSchema(schemaId = "houseOrderApiRest")
@RequestMapping("/")
public class HouseOrderApiRestImpl implements HouseOrderApi {
    @Autowired
    HouseOrderService houseOrderService;

    @PostMapping("/house_orders")
    public HouseOrder createHouseOrder(@RequestBody HouseOrder houseOrder) {
        return houseOrderService.createHouseOrder(houseOrder);
    }
}
