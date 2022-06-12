import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class AccountTest {

    Customer customer;
    Account account;
    @BeforeEach
    public void setup(){
        this.customer = new Customer("Martina", 19, 0.76);
        this.account = new Account(this.customer);
    }

    @Test
    public void creditScoreTooLowTest(){
        Assertions.assertEquals(1.08, account.getInterest());
    }
    }

