package practicepg;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortArray {

	public static void main(String[] args) {

		int a[] = { 7, 2, 3, 8, 4, 1, 5, 9, 6 };
		System.out.println("Before Sorting.....");
		System.out.println(Arrays.toString(a));
		int n = a.length;

		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;

				}

			}
		}
		
		List<int[]>list=Arrays.asList(a);
		
		list=list.stream().sorted().collect(Collectors.toList());
		
		for(int[] a1:list)
		{
			System.out.println("hsfkyefj    "+a1);

		}
		
		System.out.println("After Sorting.....");
		System.out.println(Arrays.toString(a));

	}

}
