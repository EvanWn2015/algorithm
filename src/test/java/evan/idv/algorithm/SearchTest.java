package evan.idv.algorithm;

import java.util.List;

import org.junit.Test;

import com.google.common.collect.Lists;

import evan.idv.algorithm.beans.User;
import evan.idv.algorithm.search.BinarySearch;
import evan.idv.algorithm.sort.QuickSort;

public class SearchTest {

	@Test
	public void testIterativeSearch() {
		List<String> list = Lists.newArrayList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N",
				"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "O");
		list = QuickSort.sort(list);
		int result = BinarySearch.iterativeSearch(list, "X");
		System.out.println(result);
		if (result > 0) {
			String string = list.get(result);
			System.out.println(string);
		}
	}

	@Test
	public void testIterativeSearch2() {

		List<User> list = Lists.newArrayList();
		for (int i = 1; i < 20; i++) {
			list.add(User.valueOf(i, "name" + i, "opppoop"));
		}

		list = QuickSort.sort(list);
		User uu = User.valueOf(5, "name" + 5, "opppoop");
		int result = BinarySearch.iterativeSearch(list, uu);
		System.out.println(result);
		User user = list.get(result);
		System.out.println(user.getName());

	}

}
