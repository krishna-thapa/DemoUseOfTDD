package NumberOrdinal;

public class NumberOrdinal {

    public String calculateNumberOrdinal(int input) throws ZeroException{
        if(input==0) throw new ZeroException("Input number is Zero");

        String result = String.valueOf(input);

        int reminder = input%10;
        switch (reminder){
            case 1 : return result.concat("st");
            case 2 : return result.concat("nd");
            case 3 : return result.concat("rd");
            default : return result.concat("th");
        }
        /*if(reminder == 1){
            result = String.valueOf(input).concat("st");
        }else if(reminder == 2){
            result = String.valueOf(input).concat("nd");
        }else if(reminder == 3){
            result = String.valueOf(input).concat("rd");
        }
        else{
            result = String.valueOf(input).concat("th");
        }
        return result;
        */
    }
}
