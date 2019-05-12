package firstDemo.ref2;

/**
 * 影片
 *
 * @author zhaojigang
 * @date 2019/5/12
 */
public abstract class Movie {
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
