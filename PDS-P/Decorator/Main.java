import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("----------------------//testing basic Employee//----------------------\n");
        Interface employee = new Employee();

        employee.start(new Date());
        employee.work();
        employee.terminate(new Date());

        System.out.println("\n----------------------//testing Team Leader//----------------------\n");
        employee = new TeamLeader(employee);

        employee.start(new Date());
        employee.work();
        ((TeamLeader) employee).plan();
        employee.terminate(new Date());

        System.out.println("\n----------------------//testing Team Member//----------------------\n");
        employee = new TeamMember(employee);

        employee.start(new Date());
        employee.work();
        ((TeamMember) employee).colaborate();
        employee.terminate(new Date());

        System.out.println("\n----------------------//testing Manager//----------------------\n");
        employee = new Manager(employee);

        employee.start(new Date());
        employee.work();
        ((Manager) employee).manage();
        employee.terminate(new Date());
    }
}
