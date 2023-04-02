import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Formatter;

public class Main {
    public static void main(String[] args) {
        Products[] students = new Products[50];

        try {
            FileReader fileReader = new FileReader("D:/Soft/IntelliJ IDEA Community Edition 2022.3.3/projects/lab0/src/products.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            for(int i = 0; i < students.length; i++) {
                students[i] = new Products();
                students[i].readingFile(bufferedReader);
            }

            Formatter form = new Formatter(System.out);
            for(int i = 0; i < students.length; i++) {
                students[i].writeTable(form);
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}
