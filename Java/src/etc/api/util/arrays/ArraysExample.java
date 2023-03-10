package etc.api.util.arrays;

import java.util.Arrays;

public class ArraysExample {

	public static void main(String[] args) {
		
		//배열의 복사
		char[] arr = {'J', 'A', 'V', 'A'};
		System.out.println(Arrays.toString(arr));
		
		char[] arr2 = Arrays.copyOf(arr, 2);
		char[] arr3 = Arrays.copyOf(arr, arr.length);
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		
		char[] arr4 = Arrays.copyOfRange(arr, 1, 3);;
		System.out.println(Arrays.toString(arr4));

		
		//배열의 탐색: binarySearch(배열, 검색할 값)  **반드시 정렬이 선행돼야 함**
		int[] numbers = {1, 3, 5, 7, 9, 11, 13};
		System.out.println("5의 위치: " + Arrays.binarySearch(numbers, 5));
		
		
		//배열의 정렬
		int[] nums = {42, 11, 35, 88, 34, 100};
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		
		//배열 내부 요소가 동일한지 여부를 확인하는 메서드
		System.out.println(Arrays.equals(numbers, nums));
		System.out.println(Arrays.equals(arr, arr3));
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
