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
/**
 * 在 Kids 中重新 定义 employeed 方法
 * 覆盖父类 ManKind 中定义 的 employeed 方法
 * 输出“ Kids should study and no job.”
 */
	@Override
	public void employeed() {
		System.out.println("Kids should study and no job.");
	}

}