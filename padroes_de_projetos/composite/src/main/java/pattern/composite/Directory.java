package pattern.composite;

import java.util.ArrayList;
import java.util.List;
import pattern.interfaces.FileSystemItem;

public class Directory implements FileSystemItem {
    private String name;
    private List<FileSystemItem> items = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void addItem(FileSystemItem item) {
        items.add(item);
    }

    @Override
    public void show(String indent) {
        System.out.println(indent + "--> " + name);
        for (FileSystemItem item : items) {
            item.show(indent + "   ");
        }
    }
}