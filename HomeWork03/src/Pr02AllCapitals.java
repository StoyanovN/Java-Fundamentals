
import java.io.*;
import java.lang.String;
import java.util.*;
import java.util.List;

/**
 * Created by NRG on 25.3.2016 г..
 */
public class Pr02AllCapitals {
    public static void main(String[] args) {

        File temp = new File("temp.txt");

        try (BufferedReader bR = new BufferedReader(new FileReader(new File("lines_a.txt")));
             BufferedWriter bW = new BufferedWriter(new FileWriter(temp))) {
            String line = bR.readLine();
                while (line != null) {
                bW.write(line.toUpperCase());
                bW.newLine();
                line = bR.readLine();
            }
        } catch (IOException io) {
            io.printStackTrace();
        }

        try (BufferedReader bR = new BufferedReader(new FileReader(temp));
             BufferedWriter bW = new BufferedWriter(new PrintWriter(new File("lines_a.txt")))) {

            String line = bR.readLine();

            while (line != null) {
                bW.write(line);
                bW.newLine();
                line = bR.readLine();
            }
        } catch (IOException io) {
            io.printStackTrace();
        }

        temp.delete();
    }
}
