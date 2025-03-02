package DSA.Step7StackandQueues;

public class TrappingRainwaterBrute {
	static int WaterUnits(int[] arr) {
		
		int n = arr.length;
		int left,right;
		int wu = 0;
		
		for(int i=0;i<n-1;i++) {
			left = i;
			right = i;
			int max1=-1,max2=-1;
			
			while(left>=0) {
				max1 = Math.max(arr[left], max1);
				left--;
			}
			while(right<n) {
				max2 = Math.max(arr[right], max2);
				right++;
			}	
			
		  wu = wu + Math.min(max1,max2)-arr[i];	 
		}
		
		return wu;
	}
	public static void main(String args[]) {
		int[] heights = {2, 0, 4, 0, 2, 0, 3, 0, 4, 0, 2};                             
		int ans = WaterUnits(heights);
		System.out.print(ans);
	}
}
//              _____                     _____
//              |   | 1    1   1  __1__ 1 |   |
//     _____    |   | 1  __1__ 1  |   | 1 |   |   _____
//     |   | 1  |   | 1  |   | 1  |   | 1 |   | 1 |   |
//   __|___|_1__|___|_1__|___|_1__|___|_1_|___|_1_|___|__     
//       2   0    4   0    2   0    3   0   4   0   2
//      