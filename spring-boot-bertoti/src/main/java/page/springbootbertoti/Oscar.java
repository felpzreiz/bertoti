package page.springbootbertoti;

import java.util.UUID;

public class Oscar {
    private final String id;
    private String name;

    public Oscar(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Oscar(String name) {
        this(UUID.randomUUID().toString(), name);
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
}
