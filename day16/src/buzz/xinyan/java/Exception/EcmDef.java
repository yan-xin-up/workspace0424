package buzz.xinyan.java.Exception;

import java.util.Scanner;

public class EcmDef {
	public static void main(String[] args) {

		try {
			
//			int i = Integer.parseInt(args[0]);
//			int j = Integer.parseInt(args[1]);
			
			String [] arg = new String[2];
			Scanner c1 = new Scanner(System.in);
			Scanner c2 = new Scanner(System.in);
			System.out.println("输入除数");
			arg[0] =c1.next();
			System.out.println("输入被除数");
			arg[1] =c2.next();
			int i = Integer.parseInt(arg[0]);
			int j = Integer.parseInt(arg[1]);
			double result = ecm(i, j);
			System.out.println(result);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.out.println("缺少命令行参数");
		}catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("分母输入数值不可以为0");
		}catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("数据类型不一致");
		}catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
		e.printStackTrace();
		}
	}

	public static double ecm(int i, int j) throws Exception{
		if (i < 0 || j < 0) {
			throw new EcDef("对不起不能输入负数！！！");
		}
		return i / j;
	}
}
