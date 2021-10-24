import java.util.Random;

class ShellSort_v2 {

	static void shellSort(int numbers[]) {
		int len = numbers.length;
		for (int gap = len / 2; gap > 0; gap /= 2)
			for (int i = gap; i < len; i++) {
				int key = numbers[i];
				int j;
				for (j = i; j >= gap; j -= gap) {
					if (numbers[j - gap] > key) {
						numbers[j] = numbers[j - gap];
					} else
						break;
				}
				numbers[j] = key;
			}

	}

	static void printArray(int n[]) {
		int len = n.length;
		for (int i = 0; i < len; i++)
			System.out.print(n[i] + "\t");
		System.out.println();
	}

	public static void main(String args[]) {
		// int numbers[] = { 41, 15, 82, 5, 65, 19, 32, 43, 8 }; // 9 elements
		int N = 9;
		int numbers[] = new int[N];
		Random rand = new Random();
		for (int i = 0; i < N; i++) {
			numbers[i] = rand.nextInt(100);
		}

		System.out.println("Initail Arrays");
		printArray(numbers);

		shellSort(numbers);
		System.out.println("After Shell Sort");
		printArray(numbers);

	}

}