package DSA.Step3Arrays.Hard;
public class B12CountInversionsOptimal {
	static int merge(int[] arr,int s,int mid ,int e) {
		int [] temp = new int[e-s+1];
		int left=s;
		int right=mid+1;
		int indx=0;
		
		int c=0;
		
		while(left<=mid && right<=e ) {
			if(arr[left]>=arr[right]) {
				temp[indx]=arr[right];
				right++;	
				indx++;
				c=c+(mid-left+1);
			}
			else {
				temp[indx]=arr[left];
				left++;
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
		return c;
	}
	static int divide(int[] arr,int s,int e) {
		int c=0;
		if(s>=e) {
			return c;
		}
		int mid =s+(e-s)/2;
		c=c+divide(arr,s,mid);
		c=c+divide(arr,mid+1,e);
		c=c+merge(arr,s,mid,e);
		return c;
	}
	
	public static void main(String args[]) {
		int[] arr = {5,3,2,4,1};
		int l = arr.length;
		int s=0;
		int e=l-1;
		
		int c=divide(arr,s,e);
		
		System.out.print(c);
	}

}
