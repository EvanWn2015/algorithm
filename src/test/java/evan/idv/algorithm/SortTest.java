package evan.idv.algorithm;

import java.util.List;
import java.util.Random;

import org.junit.Test;

import com.google.common.collect.Lists;

import evan.idv.algorithm.beans.User;
import evan.idv.algorithm.sort.QuickSort;
import evan.idv.algorithm.sort.SelectionSort;

public class SortTest {

	@Test
	public void testQuickSort1() {
		int[] array = { 44, 556, 7, 2323, 45, 898, 123, 9978, 231 };
		QuickSort.sort(array);
		for (int v : array) {
			System.out.print(v + ", ");
		}
	}

	@Test
	public void testQuickSort2() {
		int[] array = { 44, 556, 7, 2323, 45, 898, 123, 9978, 231 };
		System.out.println("testQuickSort2");
		QuickSort.sortInPlace(array, 0, array.length - 1);
		for (int v : array) {
			System.out.print(v + ", ");
		}
	}

	@Test
	public void testSelectionSort() {
		int[] array = { 44, 556, 7, 2323, 45, 898, 123, 9978, 231 };
		System.out.println("testSelectionSort");
		for (int v : array) {
			System.out.print(v + ", ");
		}

		System.out.println("=========================");
		SelectionSort.sortArray(array);

		for (int v : array) {
			System.out.print(v + ", ");
		}

		System.out.println("=========================");

		List<User> list = Lists.newArrayList();
		for (int i = 1; i < 20; i++) {
			list.add(User.valueOf(new Random().nextInt(34), "name" + i, "opppoop"));
		}

		// List<String> list = Lists.newArrayList("A", "B", "H", "I", "J", "K",
		// "L", "M", "C", "D", "O", "P", "Q", "R",
		// "S", "T", "U", "V", "W", "X", "Y", "Z", "O", "E", "F", "G", "H", "I",
		// "J", "K", "L", "M", "N");
		SelectionSort.sortCollection(list);

		for (User v : list) {
			System.out.print(v.getId() + " -");
//			System.out.print(v.getName() + ", ");
		}
		// for (String v : list) {
		// System.out.print(v + " -");
		// }

	}

}
