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

	@Test
	public void スタブメソッドの設定() throws Exception {
		List<String> stub = mock(List.class);
		when(stub.get(0)).thenReturn("Hello");
		assertThat(stub.get(0), is("Hello"));
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void 例外を送出するスタブメソッド() throws Exception {
		List<String> stub = mock(List.class);
		when(stub.get(0)).thenReturn("Hello");
		when(stub.get(1)).thenReturn("World");
		when(stub.get(2)).thenThrow(new IndexOutOfBoundsException());
		stub.get(2);
	}

	@Test(expected = RuntimeException.class)
	public void 戻り値がvoid型のメソッド() throws Exception {
		List<String> stub = mock(List.class);
		doThrow(new RuntimeException()).when(stub).clear();
		stub.clear();
	}

	@Test
	public void 任意の整数に対するスタブメソッド() throws Exception {
		List<String> stub = mock(List.class);
		when(stub.get(anyInt())).thenReturn("Hello");
		assertThat(stub.get(0), is("Hello"));
		assertThat(stub.get(1), is("Hello"));
		assertThat(stub.get(999), is("Hello"));
	}

	@Test
	public void モックの検証() throws Exception {
		List<String> mock = mock(List.class);
		mock.clear();
		mock.add("Hello");
		mock.add("Hello");
		verify(mock).clear();
		verify(mock, times(2)).add("Hello");
		verify(mock, never()).add("World");
	}

	@Test
	public void 部分的なモックオブジェクト() throws Exception {
		List<String> list = new java.util.LinkedList<String>();
		List<String> spy = spy(list);
		doReturn("Mockito").when(spy).get(1);
		spy.add("Hello");
		spy.add("World");
		verify(spy).add("Hello");
		verify(spy).add("World");
		assertThat(spy.get(0), is("Hello"));
		assertThat(spy.get(1), is("Mockito"));
	}
}
