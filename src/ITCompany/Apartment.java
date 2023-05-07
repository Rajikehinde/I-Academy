package ITCompany;

public class Apartment extends HouseRentalManagement{

    private int floorNumber;

    public Apartment(String propertyCode, String location, int noOfBedrooms, int noOfBathrooms, double rentPerMonth, boolean isOccupiedStatus, PropertyCode property, int floorNumber) {
        super(propertyCode, location, noOfBedrooms, noOfBathrooms, rentPerMonth, isOccupiedStatus, property);
        this.floorNumber = floorNumber;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public double rentalIncome() {
        return getNoOfBedrooms() * getRentPerMonth();
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "floorNumber=" + floorNumber +
                "} " + super.toString();
    }
}
