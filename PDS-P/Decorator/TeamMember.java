import java.util.*;

public class TeamMember extends BaseDecorator{
    
    public TeamMember(Interface employee) {
        super(employee);
    }

    public void start(Date date) {
        System.out.println("TeamMember is  since membing" + date);
    }

    public void work() {
        System.out.println("TeamMember is working");
    }

    public void terminate(Date date) {
        System.out.println("TeamMember terminated like a bosch at " + date);
    }

    public void colaborate() {
        System.out.println("TeamMember is planning");
    }

}
