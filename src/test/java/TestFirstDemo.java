//import firstDemo.raw.Customer;
//import firstDemo.raw.Movie;
//import firstDemo.raw.Rental;
//import firstDemo.refactor.Customer;
//import firstDemo.refactor.Movie;
//import firstDemo.refactor.Rental;

//import firstDemo.ref2.*;
import firstDemo.ref3.*;
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
//        Movie m1 = new Movie("喜羊羊", Movie.CHILDRENS);
//        Movie m2 = new Movie("天龙八部", Movie.REGULAR);
//        Movie m3 = new Movie("流浪地球", Movie.NEW_RELEASE);

        // ref2 如果 Movie 使用多态则需要改变代码
//        Movie m1 = new ChildrensMovie("喜羊羊");
//        Movie m2 = new RegularMovie("天龙八部");
//        Movie m3 = new NewReleaseMovie("流浪地球");

        // ref3 如果 Movie 使用工厂模式+策略模式则需要改变代码
        Movie m1 = MovieFactory.createMovie("喜羊羊", Movie.CHILDRENS);
        Movie m2 = MovieFactory.createMovie("天龙八部", Movie.REGULAR);
        Movie m3 = MovieFactory.createMovie("流浪地球", Movie.NEW_RELEASE);

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
