import java.io.*;

/**
 * Created by NRG on 28.3.2016 г..
 */
public class Pr04CopyJPG {
    public static void main(String[] args) {
        try(BufferedInputStream bIS = new BufferedInputStream(new FileInputStream("tiger.jpg"));
            BufferedOutputStream bOS = new BufferedOutputStream(new FileOutputStream("new_one.jpg"))){
            int x;

            while((x = bIS.read()) != -1){
                bOS.write(x);
            }

        } catch (FileNotFoundException fnf){
            fnf.fillInStackTrace();
        } catch (IOException io){
            io.fillInStackTrace();
        }

    }
}
