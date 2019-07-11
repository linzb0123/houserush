package org.apache.servicecomb.samples.practise.houserush.realestate.api;

import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.apache.servicecomb.samples.practise.houserush.realestate.aggregate.Realestate;
import org.apache.servicecomb.samples.practise.houserush.realestate.service.RealestateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestSchema(schemaId = "realestateApiRest")
@RequestMapping("/")
public class RealestateApiRestImpl implements RealestateApi {

    @Autowired
    private RealestateService realestateService;

    @PostMapping("/realestates")
    public Realestate createRealestate(@RequestBody Realestate realestate) {
        return realestateService.createRealesate(realestate);
    }

    @GetMapping("/realestates/{id}")
    public Realestate findRealestate(@PathVariable("id") int id) {
        return realestateService.findRealestate(id);
    }

    @PutMapping("realestates/{id}")
    public Realestate updateRealestate(@PathVariable("id") int id, @RequestBody Realestate realestate) {
        realestate.setId(id);
        return realestateService.updateRealestate(realestate);
    }

    @DeleteMapping("realestates/{id}")
    public void removeRealestate(@PathVariable("id") int id) {
        realestateService.removeRealestate(id);
    }

}
