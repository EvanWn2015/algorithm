package evan.idv.algorithm;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

import com.google.common.collect.HashMultimap;

public class OtherTest {

	@Test
	public void ttt() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 24; j++) {
				String v = j < 10 ? "0" + j : "" + j;

				System.out.println("ALTER TABLE yesee_nettraffic_stat.app_url_raw_2016120" + i + "_" + v
						+ "  ADD INDEX `src_ip` (`src_ip`), ADD INDEX `dst_ip` (`dst_ip`), ADD INDEX `host_name` (`host_name`) ;");
				// System.out.println("ALTER TABLE
				// yesee_nettraffic_stat.app_url_raw_2016120" + i + "_" + v
				// + " DROP INDEX `src_ip` ,DROP INDEX `dst_ip` ,DROP INDEX
				// `host_name`;");

			}
		}

	}

	@Test
	public void ttt2() {
		double fileCount = 3025;

		SimpleDateFormat simple = new SimpleDateFormat();
		simple.applyPattern("yyyy-MM-dd HH:mm:ss");
		try {
			Date startDate = simple.parse("2017-07-13 17:47:08");
			Date endDate = simple.parse("2017-07-13 17:48:13");

			long times = (endDate.getTime() - startDate.getTime()) / 1000;
			double result = times / fileCount;

			System.out.println(result);
		} catch (ParseException e) {
		}

	}

	@Test
	public void getSystemPath() {
		String osName = System.getProperty("os.name");
		System.out.println(osName);
		System.out.println(File.separator);
	}

	@Test
	public void ttt12() {
		int a = 3;
		int b = 4;
		int c;
		c = (int) Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		System.out.println(c);
	}

	@Test
	public void rtrtr() {
		int[] ids = { 6, 29, 43, 63, 68, 69, 250, 370, 593, 1252, 132, 133, 872, 1093, 1142, 1232, 142, 613, 1412, 1472,
				1930, 1872, 1916, 2033, 2134, 2174, 2195, 8, 450, 1772, 451, 134, 1053, 1393, 472, 145, 1233, 1613,
				1836, 1532, 1793, 1674, 1841, 1923, 1917, 1935, 1919, 1918, 1920, 2037, 2038, 2039, 2034, 2040, 2041,
				2035, 2036, 2012, 2175, 2136, 2137, 2140, 12, 2217, 1775, 1392, 136, 146, 1115, 1614, 1813, 1839, 1777,
				1512, 1675, 1794, 1832, 1837, 1842, 1852, 1936, 1894, 2032, 1993, 2013, 2108, 2113, 2146, 2173, 2139,
				2142, 2150, 7, 11, 2296, 15, 1124, 1126, 1129, 1130, 1131, 135, 137, 138, 139, 148, 149, 150, 1776,
				1778, 1844, 1833, 1838, 1857, 1121, 1937, 2105, 2097, 2110, 2148, 2144, 2151, 99, 101, 330, 512, 1073,
				1114, 155, 897, 1192, 1457 };

		Arrays.parallelSort(ids);

		Arrays.stream(ids).forEach(a -> {
			System.out.print(a + ", ");
		});

	}

	@Test
	public void rtrtdsfsdfr() {
		System.out.println(new Date().getTime());

		String[] dd = null;
		System.out.println((dd == null));

	}

	@Test
	public void sdfsdf() {
		List<String> numbers = Arrays.asList("w","t","w","t","6","2");
		numbers.parallelStream()
		.distinct()
		.forEach(System.out::println);

	}
}
