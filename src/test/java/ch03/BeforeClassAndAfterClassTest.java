package ch03;

import org.junit.AfterClass;
import org.junit.BeforeClass;

public class BeforeClassAndAfterClassTest {
	@BeforeClass
	public static void setUpClass() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
	}

	@AfterClass
	public static void tearDownClass() throws Exception {
		GlobalResources.release();
	}
}
