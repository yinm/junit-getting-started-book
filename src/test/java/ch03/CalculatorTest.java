package ch03;

import org.junit.Test;
import org.junit.Before;
import org.junit.Ignore;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class CalculatorTest {
	@Test
	public void addに3と4を与えると7を返す() throws Exception {
		Calculator sut = new Calculator();
		sut.init();
		int actual = sut.add(3, 4);
		assertThat(actual, is(7));
		sut.shutdown();
	}

	Calculator sut;

	@Before
	public void setUp() throws Exception {
		sut = new Calculator();
		sut.init();
	}

	@Ignore("未実装")
	@Test
	public void divide4と2を与えると2を返す() throws Exception {
		int actual = sut.divide(3, 4);
		assertThat(actual, is(7));
	}
}