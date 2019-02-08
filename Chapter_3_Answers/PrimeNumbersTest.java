import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Test;

class PrimeNumbersTest {
	int exampleOneSize = 5;
	int exampleTwoSize = 11;
	int exampleThreeSize = 10;
	int exampleFourSize = 10;
	int exampleFiveSize = 10;
	List<Integer> primes;
	PrimeNumbers primeNumbers;
	
	int [] first10Primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
	
	@Test
	void test1() {
		primeNumbers = new PrimeNumbers();
		primes = new ArrayList<Integer>();
		
		primeNumbers.computePrimes(exampleOneSize);
		Iterator<Integer> itr = primeNumbers.iterator();

		for (int i = 0; i < exampleOneSize; i++) {
			primes.add(itr.next());
		}
		
		assertFalse(primes.contains(9));	
	}
	
	@Test
	void test2() {
		primeNumbers = new PrimeNumbers();
		primes = new ArrayList<Integer>();
		
		primeNumbers.computePrimes(exampleTwoSize);
		Iterator<Integer> itr = primeNumbers.iterator();

		for (int i = 0; i < exampleOneSize; i++) {
			primes.add(itr.next());
		}
		
		assertFalse(primes.contains(39));	
	}
	
	@Test
	void test3() {
		// In this case, there can't be an infection.
		// Each time a new number is evaluated, the process is made individually.	
	}
	
	@Test
	void test4() {
		// The failure doesn't propagate because each evaluation is individual.
		// A possible failure isn't going to affect the following evaluations.
	}
	
	@Test
	void test5() {
		primeNumbers = new PrimeNumbers();
		int[] primes = new int[10];		
		primeNumbers.computePrimes(exampleFiveSize);
		Iterator<Integer> itr = primeNumbers.iterator();

		for (int i = 0; i < exampleOneSize; i++) {
			primes[i] = itr.next();
		}
		
		assertArrayEquals(first10Primes, primes);	
	}

}
