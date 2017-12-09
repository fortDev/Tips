package string;

public class StringConcat {

	private static final int size = 40000;


	public static void main(String[] args) {
		
		System.out.println("Append, Append string: " + calcTime("appendAppend"));
		System.out.println("Append, Adding string: " + calcTime("appendAdding"));
		System.out.println("Adding, Adding string: " + calcTime("addingAdding"));
	}

	//Concating string on a new object
	private static void addingAdding() {
		String s1 = "Concated Numbers: ";
		String s2 = "";
		String s3 = "";
		for (int i = 0; i <= size; i++) {
			s2 = s2 + i + ", ";
		}
		s3 = s1 + s2;
		//System.out.println(s3);
	}

	//Concating string on the same object
	private static void appendAdding() {
		String s1 = "Concated Numbers: ";
		StringBuilder s2 = new StringBuilder();
		String s3 = "";
		for (int i = 0; i <= size; i++) {
			s2.append(i + ", ");
		}
		s3 = s1 + s2;
		//System.out.println(s3);
	}
	
	//Concating string on the same object
	private static void appendAppend() {
		String s1 = "Concated Numbers: ";
		StringBuilder s2 = new StringBuilder();
		String s3 = "";
		for (int i = 0; i <= size; i++) {
			s2.append(i).append(", ");
		}
		s3 = s1 + s2;
		//System.out.println(s3);
	}

	private static String calcTime(String s) {
		long startTime = System.currentTimeMillis();
		concatChoice(s);
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		return (totalTime + "ms");
	}

	
	private static void concatChoice(String s) {
		if (s.equals("addingAdding"))
			addingAdding();
		if (s.equals("appendAdding"))
			appendAdding();
		if (s.equals("appendAppend"))
			appendAppend();
	}

}
