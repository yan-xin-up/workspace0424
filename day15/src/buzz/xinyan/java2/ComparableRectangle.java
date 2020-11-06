package buzz.xinyan.java2;

public class ComparableRectangle extends Rectangle implements CompareObject {

	public ComparableRectangle(double lengeth, double width) {
		super(lengeth, width);
		// TODO Auto-generated constructor stub
	}

//	@Override
//	public Double findArea() {
//		// TODO Auto-generated method stub
//		Double c =  lwngth*width;
//		return c;
////		return super.findArea();
//	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if(this == o) {
			return 0;
		}
		if(o instanceof ComparableRectangle) {
			ComparableRectangle c = (ComparableRectangle)o;
			return this.findArea().compareTo(c.findArea());
		}else {
			throw new RuntimeException("输入错误");
		}
	}

}
