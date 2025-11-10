package antipattern;

public class Main {
    public static void main(String[] args) {
        File file1 = new File("documento.txt");
        File file2 = new File("foto.png");
        Directory pasta = new Directory("Meus Arquivos");
        pasta.addItem(file1);
        pasta.addItem(file2);
        pasta.show("");
    }
}