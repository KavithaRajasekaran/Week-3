package week3.day1.assignments;

public class Axisbank_prog3 extends Bankinfo_prog3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Axisbank_prog3 axisbnk = new Axisbank_prog3();
		
		axisbnk.saving(12500);
		axisbnk.fixed(15.2);
		axisbnk.deposit("recurring");
		axisbnk.deposit("Fixed", 5);
		

	}

	public void deposit(String deposittype,Integer Tenure)
	{
		System.out.print(deposittype);
		System.out.print(" " +Tenure);
		
	}
}
