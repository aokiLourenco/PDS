import java.util.*;

public class TeamLeader extends BaseDecorator{
    
    public TeamLeader(Interface employee) {
        super(employee);
    }

    public void start(Date date) {
        System.out.println("TeamLeader is leading since " + date);
    }

    public void work() {
        System.out.println("TeamLeader is working");
    }

    public void terminate(Date date) {
        System.out.println("TeamLeader terminated like a bosch at " + date);
    }

    public void plan() {
        System.out.println("TeamLeader is planning");
    }

}
