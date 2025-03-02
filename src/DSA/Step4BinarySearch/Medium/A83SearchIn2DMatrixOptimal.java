package DSA.Step4BinarySearch.Medium;

public class A83SearchIn2DMatrixOptimal{
	static int calculaterow(int mid,int c) {
		int row = mid/c;
		return row;
	}
	static int calculatecol(int mid,int c) {
		int col = mid%c;
		return col;
	}
	static void BS(int[][] arr,int r,int c,int tg) {
		int s=0,e=(r*c)-1;
		
		while(s<=e) {
			int mid = (s+e)/2;
			
			if(arr[calculaterow(mid,c)][calculatecol(mid,c)]==tg) {
				System.out.print("row = "+(calculaterow(mid,c)+1)+" & column = "+(calculatecol(mid,c)+1));
				break;
			}
			else if(arr[calculaterow(mid,c)][calculatecol(mid,c)]>tg) {
				e=mid-1;
			}
			else {
				s=mid+1;
			}
		}
	}
	public static void main(String args[]) {
		int[][] arr = {{3, 4, 7, 9},{12, 13, 16, 18},{20, 21, 23, 29}};
		int c = arr[0].length;
		int r = arr.length;
		
		int tg = 21;
		
		BS(arr,r,c,tg);
	
	}

}
