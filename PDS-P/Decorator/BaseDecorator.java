import java.util.*;

public class BaseDecorator implements Interface {
    
    public final Interface employee;
    
    public BaseDecorator(Interface employee) {
        this.employee = employee;
    }

    @Override
    public void start(Date date) {
        this.employee.start(date);
    }

    @Override
    public void work() {
        this.employee.work();
    }

    @Override
    public void terminate(Date date) {
        this.employee.terminate(date);
    }
}
