
public class Warmup {
	public static void main(String[] args) {
		int[] A = { 17, 62, 19, 8, 1, 10, 20, 20, 20, 10 };
		Stack myStack = new Stack();
		System.out.println(backtrackingSearch(A, 10, 3, 2, myStack));
	}
	

	public static int backtrackingSearch(int[] arr, int x, int forward, int back, Stack myStack) {
		int f = 0;
		for (int i = 0; i < arr.length; i++) {
			f++;
			myStack.push(arr[i]);
			if (arr[i] == x)
				return i;
			if (f == forward) {
				for (int j = 0; j < back; j++)
					myStack.pop();
				f = 0;
				i = i - back;
			}
		}
		return -1;
	}

	public static int consistentBinSearch(int[] arr, int x, Stack myStack) {
		int high = arr.length - 1;
		int low = 0;
		while (high >= low) {
			int mid = (high + low) / 2;
			if (arr[mid] == x)
				return mid;
			int inconsistencies = Consistency.isConsistent(arr);
			while (inconsistencies > 0) {
				int index = (int) myStack.pop();
				inconsistencies--;
				mid = index;
			}
			myStack.push(mid);
			if (arr[mid] > x)
				high = mid - 1;
			else
				low = mid + 1;
		}
		return -1;
	}

}
