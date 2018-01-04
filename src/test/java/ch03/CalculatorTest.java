package ch03;

import org.junit.Test;

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

}