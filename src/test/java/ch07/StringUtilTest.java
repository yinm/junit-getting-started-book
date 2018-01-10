package ch07;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {
	@Test
	public void isEmptyOrNullは空文字列でtrueを返す() throws Exception {
		String input = "";
		boolean expected = true;
		boolean actual = StringUtil.isEmptyOrNull(input);
		assertThat(actual, is(expected));
	}

	@Test
	public void isEmptyOrNullはAAAでfalseを返す() throws Exception {
		String input = "AAA";
		boolean expected = false;
		boolean actual = StringUtil.isEmptyOrNull(input);
		assertThat(actual, is(expected));
	}
}
