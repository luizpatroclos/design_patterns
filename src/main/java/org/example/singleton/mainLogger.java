package org.example.singleton;

public class mainLogger {


    public static void main(String[] args){

        var log = new Logger("Its wrong", "it could be my fault");

        var log2 = Logger.getinstance();

        log2.setContent("aloooo");
        log2.setType("Fiat");

        //As a singleton, both objects (log3, log4) will take the same instance
        var log3 = Logger.getinstance();

        var log4 = Logger.getinstance();

        System.out.println("This class does not work correctly !" + log2.getContent());


    }

}
