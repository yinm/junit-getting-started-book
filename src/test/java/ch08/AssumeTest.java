package ch08;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.junit.Assume.*;

import org.junit.Test;

public class AssumeTest {
	@Test
	public void assume() throws Exception {
		assumeThat(1, is(0));
		fail("この行は実行されない");
	}
}
