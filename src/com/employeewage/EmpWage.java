package com.employeewage;


public class EmpWage {	
	 final  int IS_FULL_TIME =1;
	 final int IS_PART_TIME =2;
            int empRatePerHour;
	        int numberOfWorkinDays;
	        int maxHourInMonth;
	        String name;
	public EmpWage(String name,int emprateperhr,int numbofworkingdays,
			int maxhrinmonth) {  // Parameterized Constructor 
		this.empRatePerHour=emprateperhr;
		this.numberOfWorkinDays=numbofworkingdays;
		this.maxHourInMonth=maxhrinmonth;
		this.name=name;
	}
	public void multipleCompanyWages() {
		int emphrs = 0;
		int empwage = 0;
		int totalempwage = 0;
		int totalworkingdays = 0;
		int totalemphrs = 0;
		System.out.println("The Name of Company is  "+name);
		while (totalemphrs < maxHourInMonth && totalworkingdays< numberOfWorkinDays ){
			totalworkingdays++;
			int empcheck = (int) Math.floor(Math.random() * 10) % 3;

			switch ((int)empcheck ) {
			case  IS_FULL_TIME :
				emphrs = 8;
				break;
			case IS_PART_TIME :
				emphrs = 4;
				break;
			default:
				emphrs = 0;
			}
			empwage = emphrs * empRatePerHour ;
			totalempwage += empwage;
			System.out.println( "The salary of Employe is" + empwage );
		}
		System.out.println("The Total Salary Of  "+name+" Company Is  : "+totalempwage);
		System.out.println("**********************************************************************************");
		
	}
	
	
	public static void main(String[] args) {
		EmpWage dmart= new EmpWage("Dmart",20,20,100);
		dmart.multipleCompanyWages();
		EmpWage relianc= new EmpWage("Reliance",25,24,200);
		relianc.multipleCompanyWages();
	}
}

