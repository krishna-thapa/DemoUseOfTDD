package DemoExercises;

public class DecimalToBinary {
    public static void main(String[] args){

        int binary = decimalToBinary( 89);
        System.out.println("Int answer in binary: " + binary);
        int decimal = binaryToDecimal(1011001);
        System.out.println("Int answer in decimal: " + decimal);
    }

    private static int binaryToDecimal(int binary) {
        int i = 0, result = 0;
        while(binary >0){
            result += (binary%10)*(Math.pow(2,i));
            binary = binary/10;
            i++;
        }
        return result;
    }

    public static int decimalToBinary(int decimal){
        StringBuilder binary = new StringBuilder();

        while(decimal > 0){
            int reminder = decimal%2;
            binary = binary.append(String.valueOf(reminder));
            decimal = decimal/2;
        }
        int result = Integer.parseInt(binary.reverse().toString());

        return result;
    }
}
