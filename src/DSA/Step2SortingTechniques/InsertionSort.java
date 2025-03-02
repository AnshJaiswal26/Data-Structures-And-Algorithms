package DSA.Step2SortingTechniques;
import java.util.Scanner;
class InsertionSort {
	public static void main(String [] args) {
		Scanner Sc= new Scanner (System.in);
		
		int s,temp,j;
	    System.out.print("Enter Size of an array = ");
	    s=Sc.nextInt();
	    
	    int[] arr=new int[s]; 
	    for(int i=0;i<s;i++) {
	    	arr[i]=Sc.nextInt();
	    }
	    
	    for(int i=1;i<arr.length;i++) {
	    	temp=arr[i];
	    	j=i;
	    	while(j>0 && arr[j-1]>temp ) {
	    		arr[j]=arr[j-1];
	    		j=j-1;
	    	}
	    	arr[j]=temp;
	    }
	    for(int i=0;i<s;i++) {
	    	System.out.print(arr[i]+" ");
	    }
	    
	}

}
