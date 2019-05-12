import firstDemo.raw.Customer;
import firstDemo.raw.Movie;
import firstDemo.raw.Rental;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author zhaojigang
 * @date 2019/5/12
 */
public class TestFirstDemo {
    String s1 = "Rental Record for zhangsan\n" +
            "\t喜羊羊\t1.5\n" +
            "\t天龙八部\t2.0\n" +
            "Amount owed is 3.5\n" +
            "You earned 2 frequent renter points";

    String s2 = "Rental Record for lisi\n" +
            "\t流浪地球\t15.0\n" +
            "Amount owed is 15.0\n" +
            "You earned 2 frequent renter points";

    @Test
    public void testStatement() {
        Movie m1 = new Movie("喜羊羊", Movie.CHILDRENS);
        Movie m2 = new Movie("天龙八部", Movie.REGULAR);
        Movie m3 = new Movie("流浪地球", Movie.NEW_RELEASE);

        Rental r1 = new Rental(m1, 3); // m1 租 3 天
        Rental r2 = new Rental(m2, 2);
        Rental r3 = new Rental(m3, 5);

        Customer c1 = new Customer("zhangsan");
        c1.addRental(r1);
        c1.addRental(r2);

        Customer c2 = new Customer("lisi");
        c2.addRental(r3);

        Assert.assertEquals(c1.statement(), s1);
        Assert.assertEquals(c2.statement(), s2);
    }
}
