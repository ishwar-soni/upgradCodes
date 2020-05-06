package com.upGrad;

public class KISSExample {
    public String weekday1(int day) throws InvalidOperationException {
        switch (day) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                throw new InvalidOperationException("day must be in range 1 to 7");
        }
    }
    public String weekday2(int day) throws InvalidOperationException {
        if ((day < 1) || (day > 7)) throw new InvalidOperationException("day must be in range 1 to 7");
        String[] days = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };
        return days[day - 1];
    }
}

 class InvalidOperationException extends Exception{
     public InvalidOperationException() {
     }

     public InvalidOperationException(String message) {
         super(message);
     }

     public InvalidOperationException(String message, Throwable cause) {
         super(message, cause);
     }

     public InvalidOperationException(Throwable cause) {
         super(cause);
     }

     public InvalidOperationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
         super(message, cause, enableSuppression, writableStackTrace);
     }
 }
