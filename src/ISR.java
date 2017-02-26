import java.math.BigDecimal;

public class ISR extends etc {
	
	BigDecimal Salary = new BigDecimal("0");
	BigDecimal isrResult = new BigDecimal("0");
	
	// Variables Tramo 1ro
	BigDecimal tramo1V1 = new BigDecimal("0.01");
	BigDecimal tramo1V2 = new BigDecimal("472.00");
	String tramo1V3 = new String("No retention");
	
	// Variables Tramo 2do
	double tramo2V1 = 472.01;
	BigDecimal tramo2V2 = new BigDecimal("895.24");
	BigDecimal tramo2Percent = new BigDecimal("0.1");
	BigDecimal tramo2Excess = new BigDecimal("472.00");
	BigDecimal tramo2FixRate = new BigDecimal("17.67");
	
	// Variables Tramo 3ro
	double tramo3V1 = 895.25;
	BigDecimal tramo3V2 = new BigDecimal("2038.10");
	BigDecimal tramo3Percent = new BigDecimal("0.2");
	BigDecimal tramo3Excess = new BigDecimal("895.24");
	BigDecimal tramo3FixRate = new BigDecimal("60");
	
	// Variables Tramo 4to
	double tramo4V1 = 2038.11;
	String tramo4V2 = new String("No limit");
	BigDecimal tramo4Percent = new BigDecimal("0.3");
	BigDecimal tramo4Excess = new BigDecimal("2038.10");
	BigDecimal tramo4FixRate = new BigDecimal("288.57");
	
	// Setter Salary
	public void setSalaryISR(BigDecimal S){
		this.Salary = S;
	}
	
	// Getter Salary
	public BigDecimal getSalaryISR(){
		return Salary;
	}
	
	// Processing Salary
	public BigDecimal getISRResults(){
	
		// If the salary is equal or more than 472.01 applies for ISR

		if(Salary.compareTo(BigDecimal.valueOf(tramo2V1)) >= 0){
			// Tramo 2
			//System.out.println("Tramo 2, salary: " + Salary);
			isrResult = Salary.subtract(tramo2Excess).multiply(tramo2Percent).add(tramo2FixRate).setScale(2, BigDecimal.ROUND_UP);

		} else if (Salary.compareTo(BigDecimal.valueOf(tramo3V1)) >= 0) {
			// Tramo 3
			//System.out.println("Tramo 3, salary: " + Salary);
			isrResult = Salary.subtract(tramo3Excess).multiply(tramo3Percent).add(tramo3FixRate).setScale(2, BigDecimal.ROUND_UP);
			
		} else if (Salary.compareTo(BigDecimal.valueOf(tramo3V1)) >= 0) {
			// Tramo 4
		//System.out.println("Tramo 4, salary: " + Salary);
		isrResult = Salary.subtract(tramo3Excess).multiply(tramo3Percent).add(tramo3FixRate).setScale(2, BigDecimal.ROUND_UP);
		
		} else {
			// Tramo 1
			//System.out.println("You don't applies for ISR :)");
			//System.out.println("Your salary: " + Salary);
		}
		
		return isrResult;
		
	}
	
	public BigDecimal getISRResultsQuincenal(){
		isrResult = getISRResults().divide(operator2).setScale(2, BigDecimal.ROUND_UP);
		return isrResult;
	}
	
	public BigDecimal getISRResultsSemanal(){
		isrResult = getISRResults().divide(operator4).setScale(2, BigDecimal.ROUND_UP);
		return isrResult;
	}
	
}
