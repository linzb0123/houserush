package org.apache.servicecomb.samples.practise.houserush.api;

import org.apache.servicecomb.samples.practise.houserush.aggregate.Realestate;

public interface RealestateEndpoint {
    Realestate findRealestate(int id);
}
