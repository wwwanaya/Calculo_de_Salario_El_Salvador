import java.math.BigDecimal;

public class Main extends etc {
	
	static BigDecimal Salary = new BigDecimal("850");
	static BigDecimal netSalary = new BigDecimal("0");
	static BigDecimal afpDisc;
	static BigDecimal isssDisc;
	static BigDecimal isrDisc;
	
	static ISSS isss1 = new ISSS();
	static AFP afp1 = new AFP();
	static ISR isr1 = new ISR();
	
	public static void main(String[] args){
		
		afp1.setSalaryAFP(Salary);
		isss1.setSalaryISSS(Salary);
		isr1.setSalaryISR(Salary.subtract(afp1.getAFPResult()).subtract(isss1.getISSSResult()));
		
		afpDisc = afp1.getAFPResult();
		isssDisc = isss1.getISSSResult();
		isrDisc = isr1.getISRResults();
		
		//System.out.println("Before applying AFP to netSalary: " + Salary);
		netSalary = Salary.subtract(afpDisc);
		//System.out.println("After applying AFP to netSalary: " + netSalary);
		netSalary = netSalary.subtract(isssDisc);
		//System.out.println("After applying ISSS to netSalary: " + netSalary);
		netSalary = netSalary.subtract(isrDisc);
		
		System.out.println("***Monthly***:");
		
		System.out.println("ISSS Discount from salary: " + isss1.getISSSResult());
		System.out.println("AFP Discount from salary: " + afp1.getAFPResult());
		//System.out.println("To be applied for ISR: " + Salary.subtract(afp1.getAFPResult()).subtract(isss1.getISSSResult()));
		System.out.println("ISR Discount from salary: " + isr1.getISRResults());
		System.out.println("Your sad salary is: " + netSalary + " :(.");
		
		System.out.println("***15 days***:");		
		
		System.out.println("ISSS Discount from salary: " + isss1.getISSSResultQuincenal());
		System.out.println("AFP Discount from salary: " + afp1.getAFPResultQuincenal());
		System.out.println("ISR Discount from salary: " + isr1.getISRResultsQuincenal());
		System.out.println("Your sad salary 15 days is: " + netSalary.divide(operator2).setScale(2, BigDecimal.ROUND_UP) + " :(.");
		
		System.out.println("***Weekly***:");
		
		System.out.println("ISSS Discount from salary: " + isss1.getISSSResultSemanal());
		System.out.println("AFP Discount from salary: " + afp1.getAFPResultSemanal());
		System.out.println("ISR Discount from salary: " + isr1.getISRResultsSemanal());
		System.out.println("You're doing at least: " + netSalary.divide(operator4).setScale(2, BigDecimal.ROUND_HALF_UP) + " in a week lol :(.");
		
	}
	
}
