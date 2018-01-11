package ch09;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class ExceptionTest {
	@Test(expected = IllegalArgumentException.class)
	public void 例外の発生を検証する標準的なテスト() throws Exception {
		throw new IllegalArgumentException();
	}

	@Test
	public void 例外の発生とメッセージを検証する標準的なテスト() throws Exception {
		try {
			throwNewIllegalArgumentException();
			fail("例外が発生しない");
		} catch (IllegalArgumentException e) {
			assertThat(e.getMessage(), is("argument is null."));
		}
	}

	private void throwNewIllegalArgumentException() {
		throw new IllegalArgumentException("argument is null.");
	}
}
