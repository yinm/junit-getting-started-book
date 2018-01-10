package ch09;

import static ch09.TimeoutExample.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TimeoutExampleTest {
	@Rule
	public Timeout timeout = new Timeout(100);

	@Test
	public void 長い時間がかかるかもしれないテスト() throws Exception {
		doLongTask();
	}
}
