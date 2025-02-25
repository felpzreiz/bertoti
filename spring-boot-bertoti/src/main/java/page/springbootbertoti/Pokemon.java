package page.springbootbertoti;

import java.util.UUID;

public class Pokemon {
    private final String id;
    private String name;
    private String type;

    public Pokemon(String name, String type) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
