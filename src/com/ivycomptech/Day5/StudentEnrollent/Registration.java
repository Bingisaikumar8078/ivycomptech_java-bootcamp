package com.ivycomptech.Day5.StudentEnrollent;

public class Registration {
    public static void main(String[] args) {
        StudentAdmissionChecker s1 = new StudentAdmissionChecker();
        s1.setAge(5);
        s1.setName("student1");
        s1.setGrade(1);
        s1.setRegNo(1111);

        System.out.println(s1.getName()+" "+ s1.getRegNo()+" "+s1.getAge()+" "+s1.getGrade());

    }
}
