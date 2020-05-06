package com.upGrad;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedUncheckedExceptions {

    //checkedExceptions
    public void getStringLengthWithExceptionHandling(String str){
        try {
            int len = str.length();
        }catch (NullPointerException e){
            System.out.println("Exception has been caught");
        }
        System.out.println("The length of the string is :" + str.length());
    }

    //uncheckedExceptions
    public static void readFile() { try {
            FileReader file = new FileReader("pom.xml");

            file = null;

            file.read();
        } catch (IOException e) {
            //Alternate logic
            e.printStackTrace();
        }
    }
}
