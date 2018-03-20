package com.coveros.hello_world_tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.coveros.hello_world.EvenNumberGenerator;

public class EvenNumberGeneratorTest {
 @Test
 	public void testRandomEvenNumberGenerator() {
	
	  int randomResult = EvenNumberGenerator.generateRandomEven();
	
	  assertEquals(0, randomResult % 2);
 	}
 @Test
 	public void testRandomOddNumberGenerator() {
		
		int randomResult2 = EvenNumberGenerator.generateRandomOdd();
		assertEquals(1, randomResult2 % 2);
	}
}