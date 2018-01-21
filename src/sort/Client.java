package sort;

public abstract class Client {
	public static void main(String[] args) {
		Partition partition=new Partition();
		int arr[]= {23,13,49,6,31,19,28};
		partition.qsort(arr, 0, 6);
		for (int k = 0; k < 1000; k++) {
			int k1=(int)(Math.random()*61);
			if(k1==60)
			System.out.println(k1);
		}
	}
	Throwable
}
