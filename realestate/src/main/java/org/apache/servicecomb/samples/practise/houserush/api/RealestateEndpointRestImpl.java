package org.apache.servicecomb.samples.practise.houserush.api;

import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.apache.servicecomb.samples.practise.houserush.aggregate.Realestate;
import org.apache.servicecomb.samples.practise.houserush.service.RealestateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@RestSchema(schemaId = "realestateEndpointRest")
@RequestMapping("/")
public class RealestateEndpointRestImpl implements RealestateEndpoint {

    @Autowired
    private  RealestateService realestateService;



    @GetMapping("/realestates/{id}")
    public Realestate findRealestate(@PathVariable("id") int id) {
        return realestateService.findRealestate(id);
    }
}
