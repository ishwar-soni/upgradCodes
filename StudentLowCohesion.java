package com.upGrad;

public class StudentLowCohesion {
    // -------------- functions related to school
   /* public boolean isSalaryPaid(String teacherName) {
        //some code logic
        return true;
    }
    private boolean isTaxPaid(int year) {
        //some code logic
        return true;
    }
    private boolean isClearanceDone(String clearanceDivision) {
        //some code logic
        return true;
    }*/

    // -------------- functions related to student
    public String findStudentName(int studentid) {
        return "data of " + studentid;
    }
    public String checkStudentMarks(int studentId) {
        return "data of " + studentId;
    }
    public String studentCurrentClass(int studentId) {
        return findStudentName(studentId) + "belongs to standard :" + "10" ;
    }
}
class SchoolHighCohesion{
    // -------------- functions related to school
    public boolean isSalaryPaid(String teacherName) {
        //some code logic
        return true;
    }
    private boolean isTaxPaid(int year) {
        //some code logic
        return true;
    }
    private boolean isClearanceDone(String clearanceDivision) {
        //some code logic
        return true;
    }
}