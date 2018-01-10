package ch08;

public class Member {
	public static boolean canEntry(int age, Gender gender) {
		if (gender == Gender.MALE) return false;
		if (age > 25) return false;
		return true;
	}
}
