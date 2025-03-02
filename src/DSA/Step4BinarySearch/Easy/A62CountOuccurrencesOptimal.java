package DSA.Step4BinarySearch.Easy;
public class A62CountOuccurrencesOptimal {
		static int FirstBinarySearch(int[] arr,int x) {
			int s=0,e=arr.length-1;
			int ans=-1;
			
			while(s<=e) {
				int mid = s+(e-s)/2;
				if(arr[mid]==x) {
					ans=mid;
					e=mid-1;
				}
				else if(arr[mid]<x) {
					s=mid+1;
				}
				else {
					e=mid-1;
				}
			}
			return ans;
		}
		static int LastBinarySearch(int[] arr,int x) {
			int s=0,e=arr.length-1;
			int ans=-1;
			
			while(s<=e) {
				int mid = s+(e-s)/2;
				if(arr[mid]==x) {
					ans=mid;
					s=mid+1;
				}
				else if(arr[mid]>x) {
					e=mid-1;
				}
				else {
					s=mid+1;
				}
			}
			return ans;
		}
		public static void main(String args[]) {
			int[] arr = {2,4,6,8,8,8,11,13};
			int x=8;
			
			int Last = LastBinarySearch(arr,x);
			int First = FirstBinarySearch(arr,x);
			
			System.out.print(Last-First+1);
		}

	}


