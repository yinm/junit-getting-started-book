package ch04;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class AssertionThat {
	@Test
	public void assertion() {
		String actual = "Hello" + " " + "World";
		assertThat(actual, is("Hello World"));
	}
}