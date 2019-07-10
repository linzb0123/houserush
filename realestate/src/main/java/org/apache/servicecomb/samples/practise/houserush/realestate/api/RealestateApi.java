package org.apache.servicecomb.samples.practise.houserush.realestate.api;

import org.apache.servicecomb.samples.practise.houserush.realestate.aggregate.Realestate;

public interface RealestateApi {
    Realestate createRealestate(Realestate realestate);

    Realestate findRealestate(int id);

    Realestate updateRealestate(int id, Realestate realestate);

    void removeRealestate(int id);
}
