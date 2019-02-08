public class PrimeSieve {
	boolean[] A;
	
	private void sieve(int n) {
		this.A = new boolean[n];
		for(int i = 0; i < A.length; i++) {
			A[i] = true;
		}
		if(n > 1) {
			for(int i = 2; i*i <= n; i++) {
				if(A[i] == true) {
					for(int j = i*i; j < n; j+=i) {
						A[j] = false;
					}
				}
			}
		} else {
			System.out.println("n must be > 1");
		}
	}
	
	private void print() {
		for(int i = 2; i < A.length; i++) {
			if(A[i] == true && (i % 10 != 9)) {
				System.out.print(i + " ");
			}
		}
	}
	
	
	public static void main(String[] args) {
		PrimeSieve primes = new PrimeSieve();
		primes.sieve(1000);
		primes.print();
	}
}
