package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GCDOPS {

	public static void main(String[] args) {

		FastReader scn = new FastReader();

		int tc = scn.nextInt();

		while (tc-- > 0) {
			int n = scn.nextInt();

			int[] barr = new int[n + 1];
			for (int i = 1; i <= n; i++) {
				barr[i] = scn.nextInt();
			}

			int state = 0;
			for (int i = 1; i <= n; i++) {

				if (barr[i] != i && barr[i] > n) {
					System.out.println("NO");
					state = 1;
					break;
				}

				else if (barr[i] != i && i % barr[i] != 0) {
					System.out.println("NO");
					state = 1;
					break;
				}

			}

			if (state == 0) {
				System.out.println("YES");
			}

		}

	}

	static boolean isPrime(int n) {

		if (n <= 1)
			return false;
		if (n <= 3)
			return true;

		if (n % 2 == 0 || n % 3 == 0)
			return false;

		for (int i = 5; i * i <= n; i = i + 6)
			if (n % i == 0 || n % (i + 2) == 0)
				return false;

		return true;
	}

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

}
