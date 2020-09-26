package buzz.xinyan.java.exe;

/*
 * 成员变量 int yearsOld
 * 方法 printAge 打印 yearsOld 的值。
 */
public class Kids extends ManKind {
	private int yearsOld;

	public Kids() {
		
	}
	public void printAge() {
		System.out.println( "I am "+getYearsOld()+" years old.");
	}

	public int getYearsOld() {
		return yearsOld;
	}

	public void setYearsOld(int yearsOld) {
		this.yearsOld = yearsOld;
	}


}