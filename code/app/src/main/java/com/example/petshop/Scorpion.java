package com.example.petshop;

import java.util.Date;

public class Scorpion extends Pet{


    public Scorpion(String name){
        super(name);
    }

    public Scorpion(String name, Date birthDate){
        super(name, birthDate);
    }

    @Override
    /*
    function decoration, not necessary but highly recomended bc it tels you there's a
     superclass function im overriding with this func
    */
    public String speak() {
        return "scorp";
    }
}
