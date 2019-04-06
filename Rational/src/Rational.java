/**
 * This class creates an object that gets a numerator and denominator,
 * and can output the decimal number -Josiah Moore
 */
public class Rational {
	
	private int numerator;
	private int denominator;
	
	/** The no-arg constuctor.
	 *  Sets the rational number to being 0 when divided
	 */
	public Rational()
	{
		numerator = 0;
		denominator = 1;
	}
	
	/**
	 *  The constructor that uses integers and ensures valid numbers
	 * @param n The numerator
	 * @param d The denominator
	 */
	public Rational(int n, int d)
	{
		numerator = n;
		if (d != 0)
		{
			denominator = d;
		}
		else
		{
			denominator = 1;
		}
	}
	
	/**
	 * The constructor that uses strings and ensures valid inputs
	 * @param numString The numerator string
	 * @param denString The denominator String
	 */
	public Rational(String numString, String denString)
	{
		numerator = Integer.parseInt(numString);
	
		if(Integer.parseInt(denString)!=0)
		{
			denominator = Integer.parseInt(denString);
		}
		else
		{
			denominator = 1;
		}		
	}
	
	/**
	 * Sets the numerator with the value given
	 * @param num The value given by the user
	 */
	public void setNumerator(int num)
	{
		numerator = num;
	}
	
	/**
	 * Set the numerator with a String value
	 * @param nString The value given by the user
	 */
	public void setNumerator(String nString)
	{
		numerator = Integer.parseInt(nString);
	}
	
	/**
	 * Sets the denominator with the valid value given
	 * @param den The value given by the user
	 */
	public void setDenominator(int den)
	{
		if (den !=0)
		{
			denominator = den;
		}
		else
		{
			denominator = 1;
		}
	}	
	
	/**
	 * Set the denominator with a valid string value given
	 * @param dString The value given by the user
	 */
	public void setDenominator(String dString)
	{
		if(Integer.parseInt(dString)!=0)
		{
			denominator = Integer.parseInt(dString);
		}
		else
		{
			denominator = 1;
		}		
	}
	
	/**
	 * Returns the current numerator to the user
	 * @return Returns the numerator
	 */
	public int getNumerator()
	{
		return numerator;
	}
	
	/**
	 * Returns the current denominator to the user
	 * @return Returns the denominator
	 */
	public int getDenominator()
	{
		return denominator;
	}
	
	/**
	 * Calculates the decimal value of the rational number
	 * @return Returns the value
	 */
	public double getDecimal()
	{
		double decimal = (double)numerator/denominator;
		return decimal;
	}
}
