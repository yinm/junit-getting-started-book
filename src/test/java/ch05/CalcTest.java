package ch05;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {
	@Test
	public void addに3と4を与えると7を返す() {
		Calc sut = new Calc();
		assertThat(sut.add(3, 4), is(7));
	}

	public static void main(String[] args) {
		org.junit.runner.JUnitCore.main(CalcTest.class.getName());
	}
}
