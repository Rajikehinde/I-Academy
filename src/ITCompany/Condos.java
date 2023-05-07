package ITCompany;

public class Condos extends HouseRentalManagement{
    private int noOfFloors;
    private String amenities;

    public Condos(String propertyCode, String location, int noOfBedrooms, int noOfBathrooms, double rentPerMonth, boolean isOccupiedStatus, PropertyCode property, int noOfFloors, String amenities) {
        super(propertyCode, location, noOfBedrooms, noOfBathrooms, rentPerMonth, isOccupiedStatus, property);
        this.noOfFloors = noOfFloors;
        this.amenities = amenities;
    }

    public int getNoOfFloors() {
        return noOfFloors;
    }

    public void setNoOfFloors(int noOfFloors) {
        this.noOfFloors = noOfFloors;
    }

    public String getAmenities() {
        return amenities;
    }

    public void setAmenities(String amenities) {
        this.amenities = amenities;
    }

    @Override
    public double rentalIncome() {
        return getNoOfFloors() * getNoOfBedrooms() * getRentPerMonth();
    }

    @Override
    public String toString() {
        return "Condos{" +
                "noOfFloors=" + noOfFloors +
                ", amenities='" + amenities + '\'' +
                "} " + super.toString();
    }
}
