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
}