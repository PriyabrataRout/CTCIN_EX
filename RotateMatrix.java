package com.priya.CrackingTheCodingInterview;

public class RotateMatrix {

	private static void rotateMatrix(int[][] matrix, int n) {
		for (int layer = 0; layer < n / 2; layer++) {
			int first = layer;
			int last = n - 1 - first;

			for (int i = first; i < last; i++) {
				int offset = i - first;
				int top = matrix[first][i];

				// Left to Top
				matrix[first][i] = matrix[last - offset][first];

				// Bottom to Left
				matrix[last - offset][first] = matrix[last][last - offset];

				// Right to Bottom
				matrix[last][last - offset] = matrix[i][last];

				// Top to Right
				matrix[i][last] = top;

			}

		}

		display(matrix);

	}

	private static void display(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.println("matrix[" + i + "][" + j + "]" + matrix[i][j]);
			}

		}
	}

	public static void main(String[] args) {

		int[][] matrix = new int[4][4];

		int counter = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = ++counter;
			}

		}

		rotateMatrix(matrix, matrix.length);

	}

}
