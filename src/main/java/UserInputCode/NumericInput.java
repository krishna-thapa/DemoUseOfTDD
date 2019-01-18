package UserInputCode;

public class NumericInput extends TextInput {

    //List<Character> list = new ArrayList<Character>();  //don't make the new list, use static from parent class

    @Override
    public void add(char c){
        if(c >= '0' && c <= '9'){}
        else{
            list.add(c);
        }
    }
}
