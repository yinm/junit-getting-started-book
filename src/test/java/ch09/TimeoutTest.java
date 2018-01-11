package ch09;

import static ch09.TimeoutExample.*;

import org.junit.Test;

public class TimeoutTest {
	@Test(timeout = 100L)
	public void アノテーションを使ったタイムアウト() throws Exception {
		doLongTask();
	}
}
