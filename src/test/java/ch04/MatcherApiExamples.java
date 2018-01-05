package ch04;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.junit.matchers.JUnitMatchers.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class MatcherApiExamples {
	@Test
	public void CoreMatchers_is() throws Exception {
		String actual = "Hello" + " " + "World";
		String expected = "Hello World";
		assertThat(actual, is(expected));
	}

	@Test
	public void CoreMatchers_nullValue() throws Exception {
		String actual = null;
		assertThat(actual, is(nullValue()));
	}
}
