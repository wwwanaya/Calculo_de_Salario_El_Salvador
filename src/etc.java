import java.math.BigDecimal;
import java.util.Random;

public class etc {
	
	public static BigDecimal operator2 = new BigDecimal("2");
	public static BigDecimal operator4 = new BigDecimal("4");
	public static Random randomNumber = new Random();
	
	public static int getRandomNumber(int min, int max){
		int n = randomNumber.nextInt(max) + min;
		return n;
	}
	
	/*public static String printAdorno(String txt){
		int i = getRandomNumber(1, 3);
		String adornito = new String(txt);
		//System.out.println(i);
		
		for (int x = 0; x < i; x++){
			adornito = adornito + adornito;
		}
		
		String result;
		
		return result = adornito + txt + adornito;
	}*/

}
