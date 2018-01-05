package ch04;

import static ch04.IsDate.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Ignore;
import org.junit.Test;

public class IsDateTest {
	@Test
	public void 日付の比較() throws Exception {
		Date date = new Date();
		assertThat(date, is(dateOf(2011, 2, 10)));
	}
}
