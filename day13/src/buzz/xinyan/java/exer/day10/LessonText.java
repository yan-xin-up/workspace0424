package buzz.xinyan.java.exer.day10;

public class LessonText {
	public static void main(String[] args) {
		Lesson c = new Lesson("c", "yui_mikami");
		c.show();
		Lesson java = new Lesson("java", "ishihara_sotomi");
		java.show();
		Lesson PhP = new Lesson("PhP", "moe");
		PhP.show();
		Lesson python = new Lesson("python", "argaki_yui");
		python.show();
	}
}

class Lesson {
	private String course;
	private String teacher;

	public Lesson() {

	}

	public Lesson(String course, String teacher) {
		super();
		this.course = course;
		this.teacher = teacher;
	}
	public void show() {
		System.out.println("course: "+course+"。 teacher: "+teacher);
	}

}
