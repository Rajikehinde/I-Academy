package ITCompany;

import java.util.Arrays;

public class Rental {
    private HouseRentalManagement[] properties;
    private int size;

    public Rental(int capacity) {
        properties = new HouseRentalManagement[capacity];
        size = 0;
    }

    public void addProperty(HouseRentalManagement property) {
        if (size < properties.length) {
            properties[size++] = property;
        } else {
            System.out.println("Cannot add property - Repository is full");
        }
    }

    public void deleteProperty(String propertyId) {
        for (int i = 0; i < size; i++) {
            if (properties[i].getPropertyCode().equals(propertyId)) {
                properties[i] = properties[size - 1];
                properties[size - 1] = null;
                size--;
                break;
            }
        }
    }

    public void updateProperty(String propertyid, HouseRentalManagement property) {
        for (int i = 0; i < size; i++) {
            if (properties[i].getPropertyCode().equals(propertyid)) {
                properties[i] = property;
                break;
            }
        }
    }

    public HouseRentalManagement viewProperty(String propertyId) {
        for (int i = 0; i < size; i++) {
            if (properties[i].getPropertyCode().equals(propertyId)) {
                return properties[i];
            }
        }
        return null;
    }

    public HouseRentalManagement[] viewAllProperties() {
        HouseRentalManagement[] allProperties = new HouseRentalManagement[size];
        for (int i = 0; i < size; i++) {
            allProperties[i] = properties[i];
        }
        return allProperties;
    }

    public Apartment[] viewAllApartments() {
        int apaCount= 0;
        for (int i = 0; i < size; i++) {
            if (properties[i] instanceof Apartment) {
                apaCount++;
            }
        }
        Apartment[] apartments = new Apartment[apaCount];
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (properties[i] instanceof Apartment) {
                apartments[j] = (Apartment) properties[i];
                j++;
            }
        }
        return apartments;
    }

    public House[] viewAllHouses() {
        int houCount= 0;
        for (int i = 0; i < size; i++) {
            if (properties[i] instanceof House) {
                houCount++;
            }
        }
        House[] houses = new House[houCount];
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (properties[i] instanceof House) {
                houses[j] = (House) properties[i];
                j++;
            }
        }
        return houses;
    }

    public Condos[] viewAllCondos() {
        int conCount= 0;
        for (int i = 0; i < size; i++) {
            if (properties[i] instanceof Condos) {
                conCount++;
            }
        }
        Condos[] condos = new Condos[conCount];
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (properties[i] instanceof Condos) {
                condos[j] = (Condos) properties[i];
                j++;
            }
        }
        return condos;
    }

    public HouseRentalManagement[] getAllOccupiedProperties() {
        int occupiedCount = 0;
        for (int i = 0; i < size; i++) {
            if (properties[i].isOccupiedStatus()) {
                occupiedCount++;
            }
        }
        HouseRentalManagement[] occupiedProperties = new HouseRentalManagement[occupiedCount];
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (properties[i].isOccupiedStatus()) {
                occupiedProperties[j] = properties[i];
                j++;
            }
        }
        return occupiedProperties;
    }

    public HouseRentalManagement[] getAllUnoccupiedProperties() {
        int unOccupiedCount = 0;
        for (int i = 0; i < size; i++) {
            if (!properties[i].isOccupiedStatus()) {
                unOccupiedCount++;
            }
        }
        HouseRentalManagement[] unOccupiedProperties = new HouseRentalManagement[unOccupiedCount];
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (!properties[i].isOccupiedStatus()) {
                unOccupiedProperties[j] = properties[i];
                j++;
            }
        }
        return unOccupiedProperties;
    }

    public HouseRentalManagement[] searchByLocation(String location) {
        HouseRentalManagement[] matchingProperties = new HouseRentalManagement[size];
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (properties[i].getLocation().equalsIgnoreCase(location)) {
                matchingProperties[index] = properties[i];
                index++;
            }
        }

        return Arrays.copyOf(matchingProperties, index);
    }

    public HouseRentalManagement searchByPropertyCode(String propertyCode) {
        for (HouseRentalManagement property: properties) {
            if (property.getPropertyCode().equals(propertyCode)){
                return property;
            }
        }
        return null;
    }

    public int getTotalNumberOfProperties() {
        HouseRentalManagement[] properties = new HouseRentalManagement[size];
        int count = 0;
        for (HouseRentalManagement property: properties) {
            count++;

        }
        return count;
    }

    public int getTotalNumberofApartments() {
        int count = 0;
        for (HouseRentalManagement property: properties) {
            if (property instanceof Apartment) {
                count++;
            }
        }
        return count;
    }

    public int getTotalNumberOfBedroomsInApartments() {
        int count = 0;
        for (HouseRentalManagement property: properties) {
            if (property instanceof Apartment) {
                count += ((Apartment) property).getNoOfBedrooms();
            }
        }
        return count;
    }

    public int getTotalNumberOfBathroomsInApartments() {
        int count = 0;
        for (HouseRentalManagement property: properties) {
            if (property instanceof Apartment) {
                count += ((Apartment) property).getNoOfBathrooms();
            }
        }
        return count;
    }

    public double getTotalRentalIncomePerMonthFromApartments() {
        double totalIncome = 0.0;
        for (HouseRentalManagement property : properties) {
            if (property instanceof Apartment && property.isOccupiedStatus()) {
                totalIncome += ((Apartment) property).rentalIncome();
            }
        }
        return totalIncome;
    }

    public int getTotalNumberOfOccupiedApartments() {
        int count = 0;
        for (HouseRentalManagement property: properties) {
            if (property instanceof Apartment && property.isOccupiedStatus()) {
                count++;
            }
        }
        return count;
    }

    public int getTotalNumberOfUnoccupiedApartments() {
        int count = 0;
        for (HouseRentalManagement property: properties) {
            if (property instanceof Apartment && !property.isOccupiedStatus()) {
                count++;
            }
        }
        return count;
    }

    public int getTotalNumberOfAllCondos() {
        int count = 0;
        for (HouseRentalManagement property: properties) {
            if (property instanceof Condos) {
                count++;
            }
        }
        return count;
    }

    public int getTotalNumberOfBedroomInCondos() {
        int count = 0;
        for (HouseRentalManagement property: properties) {
            if (property instanceof Condos) {
                count += ((Condos) property).getNoOfBedrooms();
            }
        }
        return count;
    }

    public int getTotalNumberOfBathroomInCondos() {
        int count = 0;
        for (HouseRentalManagement property: properties) {
            if (property instanceof Condos) {
                count += ((Condos) property).getNoOfBathrooms();
            }
        }
        return count;
    }

    public double getTotalRentalIncomePerMonthForCondos() {
        double totalIncome = 0.0;
        for (HouseRentalManagement property: properties) {
            if (property instanceof  Condos && property.isOccupiedStatus()) {
                totalIncome += ((Condos) property).rentalIncome();
            }
        }
        return totalIncome;
    }

    public int getTotalNumberOfOccupiedCondos() {
        int count = 0;
        for (HouseRentalManagement property: properties) {
            if (property instanceof Condos && property.isOccupiedStatus()) {
                count++;
            }
        }
        return count;
    }

    public int getTotalNumberOfUnoccupiedCondos() {
        int count = 0;
        for (HouseRentalManagement property: properties) {
            if (property instanceof Condos && !property.isOccupiedStatus()) {
                count++;
            }
        }
        return count;
    }

    public int getTotalNumberOfAllHouses() {
        int count = 0;
        for (HouseRentalManagement property: properties) {
            if (property instanceof House) {
                count++;
            }
        }
        return count;
    }

    public int getTotalNumberOfBedroomInHouses() {
        int count = 0;
        for (HouseRentalManagement property: properties) {
            if (property instanceof House) {
                count += ((House) property).getNoOfBedrooms();
            }
        }
        return count;
    }

    public int getTotalNumberOfBathroomInHouses() {
        int count = 0;
        for (HouseRentalManagement property: properties) {
            if (property instanceof House) {
                count += ((House) property).getNoOfBathrooms();
            }
        }
        return count;
    }

    public double getTotalRentalIncomePerMonthForHouses() {
        double totalIncome = 0.0;
        for (HouseRentalManagement property: properties) {
            if (property instanceof  House && property.isOccupiedStatus()) {
                totalIncome += ((House) property).rentalIncome();
            }
        }
        return totalIncome;
    }

    public int getTotalNumberOfOccupiedHouses() {
        int count = 0;
        for (HouseRentalManagement property: properties) {
            if (property instanceof House && property.isOccupiedStatus()) {
                count++;
            }
        }
        return count;
    }

    public int getTotalNumberOfUnoccupiedHouses() {
        int count = 0;
        for (HouseRentalManagement property: properties) {
            if (property instanceof House && !property.isOccupiedStatus()) {
                count++;
            }
        }
        return count;
    }
}
