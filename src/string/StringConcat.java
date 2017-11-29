package string;

public class StringConcat {

	public static void main(String[] args) {
		System.out.println("Adding string: " + calcTime("adding"));
		System.out.println("Append string: " + calcTime("append"));
	}

	// Concating string on a new object
	private static void adding() {
		String s1 = "Concated Numbers: ";
		String s2 = "";
		String s3 = "";
		for (int i = 0; i <= 50000; i++) {
			s2 = s2 + i + ", ";
		}
		s3 = s1 + s2;
		// System.out.println(s3);
	}

	// Concating string on the same object
	private static void append() {
		String s1 = "Concated Numbers: ";
		StringBuilder s2 = new StringBuilder();
		String s3 = "";
		for (int i = 0; i <= 50000; i++) {
			s2.append(i + ", ");
		}
		s3 = s1 + s2;
		// System.out.println(s3);
	}

	private static String calcTime(String s) {
		long startTime = System.currentTimeMillis();
		concatChoice(s);
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		return (totalTime + "ms");
	}

	private static void concatChoice(String s) {
		if (s.equals("adding"))
			adding();
		if (s.equals("append"))
			append();
	}

}
