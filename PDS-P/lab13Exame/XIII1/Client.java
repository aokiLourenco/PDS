import java.util.ArrayList;
import java.util.List;

public class Client implements ProductsReader {

    private String number;
    private String name;
    private List<Product> product = new ArrayList<>();
    private State state;

    @Override
    public List<Product> getItems() {
        return product;
    }

    public Client(String number, String name) {
        this.number = number;
        this.name = name;
        this.state = State.Disponivel;
    }

}
