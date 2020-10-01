package Contest3;

import java.util.Scanner;

public class Nqueens {

	static int count;

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		boolean[][] board = new boolean[n][n];

		NQueens(board, 0, "");
		System.out.print(count);
	}

	public static void NQueens(boolean[][] board, int row, String ans) {

		if (row == board.length) {

			System.out.println(ans);

			count++;
			return;

		}

		for (int col = 0; col < board[0].length; col++) {

			if (isItSafeToPlaceQueen(board, row, col)) {

				board[row][col] = true;

				NQueens(board, row + 1, ans + "{" + (row+1) + "-" + (col+1) + "} ");

				board[row][col] = false;

			}

		}

	}

	public static void display(boolean[][] board) {

		for (int i = 0; i < board.length; i++) {

			for (int j = 0; j < board[0].length; j++) {

				System.out.print(board[i][j] + " ");

			}

			System.out.println();

		}

		System.out.println("----------------------");

	}

	public static boolean isItSafeToPlaceQueen(boolean[][] board, int row, int col) {

		// vertically up

		int r = row - 1;

		int c = col;

		while (r >= 0) {

			if (board[r][c]) {

				return false;

			}

			r--;

		}

		// diagonally left

		r = row - 1;

		c = col - 1;

		while (r >= 0 && c >= 0) {

			if (board[r][c]) {

				return false;

			}

			r--;

			c--;

		}

		// diagonally right

		r = row - 1;

		c = col + 1;

		while (r >= 0 && c < board[0].length) {

			if (board[r][c]) {

				return false;

			}

			r--;

			c++;

		}

		return true;

	}

}
