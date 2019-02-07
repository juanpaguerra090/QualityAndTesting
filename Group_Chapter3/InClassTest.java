import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InClassTest {
	   private EH eh1; private EH eh2; private EH eh3;

	   //  Question 1
	   @BeforeEach public void setUp() { eh1 = new EH(3); eh2 = new EH(5); eh3 = new EH(3); }

	   @Test public void noNPE() {
		   assertEquals(false, eh1.equals(null));
	   }          // Question 2

	   @Test public void equalsFalse() {
		   assertEquals(false, eh1.equals(eh2));
	   }    // Question 3

	   @Test public void equalsTrue() {
		   assertEquals(true, eh1.equals(eh3));
	   }     // Question 4

	   @Test public void hashConsistent() {
		   boolean ex = eh1.hashCode() == eh3.hashCode();
		   assertEquals(true,ex);
	   } // Question 5
	}

	class EH {
	   private int x;
	   public EH(int x) { this.x = x; }

	   @Override public boolean equals(Object obj) {
	      if (!(obj instanceof EH)) return false;
	      return ((EH) obj).x == this.x;
	   }
	   @Override public int hashCode() { return x; }
	}
