package com.ivycomptech.Day5.StudentEnrollent;

public class StudentAdmissionChecker {

    private int regNo;
    private int age;
    private String name;
    private int grade;


    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
        if (age >= 5 || age <= 6 && grade == 1)
            System.out.println("possible");

        else if (age >= 5 || age <= 6 && grade == 2)
            System.out.println("possible");

        else if (age >= 6 || age <= 7 && grade == 3)
            System.out.println("possible");

        else if (age >= 7 || age <= 8 && grade == 4)
            System.out.println("possible");

        else if (age >= 8 || age <= 9 && grade == 5)
            System.out.println("possible");

        else if (age >= 10 || age <= 11 && grade == 6)
            System.out.println("possible");

        else if (age >= 12 || age <= 13 && grade == 7)
            System.out.println("possible");

        else if (age >= 13 || age <= 14 && grade == 8)
            System.out.println("possible");

        else if (age >= 14 || age <= 15 && grade == 9)
            System.out.println("possible");

        else if (age >= 15 || age <= 16 && grade == 10)
            System.out.println("possible");
        else
            System.out.println("not possible");


    }


}

