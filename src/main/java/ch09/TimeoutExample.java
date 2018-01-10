package ch09;

public class TimeoutExample {
	static void doLongTask() throws InterruptedException {
		Thread.sleep(50L);
	}
}
