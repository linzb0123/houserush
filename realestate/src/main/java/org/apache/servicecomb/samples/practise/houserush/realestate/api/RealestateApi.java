package org.apache.servicecomb.samples.practise.houserush.realestate.api;

import org.apache.servicecomb.samples.practise.houserush.realestate.aggregate.Building;
import org.apache.servicecomb.samples.practise.houserush.realestate.aggregate.House;
import org.apache.servicecomb.samples.practise.houserush.realestate.aggregate.Realestate;

import java.util.List;

public interface RealestateApi {
    Realestate createRealestate(Realestate realestate);

    Realestate findRealestate(int id);

    Realestate updateRealestate(int id, Realestate realestate);

    void removeRealestate(int id);

    List<Realestate> indexRealestates();



    Building createBuilding(int realestateId, Building building);

    Building findBuilding(int realestateId, int id);

    Building updateBuilding(int realestateId, int id, Building building);

    void removeBuilding(int realestateId, int id);

    List<Building> indexBuildings(int realestateId);



    House createHouse(int buidingId, House house);

    House findHouse(int buildingId, int id);

    House updateHouse(int buildingId, int id, House house);

    void removeHouse(int buildingId, int id);

    List<House> indexHouses(int buildingId);




}
