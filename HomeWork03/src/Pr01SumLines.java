import java.io.*;

/**
 * Created by NRG on 25.3.2016 г..
 */
public class Pr01SumLines {
    public static void main(String[] args) {

        try(BufferedReader input = new BufferedReader(new FileReader("lines.txt"))){

            while(true){
                int sum = 0;
                String line = input.readLine();
                if (line == null){
                    break;
                }
                for (int i = 0; i < line.length(); i++) {
                    sum += (int)line.charAt(i);
                }
                System.out.println(sum);
            }

        } catch (FileNotFoundException fnfe){
            System.out.println("File not found!");
        } catch (IOException ioe){
            System.out.println("The program can't open the file!");
        }
    }
}
