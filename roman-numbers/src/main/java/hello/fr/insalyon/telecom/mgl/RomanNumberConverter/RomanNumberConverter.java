package hello.fr.insalyon.telecom.mgl.RomanNumberConverter;

/**
 * Created by max on 09/10/2017.
 */
public class RomanNumberConverter {

    public RomanNumberConverter(){}
    System.out.println("test travis");
    int converttoint(String romanNumber){
        Integer number = null;
        switch (romanNumber) {
            case "I":  number = 1;
                break;
            case "V":  number = 5;
                break;
            case "X":  number = 10;
                break;
            case "L":  number = 50;
                break;
            case "C":  number = 100;
                break;
            case "D":  number = 500;
                break;
            case "M":  number = 1000;/*pates*/
                break;
            default: throw new IllegalArgumentException("wrong romanNumber");
        }
        return number;
    }
    String converttoroman(Integer number){
        String monthString=null;
        switch (number) {
            case 1:  monthString = "I";
                break;
            case 5:  monthString = "V";
                break;
            case 10:  monthString = "X";
                break;
            case 50:  monthString = "L";
                break;
            case 100:  monthString = "C";
                break;
            case 500:  monthString = "D";
                break;
            case 1000:  monthString = "M";
                break;
            default: throw new IllegalArgumentException("wrong Number");
        }
        return monthString;
    }

}
