package org.apache.servicecomb.samples.practise.houserush.sale.service;

import org.apache.servicecomb.samples.practise.houserush.sale.aggregate.HouseOrder;
import org.apache.servicecomb.samples.practise.houserush.sale.dao.HouseOrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HouseOrderServiceImpl implements HouseOrderService {
    @Autowired
    HouseOrderDao houseOrderDao;

    public HouseOrder createHouseOrder(HouseOrder houseOrder) {
        return houseOrderDao.save(houseOrder);
    }
}
