package ch03;

public class Timeout {
	public int doLongTask() throws InterruptedException {
		Thread.sleep(101L);
		return 100;
	}
}
