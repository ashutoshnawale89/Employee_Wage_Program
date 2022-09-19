package com.employeewage;


public class EmpWage {
	public int wage_per_hr=20;
	public int emphrs;
	public int employeewage;
	public final int is_presentemployee=1;
	
	public int attendemployee=(int) (Math.floor(Math.random()*10)%2);

	public void EmpWageAttendance()
	{	
		if (attendemployee==is_presentemployee) {
			emphrs=8;
			System.out.println("Employee is Present");}
		else {
			System.out.println("Employee is Absent");
			emphrs=0;
		}
		employeewage=emphrs*wage_per_hr;

		System.out.println("The Salary of Employee is "+employeewage+" ");
	}
	public static void main(String[] args) {
		EmpWage Attend=new EmpWage();
		Attend.EmpWageAttendance();

	}
}
