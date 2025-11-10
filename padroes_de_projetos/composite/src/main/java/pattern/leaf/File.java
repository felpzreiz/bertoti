package pattern.leaf;

import pattern.interfaces.FileSystemItem;

public class File implements FileSystemItem {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void show(String indent) {
        System.out.println(indent + "-> " + name);
    }
}