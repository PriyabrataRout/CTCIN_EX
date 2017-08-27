package com.priya.CrackingTheCodingInterview;

import java.util.ArrayList;

public class ZeroMatrix {
	private static void processZeroMatrix(int[][] matrix, int rowLength, int colLength) {
		ArrayList<Integer> rowList = new ArrayList<>();
		ArrayList<Integer> colList = new ArrayList<>();

		for (int i = 0; i < rowLength; i++) {
			for (int j = 0; j < colLength; j++) {
				if (matrix[i][j] == 0) {
					rowList.add(i);
					colList.add(j);
				}
			}
		}

		for (Integer integer : rowList) {

			for (int colVal = 0; colVal < colLength; colVal++) {
				matrix[integer][colVal] = 0;
			}

		}

		for (Integer integer : colList) {
			for (int rowVal = 0; rowVal < rowLength; rowVal++) {
				matrix[rowVal][integer] = 0;
			}
		}
		display(matrix, rowLength, colLength);
	}

	private static void display(int[][] matrix, int m, int n) {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println("matrix[" + i + "][" + j + "]" + matrix[i][j]);
			}

		}
	}

	public static void main(String[] args) {
		int rowSize = 4, colSize = 5;

		int[][] matrix = new int[rowSize][colSize];

		int counter = 0;
		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < colSize; j++) {
				matrix[i][j] = ++counter;
			}

		}
		matrix[1][2] = 0;
		matrix[2][4] = 0;

		processZeroMatrix(matrix, rowSize, colSize);

	}

}
