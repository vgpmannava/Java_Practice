package com.practice.arrays;

public class MultiDIArrays {

	public static void main(String[] args) {

		int[][] multiArray = {{1, 2, 3}, {4, 5}, {7, 8,9, 10}};

		int diagSum = 0;
		for (int i = 0; i < multiArray.length; i++) {
			for (int j = 0; j < multiArray[i].length; j++) {

				System.out.println("Length...multiArray.length...." + multiArray.length+"....multiArray[i].length..."+multiArray[i].length);					System.out.println("Length...multiArray.length...." + multiArray.length+"....multiArray[i].length..."+multiArray[i].length);

				if (i == j) {

					System.out.println("int["+ i + "][" + j+"] = " + multiArray[i][j]);
					diagSum += multiArray[i][j];
				}
			}
		}
		System.out.println("Diagonal Sum = " + diagSum);
	}

}
