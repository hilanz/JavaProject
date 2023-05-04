import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class prak_602 {

    public static void main(String[] args) {
        File fileIn = new File("src/prak_602.java");
        File fileOut = new File("src/hasil.txt");
        if (!fileIn.exists() || !fileIn.canRead()) {
            System.out.println("Can't read " + fileIn);
            return;
        }
        try (BufferedReader fIn = new BufferedReader(new FileReader(fileIn));
                BufferedWriter fOut = new BufferedWriter(new FileWriter(fileOut))) {
            int i = 0;
            String line;
            while ((line = fIn.readLine()) != null) {
                i++;
                if (i < 10)
                    fOut.write("  ");
                else if (i < 100)
                    fOut.write(" ");
                fOut.write(i + " : " + line);
                fOut.newLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error writing to file");
        }
    }
}
