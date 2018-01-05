package ch04;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class AssertionFailTest {
	AssertionFail sut;

	@Before
	public void setUp() throws Exception {
		sut = new AssertionFail();
	}

	@Ignore
	@Test
	public void なにか難しいけど重要なテストケース() {
		fail("TODO: テストコードを実装する");
	}

	@Test(expected = IllegalStateException.class)
	public void timeoutがtrueの時にロジックが実行されないこと() {
		Runnable logic = new Runnable() {
			public void run() {
				fail("run が呼ばれてしまった");
			}
		};

		sut.timeOut = true;
		sut.invoke(logic);
	}
}
