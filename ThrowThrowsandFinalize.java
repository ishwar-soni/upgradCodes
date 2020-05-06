package com.upGrad;

public class ThrowThrowsandFinalize {
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