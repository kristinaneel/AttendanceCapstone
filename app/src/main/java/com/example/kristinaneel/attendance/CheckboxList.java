package com.example.kristinaneel.attendance;

/**
 * Created by kristinaneel on 3/28/2017.
 */
public class CheckboxList {
    String name;
    int value;

    CheckboxList(String name, int value){
        this.name = name;
        this.value = value;
    }
    public String getName(){
        return this.name;
    }
    public int getValue(){
        return this.value;
    }
}
