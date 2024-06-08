package Sort;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[5];
		
		arr[0] = 20;
		arr[1] = 12;
		arr[2] = 45;
		arr[3] = 97;
		arr[4] = 85;
		
		int small = 0;
		int index = 0;
		
		
		for(int i = 0 ; i < (arr.length - 1) ; i++  ) {
			
			small = arr[i];
			index = i;
			
			for(int j = i ; j < (arr.length - 1) ; j++) {
				
				if(small > arr[j+1]) {
					
					small = arr[j+1];
					index = j+1;
				}
				
			}
			
			int a = arr[index];
			arr[index] = arr[i];
			arr[i] = a;
			
			
			
			
		}
		

	}

}
