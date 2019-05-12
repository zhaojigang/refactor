package firstDemo.ref3;

/**
 * @author zhaojigang
 * @date 2019/5/12
 */
public class MovieFactory {
    public static Movie createMovie(String title, int priceCode) {
        switch (priceCode) {
            case Movie.CHILDRENS:
                return new ChildrensMovie(title);
            case Movie.NEW_RELEASE:
                return new NewReleaseMovie(title);
            case Movie.REGULAR:
                return new RegularMovie(title);
            default:
                throw new IllegalArgumentException("unknown price code");
        }
    }
}
