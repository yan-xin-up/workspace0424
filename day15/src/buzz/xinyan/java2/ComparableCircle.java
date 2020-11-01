package buzz.xinyan.java2;

import javax.management.RuntimeErrorException;

public class ComparableCircle extends Circle implements CompareObject {

	public ComparableCircle(double redious) {
		super(redious);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if (this == o) {
			return 0;
		}
			if (o instanceof ComparableCircle) {
				ComparableCircle c = (ComparableCircle) o;
//				if (this.getRedious() == c.getRedious()) {
//					return 0;
//				} else if (this.getRedious() > c.getRedious()) {
//					return 1;
//				} else {
//					return -1;
//				}
				return this.getRedious().compareTo(c.getRedious());
			}else {
//				return 0;
				throw new  RuntimeException("输入错误");
			}

		} 
	}

