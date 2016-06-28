package utilities;

import static org.junit.Assert.*;

import org.junit.Test;

public class DoubleUtilitiesTest
{
	@Test
	public void test_isNear_InvalidInputs_NullInputs_ThrowsException() {
		try {
			DoubleUtilities.isNear( null, null, null );
			fail("Supposed to catch NullPointerException");
		} catch ( NullPointerException npe ) {
			
		} catch ( Exception e ) {
			fail("Expected to catch NullPointerException");
		}
	}

	@Test
	public void test_isNear_InvalidInputs_HandlesNegativeTolerance_ExpectedResult() {
		assertTrue( DoubleUtilities.isNear( 3.05, 3.0, -0.1 ) );
	}
	
	@Test
	public void test_isNear_ValidInputs_NotCloseToTarget_ExpectedResult() {
		assertFalse( DoubleUtilities.isNear( 6.0, 3.0, 0.1 ) );
	}
	
	@Test
	public void test_isNear_ValidInputs_CloseToTarget_ExpectedResult() {
		assertTrue( DoubleUtilities.isNear( 3.05, 3.0, 0.1 ) );
	}
	
	@Test
	public void test_isNear_ValidInputs_IsTarget_ExpectedResult() {
		assertTrue( DoubleUtilities.isNear( 3.0, 3.0, 0.1 ) );
	}
	
	@Test
	public void test_isZero_InvalidInputs_NullInputs_ThrowsException() {
		try {
			DoubleUtilities.isNear( null, null, null );
			fail("Supposed to catch NullPointerException");
		} catch ( NullPointerException npe ) {
			
		} catch ( Exception e ) {
			fail("Expected to catch NullPointerException");
		}
	}

	@Test
	public void test_isZero_InvalidInputs_HandlesNegativeTolerance_ExpectedResult() {
		assertTrue( DoubleUtilities.isZero( 0.05, -0.1 ) );
	}
	
	@Test
	public void test_isZero_ValidInputs_NotCloseToZero_ExpectedResult() {
		assertFalse( DoubleUtilities.isZero( 4.0, 0.1 ) );
	}
	
	@Test
	public void test_isZero_ValidInputs_CloseToZero_ExpectedResult() {
		assertTrue( DoubleUtilities.isZero( 0.05, 0.1 ) );
	}
	
	@Test
	public void test_isZero_ValidInputs_IsZero_ExpectedResult() {
		assertTrue( DoubleUtilities.isZero( 0.0, 0.1 ) );
	}
}
