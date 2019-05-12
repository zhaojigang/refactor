package firstDemo.refactor;

/**
 * 影片
 *
 * @author zhaojigang
 * @date 2019/5/12
 */
public class Movie {
    // 儿童片
    public static final int CHILDRENS = 2;
    // 普通片
    public static final int REGULAR = 0;
    // 新片
    public static final int NEW_RELEASE = 1;

    /**
     * 片名
     */
    private String title;
    /**
     * 上述三个常量之一
     */
    private Price price;

    public Movie(String title, int priceCode) {
        this.title = title;
        setPrice(priceCode);
    }

    // 获取当前租赁的影片所需花费的租金
    public double getCharge(int daysRented) {
        return price.getCharge(daysRented);
    }

    public int getFrequentRenterPoints(int daysRented) {
        return price.getFrequentRenterPoints(daysRented);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(int priceCode) {
        switch (priceCode) {
            case REGULAR:
                price = new RegularPrice();
                break;
            case NEW_RELEASE:
                price = new NewReleasePrice();
                break;
            case CHILDRENS:
                price = new ChildrensPrice();
                break;
            default:
                throw new IllegalArgumentException("unknown price code");
        }
    }
}
