package ch09;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.rules.ErrorCollector;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class ShopInfoTest {
	public static class インスタンス化テスト {
		@Rule
		public ErrorCollector ec = new ErrorCollector();

		@Ignore("初期値が不正であるためテストは失敗する")
		@Test
		public void デフォルトコンストラクタ() throws Exception {
			ShopInfo instance = new ShopInfo();

			ec.checkThat(instance, is(notNullValue()));
			ec.checkThat(instance.id, is(nullValue()));
			ec.checkThat(instance.name, is(""));
			ec.checkThat(instance.address, is(""));
			ec.checkThat(instance.url, is(nullValue()));
		}
	}
}
