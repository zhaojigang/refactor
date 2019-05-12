package firstDemo.ref2;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 顾客
 *
 * @author zhaojigang
 * @date 2019/5/12
 */
public class Customer {
    // 顾客名字
    private String name;
    // 租的影片集合
    private Vector rentals = new Vector();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public String statement() {
        String result = "Rental Record for " + getName() + "\n";
        Enumeration rentalCollection = rentals.elements();
        while (rentalCollection.hasMoreElements()) {
            Rental each = (Rental)rentalCollection.nextElement();
            // 拼接当前影片的租金
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";
        }

        result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) + " frequent renter points";
        return result;
    }

    private double getTotalCharge(){
        double result = 0;
        Enumeration rentalCollection = rentals.elements();
        while (rentalCollection.hasMoreElements()) {
            Rental each = (Rental)rentalCollection.nextElement();
            result += each.getCharge();
        }
        return result;
    }

    private int getTotalFrequentRenterPoints(){
        int result = 0;
        Enumeration rentalCollection = rentals.elements();
        while (rentalCollection.hasMoreElements()) {
            Rental each = (Rental)rentalCollection.nextElement();
            result += each.getFrequentRenterPoints();
        }
        return result;
    }

    public String getName() {
        return name;
    }
}
