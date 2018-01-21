package sort;

public class Partition {
	public int partition(int[] arr,int first,int end) {
		int i=first,j=end;
		while (i<j) {
			while (i<j&&arr[i]<=arr[j]) {
				j--;
			}
			if(i<j) {
				int c;
				c=arr[i];
				arr[i]=arr[j];
				arr[j]=c;
				i++;
			}
			while (i<j&&arr[i]<=arr[j]) {
				
				i++;
			}
			if(i<j) {
				int c;
				c=arr[i];
				arr[i]=arr[j];
				arr[j]=c;
				j--;
			}
		}
		return i;
	};
	public void qsort(int[] arr,int first,int end) {
		int privot;
		if(first<end) {
			privot=partition(arr, first, end);
			qsort(arr, first, privot-1);
			qsort(arr, privot+1,end);
		}
		
	}
}
