/*
Brandyn Bosch  
Testing Assessment 2
Due 5 of MAY at 12am
 */
package testing.assessment.pkg2.brandynbosch;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TestingAssessment2BrandynBosch {

    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        car.setMakeYear(2016);
        car.setManufacturer("Ford");
        car.setModel("Falcon");
        car.print();

        car.refuel(new FuelPurchase(1.1, 5));
        car.print();

        car.travel(new Journey(100));
        car.print();

        car.refuel(new FuelPurchase(1.1, 8));
        car.print();

        car.travel(new Journey(300));
        car.print();

        car.serviceCar(new Service());
        car.print();

        try {
            car.rent(new PerDayRental(30, 5));
        } catch (ServiceRequiredException serviceRequiredException) {
            System.err.println(serviceRequiredException.getMessage());
        }
        car.print();

        try {
            car.rent(new PerKmRental(40));
        } catch (ServiceRequiredException serviceRequiredException) {
            System.err.println(serviceRequiredException.getMessage());
        }
        car.print();

        car.travel(new Journey(6000));
        car.print();

        try {
            car.rent(new PerKmRental(40));
        } catch (ServiceRequiredException serviceRequiredException) {
            System.err.println(serviceRequiredException.getMessage());
        }
        car.print();

        car.serviceCar(new Service());
        car.print();

        try {
            car.rent(new PerKmRental(40));
        } catch (ServiceRequiredException serviceRequiredException) {
            System.err.println(serviceRequiredException.getMessage());
        }
        car.print();
    }

}
