package org.example.singleton;

public class mainLogger {


    public static void main(String[] args){


        int[] values = {10, 7, 9, 10};

        int[] values2 = new int[10];

        int[] values3 = {1};

        values3[0] = 11;

        System.out.println(values3);

       /** values3[1] = 1;
        values3[2] = 1;
        values3[3] = 1;
        values3[4] = 1;
        values3[5] = 1;
        values3[6] = 1;
        values3[7] = 1;
        values3[8] = 1;
        values3[9] = 1;
        values3[10] = 1;
        values3[11] = 1;
        values3[12] = 1;
        values3[13] = 1;
        values3[14] = 1;
        values3[15] = 1;
        values3[16] = 1;
        values3[17] = 1;**/



        System.out.println(values);

        System.out.println(values2);




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
