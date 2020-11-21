package buzz.xinyan.java.Exception;

public class EcmDef {
	public static void main(String[] args) {
		
		try {
			int i = Integer.parseInt(args[0]);
			ecm(i, 0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	
	public static double  ecm(double i,double j) throws Exception {
		if(i < 0 || j < 0) {
			throw new EcDef("对不起不能输入负数！！！");
		}
		double c = i/j;
		return c;
	}
}
