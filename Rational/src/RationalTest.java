
public class RationalTest {

	public static void main(String[] args) {
		String n = "-3";
		String d = "-1";
		Rational ration = new Rational(5,4);
		System.out.println(ration.getDecimal());
		ration.setNumerator(7);
		ration.setDenominator(23);
		System.out.println(ration.getNumerator());
		System.out.println(ration.getDenominator());
		ration.setNumerator("1");
		ration.setDenominator("2");
		System.out.println(ration.getNumerator());
		System.out.println(ration.getDenominator());
		System.out.println(ration.getDecimal());

	}

}
