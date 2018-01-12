package ch09;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.io.File;

import org.junit.Rule;
import org.junit.Test;

import ch09.RunOn.OS;

public class OSDependentTest {
	@Rule
	public OSDependent osDependent = new OSDependent();

	@Test
	@RunOn(OS.WINDOWS)
	public void onlyWindows() throws Exception {
		System.out.println("test: onlyWindows");
		assertThat(File.separator, is("\\"));
	}

	@Test
	@RunOn(OS.MAC)
	public void onlyMac() throws Exception {
		System.out.println("test: onlyMac");
		assertThat(File.separator, is("/"));
	}
}
