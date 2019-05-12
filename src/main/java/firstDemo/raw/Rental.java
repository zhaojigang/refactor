package firstDemo.raw;

/**
 * 租赁一部影片
 *
 * @author zhaojigang
 * @date 2019/5/12
 */
public class Rental {
    // 租的影片
    private Movie _movie;
    // 租的时长
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        this._movie = movie;
        this._daysRented = daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    public int getDaysRented() {
        return _daysRented;
    }
}
