//Mr.Yossawaj Bowonsrithananon ID: 6510450879
import java.util.List;

public class Service {
    private List<Validator> validatorList;

    public Service(List<Validator> validatorList){
        this.validatorList = validatorList;
    }

    public boolean HasRegister(User user){
        for(Validator validator : validatorList){
            validator.validate(user);
        }
        return true;
    }
}
