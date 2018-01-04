package ch03;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class ConstructorTest {
	@Test
	public void インスタンス化テスト() {
		Person instance = new Person("Duke");
		assertThat(instance.getName(), is("Duke"));
		assertThat(instance.getAge(), is(-1));
		assertThat(instance.getEmail(), is(nullValue()));
	}
}
