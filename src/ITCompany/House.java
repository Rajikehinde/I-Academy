package ITCompany;

public class House extends HouseRentalManagement{
    private int numberOfFloors;
    private double yardSize;

    public House(String propertyCode, String location, int noOfBedrooms, int noOfBathrooms, double rentPerMonth, boolean isOccupiedStatus, PropertyCode property, int numberOfFloors, double yardSize) {
        super(propertyCode, location, noOfBedrooms, noOfBathrooms, rentPerMonth, isOccupiedStatus, property);
        this.numberOfFloors = numberOfFloors;
        this.yardSize = yardSize;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public double getYardSize() {
        return yardSize;
    }

    public void setYardSize(double yardSize) {
        this.yardSize = yardSize;
    }

    @Override
    public double rentalIncome() {
        return getRentPerMonth() * getNoOfBedrooms() * getNumberOfFloors();
    }

    @Override
    public String toString() {
        return "House{" +
                "numberOfFloors=" + numberOfFloors +
                ", yardSize=" + yardSize +
                "} " + super.toString();
    }
}
