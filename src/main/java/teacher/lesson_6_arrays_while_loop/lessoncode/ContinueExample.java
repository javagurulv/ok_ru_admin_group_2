package teacher.lesson_6_arrays_while_loop.lessoncode;

class ContinueExample {

	public static void main(String[] args) {
		// int[][] arr = new int[5][8];

		int abc = 0;
		// abc = null;

		//int[] numbers = new int[5];
		int[] numbers = {12, 23, 45, 0};

		int[][] arr = {{0, 1, 0},
					   {4, 5, 9},
					   {7, 8, 0}};
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				int number = arr[i][j];
				if (j == 1) {
					continue;
					//break;
				}
				System.out.println("" + i + "," + j + " = " + number);
			}
		}
	}

}
