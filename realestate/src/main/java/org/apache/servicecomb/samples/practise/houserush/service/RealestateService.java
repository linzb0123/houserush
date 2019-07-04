package org.apache.servicecomb.samples.practise.houserush.service;

import org.apache.servicecomb.samples.practise.houserush.aggregate.Realestate;

public interface RealestateService {
    Realestate createRealesate(Realestate realestate);

    Realestate findRealestate(Integer id);

    Realestate updateRealestate(Realestate realestate);

    void removeRealestate(Integer id);
}
