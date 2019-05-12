package firstDemo.ref2;

/**
 * 租赁一部影片
 *
 * @author zhaojigang
 * @date 2019/5/12
 */
public class Rental {
    // 租的影片
    private Movie movie;
    // 租的时长
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    // 1. 获取当前租赁的影片所需花费的租金
    public double getCharge() {
        return movie.getCharge(daysRented);
    }

    // 2. 计算当前影片可增加的常客积分
    public int getFrequentRenterPoints() {
        return movie.getFrequentRenterPoints(daysRented);
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public int getDaysRented() {
        return daysRented;
    }
}
