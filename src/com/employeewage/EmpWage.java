package com.employeewage;


public class EmpWage {
	public final int is_presentemployee=1;
	public int attendemployee=(int) (Math.floor(Math.random()*10)%2);

	public void EmpWageAttendance()
	{	
		if (attendemployee==is_presentemployee) {
			System.out.println("Employee is Present");}
		else {
			System.out.println("Employee is Absent");
		}
	}
	public static void main(String[] args) {
		EmpWage Attend=new EmpWage();
		Attend.EmpWageAttendance();

	}
}
