//Mr.Yossawaj Bowonsrithananon ID: 6510450879
public class NameValidator implements Validator{
    @Override
    public void validate(User user) {
        if (user.getName() == null || user.getName().trim().equals("")) {
            throw new IllegalArgumentException("Name should not empty");
        }

        if ( !user.getName().matches("[a-zA-Z]+")){
            throw new IllegalArgumentException("Name is wrong format");
        }
    }
}
