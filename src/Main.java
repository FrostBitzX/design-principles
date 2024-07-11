//Mr.Yossawaj Bowonsrithananon ID: 6510450879
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Validator> validatorList;

        validatorList = Arrays.asList(new NameValidator(), new EmailValidator(), new AgeValidator());

        Service service = new Service(validatorList);
        User user = new User("Yossawaj", "example@exmail.com", 15);

        try {
            service.HasRegister(user);
            System.out.println("User registration successful.");
        } catch (IllegalArgumentException e) {
            System.out.println("User registration failed: " + e.getMessage());
        }
    }
}
