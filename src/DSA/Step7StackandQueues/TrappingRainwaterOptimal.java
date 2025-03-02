package DSA.Step7StackandQueues;

public class TrappingRainwaterOptimal {
	static int WaterUnits(int[] arr) {
		
		int n = arr.length;
		int left=0,right=n-1;
		int wu = 0;
		int leftmax = 0;
		int rightmax = 0;
		
		while(left<right) {
			if(arr[left]<=arr[right]) {
				leftmax = Math.max(arr[left], leftmax);
				wu = wu + leftmax-arr[left];
				left++;
			}
			else {
				rightmax = Math.max(arr[right], rightmax);
				wu = wu + rightmax-arr[right];
				right--;
			}
			
		}
		
		return wu;
	}
	public static void main(String args[]) {
		int[] heights = {2, 0, 4, 0, 2, 0, 3, 0, 4, 0, 2};                             
		int ans = WaterUnits(heights);
		System.out.print(ans);
	}
}

//       0   2    0   4    2   3    1   4   0   2   0
//              _____                     _____
//              |   | 1    1   1  __1__ 1 |   |
//     _____    |   | 1  __1__ 1  |   | 1 |   |   _____
//     |   | 1  |   | 1  |   | 1  |   | 1 |   | 1 |   |
//   __|___|_1__|___|_1__|___|_1__|___|_1_|___|_1_|___|__     
//       2   0    4   0    2   0    3   0   4   0   2
//                                         l r