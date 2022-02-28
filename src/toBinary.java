//alphanumeric to binary converter
//UTFS-8 was used to represent alphabets to numbers
import javax.swing.JOptionPane;

public class toBinary extends toMorseCode {
    //from UTFS-8
    private int[] num = { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

    //constructor
    public toBinary(){
        super.input = null;
        super.output = "";
    }

    //input number converter to binary
    public int toBinaryNumber(int input){
        //uses built in converter
        output = Integer.toBinaryString(input);
        return Integer.parseInt(output);
    }

    //converte word to binary with the help of the toBinayNumber method
    public String textToBinary(String input){
        try{
            //make input lowercase
            this.input = input.toLowerCase();
            for (int i=0; i <= input.length()-1; i++){
                for(int j=0; j <= alphabetandNum.length-11; j++){
                    if(input.charAt(i) == alphabetandNum[j]){
                        output += toBinaryNumber(num[j]);
                    }
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Enter a text word, numbers only or combination of both. \n Try again ");
        }

        return output;
    }
    public String toString(){
        return "The binary encoding for " +input.toUpperCase()+ " is " +output;
    }
}