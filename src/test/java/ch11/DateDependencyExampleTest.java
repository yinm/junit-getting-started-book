package ch11;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class DateDependencyExampleTest {
	@Test
	public void doSomethingでdateに現在時刻が設定される() throws Exception {
		DateDependencyExample sut = new DateDependencyExample();
		sut.doSomething();
		// 実行タイミングによって、成功にも失敗にもなるアサーション
		assertThat(sut.date, is(new Date()));
	}
}
