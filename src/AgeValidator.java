//Mr.Yossawaj Bowonsrithananon ID: 6510450879
public class AgeValidator implements Validator{
    @Override
    public void validate(User user) {
        if (user.getAge() < 20) {
            throw new IllegalArgumentException("Age should be more than 20 years");
        }
    }
}
