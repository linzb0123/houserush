package org.apache.servicecomb.samples.practise.houserush.service;

import org.apache.servicecomb.samples.practise.houserush.aggregate.Realestate;
import org.apache.servicecomb.samples.practise.houserush.dao.RealestateDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RealestateServiceImpl implements RealestateService {
    @Autowired
    private RealestateDao realestateDao;

    public Realestate createRealesate(Realestate realestate) {
        return realestateDao.save(realestate);
    }

    public Realestate findRealestate(Integer id) {
        return realestateDao.findOne(id);

    }

    public Realestate updateRealestate(Realestate realestate) {
        return realestateDao.save(realestate);
    }

    public void removeRealestate(Integer id) {
        realestateDao.delete(id);
    }
}
