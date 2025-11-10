package antipattern;

import java.util.ArrayList;
import java.util.List;

public class Directory {
    private String name;
    private List<Object> items = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void addItem(Object item) {
        items.add(item);
    }

    public void show(String indent) {
        System.out.println(indent + "--> " + name);
        for (Object item : items) {

            if (item instanceof File) {
                ((File) item).show(indent + "   ");
            } else if (item instanceof Directory) {
                ((Directory) item).show(indent + "   ");
            } else {
                System.out.println(indent + "   Tipo desconhecido!");
            }
        }
    }
}