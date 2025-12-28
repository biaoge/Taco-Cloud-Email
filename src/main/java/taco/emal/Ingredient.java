package taco.emal;

public class Ingredient {

    private final String code;
    private final String name;

    public Ingredient(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
