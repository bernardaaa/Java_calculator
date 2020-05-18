package arrays;

public class Student {

	private String name;
	private int[] marks;
	
	public Student(String name, int[] marks) {
		this.name = name;
		this.marks = marks;
	}

	public int getMaxMark() {
		int trenutna = 0;
		for (int i = 0; i <= marks.length; i++) {
			if (marks[i] > trenutna) 
				marks[i] = trenutna;
			}
		return trenutna;
	}

	public int getNumberOfMarks() {
		return marks.length;
	}

}
