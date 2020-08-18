package buzz.xinyan.java.exer;

import java.util.Scanner;
import java.util.Vector;

/*
 * /*
 *  利用Vector代替数组处理：从键盘读入学生成绩（以负数代表输入结束），找出最高分，并输出学生成绩等级。
	提示：数组一旦创建，长度就固定不变，所以在创建数组前就需要知道它的长度。
	而向量类java.util.Vector可以根据需要动态伸缩。
	
	创建Vector对象：Vector v=new Vector();
	给向量添加元素：v.addElement(Object obj);   //obj必须是对象
	取出向量中的元素：Object  obj=v.elementAt(0);
	注意第一个元素的下标是0，返回值是Object类型的。
	计算向量的长度：v.size();
	若与最高分相差10分内：A等；20分内：B等；
	      30分内：C等；其它：D等
 */
public class ScoreTest {
	public static void main(String[] args) {
		//1.实例化Scnner, 用于从键盘获取学生成绩
		Scanner scan = new Scanner(System.in);
		//2 创建Vector对象：Vector v=new Vector();
		Vector v=new Vector();			//实例化Vectror 
		//3.通过for(;;)或while(true)方式，给Vector中添加数组
		int maxScore = 0;
		for(;;) {
			System.out.println("请输入学生成绩(以负数代表程序结束)： ");
			int score = scan.nextInt();			//从键盘读取数值
			if(score < 0) {									//输入负值代表 跳出循环
				break;
			}
			if(score > 100) {									//数值过大从新输入
				System.out.println("对不起，你输入的数值有误： ");
				continue;											//继续回到循环开头，读取数值。
			}
			//3.1 利用v.addElement()添加。\
			//jdk5.0之前操作 基本数据类型 调用包装类的构造器
//			Integer inscore = new Integer(score);
//			v.addElement(inscore); java 多态
			v.addElement(score);			//jdk 5.0之后自动装箱
			//System.out.println(score);
			//4 获取学生成绩的最大值
			if(maxScore < score) {
				 maxScore = score;
			}
		}
		//遍历Vector，得到每个学生的成绩，并且与最大的成绩比较获得每个学生的等级
		char level;				//定义等级
		for(int i = 0;i < v.size();i++ ) {
			Object  obj=v.elementAt(i);		//取出数组中的元素，此处需将包装类转换为基本数据类型
			//在jdk5.0前需要将
			Integer inscore = (Integer)obj;		//	将类型强转为integer;
//			int score =inscore.intValue();			5.0之前将包装类转换为基本数据类型
			int score  = inscore;
			if(maxScore - score <=10) {
				level = 'A';
			}else if(maxScore-score <= 20) {
				level = 'B';
			}else if(maxScore-score <= 30) {
				level = 'C';
			}else {
				level = 'D';
			}
			
			System.out.println("Student	  "+i+" 	Score is"+score+"	level is	"+level+".");
		}
	}
}
