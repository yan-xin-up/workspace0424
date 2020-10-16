package buzz.xinyan.java.exer.last1;

public class XiyouTest {
	public static void main(String[] args) {
		xiyou t = new xiyou("唐僧", 188, "法杖", "人族");
		t.skill();
		System.out.println(t.toString());
		xiyou s= new xiyou("孙悟空", 1999, "金箍棒", "仙族");
		s.skill();
		System.out.println(s.toString());
		xiyou b = new xiyou("白骨精", 118, "骨头", "妖族");
		xiyou n = new xiyou("牛魔王", 333, "骨头", "妖族");
		b.skill();
		System.out.println(b.toString());
		System.out.println(t.equals(s));
		System.out.println(t.equals(b));
		System.out.println(b.equals(n));
		
	}
}

class xiyou {
	private String name;
	private double height;
	private String weapon;
	private String race;

	public xiyou(String name, double height, String weapon, String race) {
		super();
		this.name = name;
		this.height = height;
		this.weapon = weapon; // 武器
		this.race = race; // 种族
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	@Override
	public String toString() {
		return "“姓名：" + getName() + "；种族：" + getRace() + "”";
	}

	void skill() {
		if (getName().equals("孙悟空")) {
			System.out.println("七十二变");
		} else if (getName().equals("唐僧")) {
			System.out.println("紧箍咒");
		} else if (getName().equals("白骨精")) {
			System.out.println("九阴白骨抓");
		} else {
			System.out.println("请输入正确姓名");
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof xiyou) {
			xiyou x = (xiyou) obj;
			if (this.getRace() == "人族" && x.getRace() == "人族") {
				return true;
			} else if (this.getRace() == "仙族" &&x.getRace() == "仙族") {
				return true;
			} else if (this.getRace() == "妖族" &&x.getRace() == "妖族") {
				return false;
			} else if (this.getRace() == "人族" ||x.getRace() == "人族") {
				return true;
			} else if (this.getRace() == "仙族" ||x.getRace() == "仙族") {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
}