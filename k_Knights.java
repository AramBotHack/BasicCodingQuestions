package Contest3;

import java.util.Scanner;

public class k_Knights {

	static int count;

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		NKnights(new boolean[n][n], 0, 0, 0, n, "");
		System.out.println(count);
	}

	public static void NKnights(boolean[][] board, int row, int col, int kpsf, int tk, String ans) {

		if (kpsf == tk) {

			count++;

			System.out.println(ans+" ");

			return;

		}

		if (row == board.length) {

			return;

		}

		if (col == board[0].length) {

			NKnights(board, row + 1, 0, kpsf, tk, ans);

			return;

		}

		// yes

		if (isItSafeToPlaceKnight(board, row, col)) {

			board[row][col] = true;

			NKnights(board, row, col + 1, kpsf + 1, tk, ans + "{" + row + "-" + col + "} ");

			board[row][col] = false;

		}

		NKnights(board, row, col + 1, kpsf, tk, ans);

	}

	public static boolean isItSafeToPlaceKnight(boolean[][] board, int row, int col) {

		int[] rowsArr = { -1, -2, -2, -1 };

		int[] colArr = { -2, -1, 1, 2 };

		for (int idx = 0; idx < rowsArr.length; idx++) {

			int nr = row + rowsArr[idx];

			int nc = col + colArr[idx];

			if (nr >= 0 && nr < board.length && nc >= 0 && nc < board[0].length && board[nr][nc]) {

				return false;

			}

		}

		return true;

	}
}
