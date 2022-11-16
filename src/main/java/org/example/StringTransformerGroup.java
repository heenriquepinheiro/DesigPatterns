package org.example;

import java.util.List;

public class StringTransformerGroup implements StringTransformer{
    private List<StringTransformer> t;
    public StringTransformerGroup(List<StringTransformer> transformers) {
        this.t = transformers;
    }

    @Override
    public void execute(StringDrink drink) {
        for(StringTransformer transformer : t){
            transformer.execute(drink);
        }
    }
}
