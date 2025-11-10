package antipattern;

public class File {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public void show(String indent) {
        System.out.println(indent + "-> " + name);
    }
}