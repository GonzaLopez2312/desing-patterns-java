package com.packages.DTO;

public class HouseController {

    private HouseService houseService;

    public HouseController(HouseService houseService) {
        this.houseService = houseService;
    }

    public double getHousePrice(Long houseId){
        return houseService.calculateHousePrice(houseId);
    }
}
