//package firstDemo.raw;
//
//import java.util.Enumeration;
//import java.util.Vector;
//
///**
// * 顾客
// *
// * @author zhaojigang
// * @date 2019/5/12
// */
//public class Customer {
//    // 顾客名字
//    private String _name;
//    // 租的影片集合
//    private Vector _rentals = new Vector();
//
//    public Customer(String name) {
//        this._name = name;
//    }
//
//    public void addRental(Rental arg) {
//        _rentals.add(arg);
//    }
//
//    public String statement() {
//        // 总租金
//        double totalAmount = 0;
//        // 常客积分
//        int frequentRenterPoints = 0;
//
//        Enumeration rentals = _rentals.elements();
//        String result = "Rental Record for " + getName() + "\n";
//
//        while (rentals.hasMoreElements()) {
//            double thisAmount = 0;
//            Rental each = (Rental)rentals.nextElement();
//
//            // 1. 计算当前影片的租金
//            switch (each.getMovie().getPriceCode()) {
//                case Movie.REGULAR:
//                    thisAmount += 2;
//                    if (each.getDaysRented() > 2) {
//                        thisAmount += (each.getDaysRented() - 2) * 1.5;
//                    }
//                    break;
//                case Movie.NEW_RELEASE:
//                    thisAmount += each.getDaysRented()*3;
//                    break;
//                case Movie.CHILDRENS:
//                    thisAmount += 1.5;
//                    if (each.getDaysRented()>3) {
//                        thisAmount += (each.getDaysRented() - 3) * 1.5;
//                    }
//                    break;
//            }
//
//            // 2. 计算当前影片可增加的常客积分
//            frequentRenterPoints ++;
//            if (each.getMovie().getPriceCode() == Movie.NEW_RELEASE && each.getDaysRented()>1) {
//                frequentRenterPoints ++;
//            }
//
//            // 拼接当前影片的租金
//            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";
//            totalAmount += thisAmount;
//        }
//
//        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
//        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
//        return result;
//    }
//
//
//    public String getName() {
//        return _name;
//    }
//}
