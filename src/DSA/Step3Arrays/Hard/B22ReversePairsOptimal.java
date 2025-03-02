package DSA.Step3Arrays.Hard;

public class B22ReversePairsOptimal {
	static int ReversePairs(int[] arr,int s,int mid,int e) {
		
		int right=mid+1;
		int c=0;
		
		for(int i=s;i<=mid;i++) {
			while(right<=e && arr[i]>2*arr[right]) {
				right++;
				}
			c = c + (right-(mid+1));
		}
		return c;
	}
	static void merge(int[] arr,int s,int mid,int e) {
		int left = s;
		int right = mid+1;
		
		int[] temp = new int[e-s+1];
		int indx =0;
		
		while(left<=mid && right<=e) {
			if(arr[left]<=arr[right]) {
				temp[indx]=arr[left];
				left++;
				indx++;
			}
			else {
				temp[indx]=arr[right];
				right++;
				indx++;
			}
		}
		
		while(left<=mid) {
			temp[indx]=arr[left];
			left++;
			indx++;
		}
		while(right<=e) {
			temp[indx]=arr[right];
			right++;
			indx++;
		}
		
		for(int i=0,j=s;i<temp.length;i++,j++) {
			arr[j]=temp[i];
		}
	}
	static int divide(int[] arr,int s,int e) {
		int c=0;
		
		if(s>=e) {
			return c;
		}
		int mid=s+(e-s)/2;
		
		c=c+divide(arr,s,mid);
		c=c+divide(arr,mid+1,e);
		c=c+ReversePairs(arr,s,mid,e);
		merge(arr,s,mid,e);
		
		return c;
	}
	public static void main(String args[]) {
		int[] arr = {4, 1, 2, 3, 1};
		int l = arr.length;
		
		int s,e;
		s=0;
		e=l-1;
				
		int c =divide(arr,s,e);
		
		System.out.print(c);
	}

}
