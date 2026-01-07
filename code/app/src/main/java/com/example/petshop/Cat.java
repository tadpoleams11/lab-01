package com.example.petshop;


import java.util.Date;

//cat is subclass of pet bc the extends bit
public class Cat extends Pet implements Pettable{

    public Cat(String name){
        super(name);
    }

    public Cat(String name, Date birthDate){
        super(name, birthDate);
    }

    @Override
    /*
    function decoration, not necessary but highly recomended bc it tels you there's a
     superclass function im overriding with this func
    */
    public String speak() {
        return "meow meow meow meow";
    }


    @Override
    public void pet() {

    }
}
