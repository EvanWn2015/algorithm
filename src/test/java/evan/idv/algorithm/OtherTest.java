package evan.idv.algorithm;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

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
	public void getSystemPath (){
		String osName = System.getProperty("os.name");
		System.out.println(osName);
		
		System.out.println(File.separator);
	}
}
