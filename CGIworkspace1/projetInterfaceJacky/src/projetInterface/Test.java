package projetInterface;

public class Test {

	public static void main(String[] args) {
		test6();

	}
	static void test7() {
		B b1=new B();
		I3 b2=b1;
		I2 b3=b2;
		B x=(B)b3;
		
		
		I3 b4=(I3)b3;
		B b5=(B)b4;
		
		
		
		
	}
	static void test6() {
		I1 x=new B();
		B b=(B)x;
	}
	
	static void test5() {
		I1 x=new B();
		B b1=new B();
		b1.mB();
		I3 i3=b1;
		I2 i2=(I2)i3;
		I3 ii3=(I3)i2;
		B b2=(B)i2;
		b2.mB();
		//I3 ii3=(I3)i2;
	}

	static void test4() {
		B b1=new B();
		b1.mB();
		I3 i3=b1;
		I2 i2=(I2)i3;
		I3 ii3=(I3)i2;
		//I3 ii3=(I3)i2;
	}

	static void test3() {
		I1[] tab = { new A(), new B() };
		for(I1 i : tab)
			i.m1();
		I1 x=tab[0];
		
		A a=(A)tab[0];
		B b=(B)tab[1];

	}

	static void test2() {
		I1 a1 = new A();
		a1.m1();
		A ma = (A) a1;
		ma.mA();
		I2 a2 = new A();

	}

	static void test1() {
		A a1 = new A();
		a1.m1();
		a1.mA();

		I1 a2 = a1;
		I2 a3 = a1;
		a2.m1();
		a3.m2();

	}

}
