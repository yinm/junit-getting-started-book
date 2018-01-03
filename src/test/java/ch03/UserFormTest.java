package ch03;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class UserFormTest {
	@Test
	public void isValidはusreNameとpasswordがからでない場合にtrueを返す() throws Exception {
		UserForm sut = new UserForm("user01", "1234");
		assertThat(sut.isValid(), is(true));
	}

	@Test
	public void userNameが空のときにエラーメッセージが取得できる() throws Exception {
		UserForm sut = new UserForm("", "1234");
		String expected = "ユーザIDは必須項目です。";
		String actual = sut.getErrorMessage();
		assertThat(actual, is(expected));
	}
}