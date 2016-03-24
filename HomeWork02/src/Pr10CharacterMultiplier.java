import java.util.Scanner;

/**
 * Created by NRG on 22.3.2016 г..
 */
public class Pr10CharacterMultiplier {
    static Scanner one = new Scanner(System.in);
    public static void main(String[] args) {
    MultiplyCharacters();
    }
    static void MultiplyCharacters(){
        String strOne = one.next();
        String strTwo = one.next();
        char[] first = strOne.toCharArray();
        char[] second = strTwo.toCharArray();
        int sum = 0;
        if (first.length == second.length){
            for (int i = 0; i < first.length; i++) {
                sum += (int)first[i]*(int)second[i];
            }
        }else if(first.length > second.length){
            for (int i = 0; i < second.length; i++) {
                sum += (int)first[i]*(int)second[i];
            }

            for (int counter = second.length ; counter < first.length ; counter++) {
                sum += (int)first[counter];
            }
        }else{
            for (int i = 0; i < first.length ; i++) {
                sum += (int)first[i]*(int)second[i];
            }
            for (int counter = first.length; counter < second.length ; counter++) {
                sum += (int)second[counter];
            }
        }
        System.out.println(sum);
    }

}
