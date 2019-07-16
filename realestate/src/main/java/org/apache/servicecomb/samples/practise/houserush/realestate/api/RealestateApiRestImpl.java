package org.apache.servicecomb.samples.practise.houserush.realestate.api;

import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.apache.servicecomb.samples.practise.houserush.realestate.aggregate.Building;
import org.apache.servicecomb.samples.practise.houserush.realestate.aggregate.House;
import org.apache.servicecomb.samples.practise.houserush.realestate.aggregate.Realestate;
import org.apache.servicecomb.samples.practise.houserush.realestate.service.RealestateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataRetrievalFailureException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("realestates")
    public List<Realestate> indexRealestates() {
        return realestateService.indexRealestates();
    }



    @PostMapping("realestates/{realestateId}/buildings")
    public Building createBuilding(@PathVariable("realestateId") int realestateId, Building building) {
        return realestateService.createBuilding(realestateId, building);
    }

    @GetMapping("realestates/{realestateId}/buildings/{id}")
    public Building findBuilding(@PathVariable("realestateId") int realestateId, @PathVariable("id") int id) {
        return realestateService.findBuilding(realestateId, id);
    }

    @PutMapping("realestates/{realestateId}/buildings/{id}")
    public Building updateBuilding(@PathVariable("realestateId") int realestateId, @PathVariable("id") int id, Building building) {
        building.setId(id);
        return realestateService.updateBuilding(realestateId, building);
    }

    @DeleteMapping("realestates/{realestateId}/buildings/{id}")
    public void removeBuilding(@PathVariable("realestateId") int realestateId, @PathVariable("id") int id) {
        realestateService.removeBuilding(realestateId, id);
    }

    @GetMapping("realestates/{realestateId}/buildings")
    public List<Building> indexBuildings(@PathVariable("realestateId") int realestateId) {
        return realestateService.indexBuildings(realestateId);
    }

    @PostMapping("buildings/{realestateId}/houses/{id}")
    public House createHouse(@PathVariable("buildingId") int buildingId, House house) {
        return realestateService.createHouse(buildingId, house);
    }

    @GetMapping("buildings/{buildId}/houses/{id}")
    public House findHouse(@PathVariable("buildingId") int buildingId, @PathVariable("id") int id) {
        return realestateService.findHouse(buildingId, id);
    }

    @PutMapping("buildings/{buildId}/houses/{id}")
    public House updateHouse(@PathVariable("buildingId") int buildingId,@PathVariable("id") int id, House house) {
        house.setId(id);
        return realestateService.updateHouse(buildingId, house);
    }

    @DeleteMapping("buildings/{buildingId}/houses/{id}")
    public void removeHouse(@PathVariable("buildingId") int buildingId,@PathVariable("id") int id) {
        realestateService.removeHouse(buildingId, id);
    }

    @GetMapping("buildings/{buildingId}/houses")
    public List<House> indexHouses(@PathVariable("buildingId") int buildingId) {
        return realestateService.indexHouses(buildingId);
    }
}
