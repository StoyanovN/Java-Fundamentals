import java.io.*;
import java.util.ArrayList;
import java.lang.String;


/**
 * Created by NRG on 28.3.2016 г..
 */
public class Pr05ArrayListOfDoubles {
    public static void main(String[] args) {

        ArrayList<Double> list = new ArrayList<>();
        list.add(1.2654982);
        list.add(25564.14462);
        list.add(254.256);
        list.add(-25543.54649);

        try(ObjectOutputStream oOS = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("doubles.list.txt")))){
                oOS.writeObject(list);

        }catch (FileNotFoundException fnf){
            fnf.fillInStackTrace();
        }catch (IOException io){
            io.fillInStackTrace();
        }
        try(ObjectInputStream oIS = new ObjectInputStream(new BufferedInputStream(new FileInputStream("doubles.list.txt")))){
            System.out.println(oIS.readObject());

        }catch (FileNotFoundException fnf){
            fnf.fillInStackTrace();
        }catch (IOException io){
            io.fillInStackTrace();
        }catch (ClassNotFoundException cnf){
            cnf.fillInStackTrace();
        }



    }
}
