package firstDemo.refactor;

/**
 * @author zhaojigang
 * @date 2019/5/12
 */
public abstract class Price {
    public abstract int getPriceCode();

    public abstract double getCharge(int daysRented);

    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
