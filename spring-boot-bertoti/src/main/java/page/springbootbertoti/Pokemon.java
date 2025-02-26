package page.springbootbertoti;

import java.util.UUID;

public class Pokemon {
    private String id;
    private String name;
    private String type1;
    private String type2;

    public Pokemon() {
    }

    public Pokemon(String id, String name, String type1, String type2) {
        this.id = (id == null || id.isEmpty()) ? UUID.randomUUID().toString() : id;
        this.name = name;
        this.type1 = type1;
        this.type2 = (type2 == null || type2.isEmpty()) ? null : type2;
    }

    public Pokemon(String name, String type1, String type2) {
        this(UUID.randomUUID().toString(), name, type1, type2);
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

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }
}
