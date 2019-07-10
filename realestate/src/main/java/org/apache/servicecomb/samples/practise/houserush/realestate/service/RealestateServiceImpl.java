package org.apache.servicecomb.samples.practise.houserush.realestate.service;

import org.apache.servicecomb.samples.practise.houserush.realestate.aggregate.Realestate;
import org.apache.servicecomb.samples.practise.houserush.realestate.dao.RealestateDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataRetrievalFailureException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


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

    @Transactional
    public Realestate updateRealestate(Realestate realestate) {
        int id = realestate.getId();
        if (realestateDao.exists(id)) {
            return realestateDao.save(realestate);
        }
        else {
            throw new DataRetrievalFailureException("cannot update the non-existed realestate");
        }
    }

    public void removeRealestate(Integer id) {
        realestateDao.delete(id);
    }
}
