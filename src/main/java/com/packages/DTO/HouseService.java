package com.packages.DTO;

public class HouseService {

    public double calculateHousePrice(Long houseId){
        //Here the service could retrieve the dto with a call to the repository, passing the houseId, and only returning
        //the data that is required, floors, coveredArea, and State
        HouseDto houseDto = null;
        double price = switch (houseDto.state()){
            case "Spain" -> houseDto.coveredArea() * houseDto.floors();
            case "Italy" -> houseDto.coveredArea() * houseDto.floors() * 1.5;
            case "Germany" -> houseDto.coveredArea() * houseDto.floors() * 0.8;
            default -> houseDto.coveredArea() * houseDto.floors() * 1.1;
        };
        return price;
    }
}
