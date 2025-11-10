package pattern;

import pattern.composite.Directory;
import pattern.leaf.File;

public class Main {
    public static void main(String[] args) {

        File file1 = new File("curriculo.pdf");
        File file2 = new File("foto.png");
        File file3 = new File("musica.mp3");

        Directory documents = new Directory("Documentos");
        Directory images = new Directory("Imagens");
        Directory music = new Directory("Músicas");
        Directory root = new Directory("Disco C:");

        documents.addItem(file1);
        images.addItem(file2);
        music.addItem(file3);

        root.addItem(documents);
        root.addItem(images);
        root.addItem(music);

        root.show("");
    }
}