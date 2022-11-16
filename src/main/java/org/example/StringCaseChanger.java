package org.example;
import java.lang.Object;

public class StringCaseChanger implements StringTransformer{

    @Override
    public void execute(StringDrink drink) {
        StringBuilder str = new StringBuilder(drink.getText());
        for(int i = 0; i<str.length(); i++){
            if(Character.isLowerCase(str.charAt(i))){
                str.setCharAt(i, Character.toUpperCase(str.charAt(i)));
            }
            else if(Character.isUpperCase(str.charAt(i))){
                str.setCharAt(i, Character.toLowerCase(str.charAt(i)));
            }
        }
        drink.setText(String.valueOf(str));
    }
}
