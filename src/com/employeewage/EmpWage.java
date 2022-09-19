package com.employeewage;


public class EmpWage {
	public int wage_per_hr=20;
	public int emphrs;
	public int employeewage;
	public final int is_presentemployee=1;
	public final int workingdays=20;
	int n=1;
	int totalempwage=0;
	
	public int attendemployee=(int) (Math.floor(Math.random()*10)%3);

	public void EmpWageAttendance()
	{	
		while (n < workingdays)
		{ n++;
		int attendemployee=(int) (Math.floor(Math.random()*10)%3);

		switch (attendemployee) {
		case  1 :
			emphrs = 8;
			System.out.print("Employee is Present Full Time");
			break;
		case 2 :
			emphrs = 4;
			System.out.print("Employee is Present Part Time");
			break;
		default:
			emphrs = 0;
			System.out.print("The Employee is Absent");
		}
		employeewage=emphrs*wage_per_hr;
		System.out.println(employeewage);
		totalempwage=totalempwage+employeewage;
		}
		System.out.println("***********************************************************");
		System.out.println("The Monthe Salary of Employee is "+totalempwage+" ");
	}
	public static void main(String[] args) {
		EmpWage Attend=new EmpWage();
		Attend.EmpWageAttendance();

	}
}
