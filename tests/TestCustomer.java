import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestCustomer {
    @Test
    public void test_statement() {

        Movie best = new Movie("Inglorious Bastards", 1);
        Movie worst = new Movie("Human Centopede", 0);
        Movie other = new Movie("Avengers", 2);

        Customer fregues = new Customer("George");
        
        Rental first = new Rental(best, 3);
        Rental second = new Rental(other, 4);
        Rental last = new Rental(worst, 2);
        fregues.addRental(first);
        fregues.addRental(second);
        fregues.addRental(last);

        String correct = "Rental Record for George\n";
        correct += "\tInglorious Bastards\t9.0\n";
        correct += "\tAvengers\t7.5\n";
        correct += "\tHuman Centopede\t2.0\n";
        correct += "Amount owed is 18.5\n";
        correct += "You earned 4 frequent renter points";
        String result = fregues.statement();
        
        assertEquals(correct, result);
    }
    
}
