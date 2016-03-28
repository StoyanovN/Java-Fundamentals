import java.io.*;
import java.lang.String;

/**
 * Created by NRG on 26.3.2016 г..
 */
public class Pr03CountCharTypes {
    public static void main(String[] args) {

        int vowels = 0;
        int consonants = 0;
        int punct = 0;

        try(BufferedReader bR = new BufferedReader(new FileReader("words.txt"));
            BufferedWriter bW = new BufferedWriter(new FileWriter("count-charts.txt"))){
            String line;

            while((line = bR.readLine()) != null){
                line = line.toLowerCase();
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) != ' '){
                        if (line.charAt(i) == 'a' ||  line.charAt(i) == 'e' || line.charAt(i) == 'i' ||
                                line.charAt(i) == 'o' || line.charAt(i) == 'u'){
                            vowels++;
                        }else if (line.charAt(i) == '!' || line.charAt(i) == ',' || line.charAt(i) == '.' ||
                                line.charAt(i) == '?'){
                            punct++;
                        }else{
                            consonants++;
                        }

                    }
                }
            }
            bW.write("Vowels:" + vowels + "\n" + "Consonants:" + consonants + "\n" + "Punctuation:" + punct + "\n" );


        }catch (FileNotFoundException fnf){
            fnf.fillInStackTrace();
        }catch (IOException io){
            io.fillInStackTrace();
        }
    }
}
