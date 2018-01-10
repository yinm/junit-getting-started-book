package ch07;

import static ch07.BookStoreTestHelper.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class BookStoreTest {
	@Test
	public void getTotalPrice() throws Exception {
		BookStore sut = new BookStore();
		Book book = Bookオブジェクトの作成_MartinFowlerのRefactoring();
		sut.addToCart(book, 1);;

		assertThat(sut.getTotalPrice(), is(4500));
	}

	@Test
	public void get_0() throws Exception {
		BookStore sut = new BookStore();
		Book book = Bookオブジェクトの作成_MartinFowlerのRefactoring();
		sut.addToCart(book, 1);

		assertThat(sut.get(0), is(sameInstance(book)));
	}
}
