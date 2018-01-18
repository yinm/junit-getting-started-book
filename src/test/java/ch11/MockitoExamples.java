package ch11;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.Test;

@SuppressWarnings("unchecked")
public class MockitoExamples {
	@Test
	public void モックオブジェクトに定義されたメソッドの戻り値() throws Exception {
		List<String> mock = mock(List.class);
		assertThat(mock.get(0), is(nullValue()));
		assertThat(mock.add("Hello"), is(false));
	}
}
