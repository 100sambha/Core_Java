package abbc;

import java.util.Arrays;

class UserMainCode {
	public int[] SortStudentMarks(int input1, int input2, int[][] input3) {
		int N = input1;
		int M = input2;

		double[] subjectAverages = new double[M];
		for (int j = 0; j < M; j++) {
			int sum = 0;
			for (int i = 0; i < N; i++) {
				sum += input3[i][j];
			}
			subjectAverages[j] = (double) sum / N;
		}

		int minIndex = 0;
		for (int j = 1; j < M; j++) {
			if (subjectAverages[j] < subjectAverages[minIndex]) {
				minIndex = j;
			}
		}
	
		
		System.out.println();

		int[] totalMarks = new int[N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (j != minIndex) {
					totalMarks[i] += input3[i][j];
				}
			}
		}
		return totalMarks;
	}
}

public class TestJisa {
	public static void main(String[] args) {
		UserMainCode umc = new UserMainCode();

		int input1 = 3;
		int input2 = 3;
		int[][] input3 = { 
				{ 50, 30, 70 }, 
				{ 30, 70, 99 }, 
				{ 99, 20, 30 } };

		int[] result = umc.SortStudentMarks(input1, input2, input3);
		System.out.println(Arrays.toString(result));
	}
}