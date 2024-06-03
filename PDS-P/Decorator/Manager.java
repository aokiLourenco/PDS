import java.util.*;

public class Manager extends BaseDecorator {
    
    public Manager(Interface employee) {
        super(employee);
    }

    public void start(Date date) {
        System.out.println("Manager is a nigger since " + date);
    }

    public void work() {
        System.out.println("Manager is working");
    }

    public void terminate(Date date) {
        System.out.println("Manager is free since " + date);
    }

    public void manage() {
        System.out.println("Manager is managing like a white man");
    }
}
