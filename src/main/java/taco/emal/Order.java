package taco.emal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Order {

    private final String email;
    private final List<Taco> tacos = new ArrayList<>();

    public Order(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public List<Taco> getTacos() {
        return Collections.unmodifiableList(tacos);
    }

    public void addTaco(Taco taco) {
        this.tacos.add(taco);
    }
}
