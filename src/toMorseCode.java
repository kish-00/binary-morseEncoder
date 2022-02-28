//alphanumeric to morse code converter

import javax.swing.JOptionPane;

public class toMorseCode{
    protected char[] alphabetandNum = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7','8',
	        '9', '0'};

    //morse code array
	private String[] morse = { /*A*/".-", /*B*/"-...", /*C*/"-.-.", /*D*/"-..", /*E*/".", /*F*/"..-.", /*G*/"--.",
	        /*H*/"....", /*I*/"..", /*J*/".---", /*K*/"-.-", /*L*/".-..", /*M*/"--", /*N*/"-.", /*O*/"---", /*P*/".--.",
	        /*Q*/"--.-", /*R*/".-.", /*S*/"...", /*T*/"-", /*U*/"..-", /*V*/"...-", /*W*/".--", /*X*/"-..-",
	        /*Y*/"-.--", /*Z*/"--..", /*1*/".----", /*2*/"..---", /*3*/"...--", /*4*/"....-", /*5*/".....",
	        /*6*/"-....", /*7*/"--...", /*8*/"---..", /*9*/"----.", /*0*/"-----"};

    protected String input;
    protected String output;

    //constructor
    public toMorseCode(){
        this.input = null;
        this.output = "";
    }

    //input getter and setter
    public String getInput(){
        return this.input;
    }

    public void setInput(String input){
        this.input = input;
    }

    //morsecode generator
    public void toMorse(String input){
        try{
            for(int i=0; i<=input.length()-1; i++){
                for(int j=0; j<=alphabetandNum.length-1; j++){
                    if(input.charAt(i) == alphabetandNum[j]){
                        output += morse[j] + " ";
                    }
                }
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please enter a word or whole number only. \n Try again ");
        }
    }

    public String toString(){
        return "Morse code for " + input.toUpperCase() + " is " + this.output;
    }
}