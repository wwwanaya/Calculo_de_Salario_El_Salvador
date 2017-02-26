import java.math.BigDecimal;

public class ISSS extends etc {
	
	private BigDecimal Salary = new BigDecimal("0");
	private BigDecimal ISSSPercent = new BigDecimal("0.03");
	private BigDecimal isssResult = new BigDecimal("0");

	// Setters
	public void setSalaryISSS(BigDecimal S){
		this.Salary = S;
	}
	
	// Getters
	public BigDecimal getSalary(){
		return Salary;
	}
	
	public BigDecimal getISSSResult(){
		isssResult = Salary.multiply(ISSSPercent).setScale(2, BigDecimal.ROUND_UP);
		return isssResult;
	}
	
	public BigDecimal getISSSResultQuincenal(){
		isssResult = Salary.multiply(ISSSPercent).divide(operator2).setScale(2, BigDecimal.ROUND_UP);
		return isssResult;
	}
	
	public BigDecimal getISSSResultSemanal(){
		isssResult = Salary.multiply(ISSSPercent).divide(operator4).setScale(2, BigDecimal.ROUND_UP);
		return isssResult;
	}
	
}
