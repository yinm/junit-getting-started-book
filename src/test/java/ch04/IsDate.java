package ch04;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;

public class IsDate extends BaseMatcher<Date> {
	@Override
	public boolean matches(Object actual) {
		return false;
	}

	@Override
	public void describeTo(Description desc) {
	}
}
