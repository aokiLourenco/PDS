import java.util.*;

public class ToShare {
    
    private List<Product> products;
    private State state;
    
    public boolean add(Product p) {
        return products.add(p);
    }
    
    public Product remove(String code) {
        for (Product p : products) {
            if (p.code().equals(code)) {
                products.remove(p);
                return p;
            }
        }
        return null;
    }

    public Product remove(Product p) {
        if (products.contains(p)) {
            products.remove(p);
            return p;
        }
        return null;
    }

    // Product with ‘code’ will be shared with ‘user’ and will be unavailable until giveBack
    public boolean share(String code, Client user) {
        for (Product p : products) {
            if (p.code().equals(code)) {
                state = State.Indisponivel;
                return share(p, user);
            }
        }
        return false;
    }

    public boolean share(Product p, Client user) {
        for (Product p : products) {
            if (p.equals(p)) {
                products.remove(p);
                return true;
            }
        }
    }

    public boolean giveBack(String code) {
    }
    public String allAlugados();

}
