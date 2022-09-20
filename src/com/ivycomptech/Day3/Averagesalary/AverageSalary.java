package com.ivycomptech.Day3.Averagesalary;//Average Salary Excluding the Minimum and Maximum Salary
//        You are given an array of unique integers salary where salary[i] is the salary of the ith employee.
//        Return the average salary of employees excluding the minimum and maximum salary. Answers within 10-5 of the actual answer will be accepted.
//        Example 1:
//        Input: salary = [4000,3000,1000,2000]
//        Output: 2500.00000
//        Explanation: Minimum salary and maximum salary are 1000 and 4000 respectively.
//        Average salary excluding minimum and maximum salary is (2000+3000) / 2 = 2500
//        Example 2:
//        Input: salary = [1000,2000,3000]
//        Output: 2000.00000
//        Explanation: Minimum salary and maximum salary are 1000 and 3000 respectively.
//        Average salary excluding minimum and maximum salary is (2000) / 1 = 2000
//        Constraints:
//        •	3 <= salary.length <= 100
//        •	1000 <= salary[i] <= 106
//        •	All the integers of salary are unique.


public class AverageSalary
{
    public static double average(int[] salary) throws InvalidSalaryLengthException, InvalidSalaryValue {
        int n = salary.length;
//        System.out.println(n);

        if (salary.length <= 3 && salary.length >= 100)
            throw new InvalidSalaryLengthException("Salary is either less than 3 or greater than 10");
        for (int s = 0; s == n; s++) {
//                System.out.println(salary[s]);
            if (salary[s] <= 1000 && salary[s] >= 106)
                throw new InvalidSalaryValue("Salary value is not in range");
        }


        int mn = Integer.MAX_VALUE, mx = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + salary[i];
            mn = Math.min(mn, salary[i]);
            mx = Math.max(mx, salary[i]);
        }
        double ans = (sum - mn - mx) / ((n - 2) * 1.0);
        if (n > 2)
            return ans;
        else
            return 0;
    }

    public static void main(String[] args) throws InvalidSalaryLengthException, InvalidSalaryValue {
        int[] arr = {107, 200, 300};
        double ans = average(arr);
        System.out.println(ans);
    }
}





