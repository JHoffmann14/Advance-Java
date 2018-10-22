package com.company;

public class Namer {
    public static String getName(Cities c) {
        switch(c){
            case CHICAGO: return "Da Bears";
            case DETRIOT: return "Lions";
            case GREEN: return "Packers";
            case MINN: return "Vikings";
            default: return "Cowboys";
        }
    }
}
