package org.example;

public class StringReplacer implements StringTransformer{
    private char changeThis;
    private char toThis;
    public StringReplacer(char a, char x) {
        this.changeThis = a;
        this.toThis = x;
    }

    @Override
    public void execute(StringDrink drink) {

        StringBuilder str = new StringBuilder(drink.getText());
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == changeThis){str.setCharAt(i, toThis);}
        }
        drink.setText(String.valueOf(str));
    }
}
