package firstDemo.ref3;

/**
 * 影片
 *
 * @author zhaojigang
 * @date 2019/5/12
 */
public abstract class Movie {
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
    public Movie(String title) {
        this.title = title;
    }

    // 计算租金
    public abstract double getCharge(int daysRented);

    // 计算积分
    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
