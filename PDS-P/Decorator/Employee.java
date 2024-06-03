import java.util.*;

public class Employee implements Interface {
    
    @Override
    public void start(Date date) {
        System.out.println("Employe started working like a nigger at " + date);
    }

    @Override
    public void work() {
        System.out.println("Employee is nigger cosplaying");
    }

    @Override
    public void terminate(Date date) {
        System.out.println("Employee is free since " + date);
    }

}