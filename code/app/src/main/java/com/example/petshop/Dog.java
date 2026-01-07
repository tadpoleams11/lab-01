package com.example.petshop;

import java.util.Date;

public class Dog extends Pet implements Pettable{

    public Dog(String name){
        super(name);
    }

    public Dog (String name, Date birthDate){
        super(name, birthDate);
    }

    @Override
    /*
    function decoration, not necessary but highly recomended bc it tels you there's a
     superclass function im overriding with this func
    */
    public String speak() {
        return "bow wow";
    }

    @Override
    public void pet() {

    }
}
