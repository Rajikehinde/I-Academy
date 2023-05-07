package ITCompany;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        HouseRentalManagement apa1 = new Apartment("1", "Ibadan", 5,
                3, 5000, true, PropertyCode.APA, 2);
        HouseRentalManagement apa2 = new Apartment("2", "Abeokuta", 3,
                2, 450, false, PropertyCode.APA, 2);
        HouseRentalManagement apa3 = new Apartment("3", "Oshogbo", 3,
                2, 4500, false, PropertyCode.APA, 2);
        HouseRentalManagement apa4 = new Apartment("4", "Jos", 3,
                2, 500, true, PropertyCode.APA, 2);
        HouseRentalManagement apa5 = new Apartment("5", "Owerri", 3,
                2, 4500, true, PropertyCode.APA, 2);
        HouseRentalManagement apa6 = new Apartment("6", "Kaduna", 3,
                2, 4500, false, PropertyCode.APA, 2);
        HouseRentalManagement apa7 = new Apartment("7", "Abuja", 3,
                2, 450000, true, PropertyCode.APA, 2);
        HouseRentalManagement apa8 = new Apartment("8", "Akwa", 3,
                2, 4500, true, PropertyCode.APA, 2);
        HouseRentalManagement condos1 = new Condos("1", "Uyo", 3, 2,
                3500, true, PropertyCode.CON, 4, "Pool");
        HouseRentalManagement condos2 = new Condos("1", "Yenegua", 3, 2,
                35000, false, PropertyCode.CON, 4, "Pool");
        HouseRentalManagement condos3 = new Condos("2", "Yola", 3, 2,
                1500, true, PropertyCode.CON, 4, "Pool");
        HouseRentalManagement house1 = new House("1", "Maiduguri", 3, 2,
                300, true, PropertyCode.HOU, 4, 3.5);
        HouseRentalManagement house2 = new House("2", "Mina", 3, 2,
                10000, true, PropertyCode.HOU, 4, 3.5);

        Rental rentalRepo = new Rental(20);

        rentalRepo.addProperty(apa1);
        rentalRepo.addProperty(apa2);
        rentalRepo.addProperty(apa3);
        rentalRepo.addProperty(apa4);
        rentalRepo.addProperty(apa5);
        rentalRepo.addProperty(apa6);
        rentalRepo.addProperty(apa7);
        rentalRepo.addProperty(apa8);
        rentalRepo.addProperty(house1);
        rentalRepo.addProperty(house2);
        rentalRepo.addProperty(condos1);
        rentalRepo.addProperty(condos2);
        rentalRepo.addProperty(condos3);

        rentalRepo.deleteProperty("APA001");

        HouseRentalManagement newApa2 = new Apartment("2", "Ijaiye", 3,
                4, 2000, false, PropertyCode.APA, 2);
        rentalRepo.updateProperty("APA002",newApa2);
        System.out.println(apa2);


//             get all properties from the repo
        HouseRentalManagement[] properties = rentalRepo.viewAllProperties();

        // print the property details
        for (HouseRentalManagement property: properties) {
            System.out.println(property.toString());
        }

        System.out.println(Arrays.toString(rentalRepo.viewAllProperties()));

        System.out.println(Arrays.toString(rentalRepo.viewAllApartments()));
        System.out.println(Arrays.toString(rentalRepo.viewAllHouses()));
        System.out.println(Arrays.toString(rentalRepo.viewAllCondos()));
        System.out.println(Arrays.toString(rentalRepo.getAllOccupiedProperties()));
        System.out.println(Arrays.toString(rentalRepo.getAllUnoccupiedProperties()));
        System.out.println(Arrays.toString(rentalRepo.searchByLocation("Apapa")));
        System.out.println(rentalRepo.getTotalNumberOfProperties());
        System.out.println(rentalRepo.getTotalNumberofApartments());
        System.out.println(rentalRepo.getTotalNumberOfBedroomsInApartments());
        System.out.println(rentalRepo.getTotalNumberOfBathroomsInApartments());
        System.out.println(rentalRepo.getTotalRentalIncomePerMonthFromApartments());
        System.out.println(rentalRepo.getTotalNumberOfOccupiedApartments());
        System.out.println(rentalRepo.getTotalNumberOfUnoccupiedApartments());

    }
}
