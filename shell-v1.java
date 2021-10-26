class ShellSort_v1 {

	static void shellSort(int numbers[]) {
		int len = numbers.length;
		int i, j, key;
		// Version 1: Use the gap n/2 and then gap 1
		// int gap = len / 2;
		int gap = 3;
		for (i = gap; i < len; i++) {
			key = numbers[i];
			for (j = i; j >= gap; j -= gap) {
				if (numbers[j - gap] > key) {
					numbers[j] = numbers[j - gap];
				} else
					break;
			}
			numbers[j] = key;
		}
		// Original Insertion Sort
		for (i = 1; i < len; i++) {
			key = numbers[i];
			for (j = i - 1; j >= 0; j--) {
				if (numbers[j] > key)
					numbers[j + 1] = numbers[j];
				else
					break;
			}
			numbers[j + 1] = key;
		}
	}

	static void printArray(int n[]) {
		int len = n.length;
		for (int i = 0; i < len; i++)
			System.out.print(n[i] + "\t");
		System.out.println();
	}

	public static void main(String args[]) {
		int numbers[] = { 54, 26, 93, 17, 77, 31, 33, 55, 20 }; // 9 elements
		System.out.println("Initail Arrays");
		printArray(numbers);

		shellSort(numbers);
		System.out.println("After Shell Sort");
		printArray(numbers);

	}

}