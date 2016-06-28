package utilities;

public class DoubleUtilities
{	
	/**
	 * Tells us if the double is near or equal to the target.
	 * @param input The value to test.
	 * @param target The value to compare against.
	 * @param tolerance How close to the target we can get.  (Should be positive)
	 * @return
	 */
	public static boolean isNear(Double input, Double target, Double tolerance) {
		tolerance = Math.abs( tolerance );
		return ( input <= (target + tolerance) && input >= (target - tolerance) );
	}
	
	/**
	 * Specialized version of isNear, where target is zero.
	 * @param input The value to test.
	 * @param tolerance How close to the target (0.0) we can get.  (Should be positive)
	 * @return
	 */
	public static boolean isZero(Double input, Double tolerance) {
		tolerance = Math.abs( tolerance );
		return ( input <= (0.0 + tolerance) && input >= (0.0 - tolerance) );
	}
}
