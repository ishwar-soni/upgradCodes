package com.upGrad;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.SQLOutput;

public class ExceptionHandling{
    public int divideTwoNumber(int a, int b){
        int res = a/b;
        return res;
    }

    public void getStringLength(String str){
        int len = str.length();
        System.out.println("The length of the string is :" + str.length());
    }

    public int divideTwoNumberWithExceptionHandling(int a, int b){
        int res = 0;
        try{
             res = a/b;
            return res;
        }catch (ArithmeticException e){
            System.out.println("Exception has been caught");
        }
        return res;
    }

    public void getStringLengthWithExceptionHandling(String str){
        try {
            int len = str.length();
        }catch (NullPointerException e){
            System.out.println("Exception has been caught");
        }
        System.out.println("The length of the string is :" + str.length());
    }
    public static void finallyBlockExecution(){
        String name = "upGrad" ;
        try{
            System.out.println("Name:" + name);
            System.out.println("Exit from try block");
        }catch(NullPointerException ex) {
            System.out.println("Catch block executed...");
        }finally {
            System.out.println("finally block executed");
        }
        // rest program will be executed
        System.out.println("Outside try-catch-finally clause");
    }
    public static void main(String args[]) {
       finallyBlockExecution();
    }
}

// Java program that demonstrates the use of throw
class ThrowException{
    public void fun() throws CustomException {
        try{
            throw new CustomException("demo");
        }catch(CustomException e) {
            System.out.println("Caught inside fun().");
            throw e; // rethrowing the exception
        }
    }
    public void throwsExcep() throws InterruptedException {
        Thread.sleep(10000);
        System.out.println("Hello Geeks");
    }
    //finalize block used by Garbage Collector
    public void finalize() throws Throwable{
        System.out.println("Finalize block is being overridden, can be used for many purposes");
    }
}



class CustomException extends Exception{
    public CustomException() {}

    public CustomException(String message){ super(message);}
}


