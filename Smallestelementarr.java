public class Smallestelementarr {
	public static void main(String[] args) {
		int arr[]= {10,20,50,30,5,4,3,2,1};
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("The minimum or smallest element from the array is "+min);
	}
}