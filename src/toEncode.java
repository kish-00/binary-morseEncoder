//main
import java.util.*;

public class toEncode{

    public static void main(String[] args) {
        //objects of the two main classes
        toMorseCode morse = new toMorseCode();
        toBinary binary = new toBinary();

        Scanner in = new Scanner(System.in);
        String input;

        //collect input
        System.out.println("Enter a word or text ");
        input = in.next();
        try{
            if(!(input.equals(""))){
                morse.setInput(input);

                //convert input to morse code
                morse.toMorse(morse.getInput());
                //convert input to binary
                binary.textToBinary(morse.getInput());

                //output the result
                System.out.println(morse.toString() + " \n" + binary.toString());
            }
            }catch(Exception e){
                e.printStackTrace();
        }
        finally{
            if(in != null){
                in.close();
            }
        }

    }
}