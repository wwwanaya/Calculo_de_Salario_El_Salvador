import java.math.BigDecimal;

public class AFP extends etc {
	
	BigDecimal Salary = new BigDecimal("1000");;
	BigDecimal AFPPercent = new BigDecimal("0.0625");
	BigDecimal afpResult = new BigDecimal("0");
	
	// Setters
	public void setSalaryAFP(BigDecimal S){
		this.Salary = S;
	}
	
	// Getters
	public BigDecimal getSalary(){
		return Salary;
	}
	
	public BigDecimal getAFPResult(){
		afpResult = Salary.multiply(AFPPercent).setScale(2, BigDecimal.ROUND_UP);
		return afpResult;
	}
	
	public BigDecimal getAFPResultQuincenal(){
		afpResult = Salary.multiply(AFPPercent).divide(operator2).setScale(2, BigDecimal.ROUND_UP);
		return afpResult;
	}
	
	public BigDecimal getAFPResultSemanal(){
		afpResult = Salary.multiply(AFPPercent).divide(operator4).setScale(2, BigDecimal.ROUND_UP);
		return afpResult;
	}
	
}
