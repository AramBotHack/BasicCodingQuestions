package Geeks_for_Geeks;

import java.util.Arrays;

public class Minimum_Inc_SS {

	public static void main(String[] args) {

		
		
	}

	// Longest Decreasing Subsequences
	static int lds(int[] arr, int n) {

		int[] dp = new int[n];

		dp[0] = 1;
		for (int i = 1; i < arr.length; i++) {
			dp[i] = 1;
			for (int j = i - 1; j >= 0; i--) {
				if (arr[j] < arr[i])
					continue;

				if (dp[j] > dp[i])
					dp[i] = 1 + dp[j];
			}
		}

		Arrays.sort(dp);
		return dp[dp.length - 1];

	}

}
