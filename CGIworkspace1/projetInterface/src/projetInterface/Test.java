package projetInterface;

public class Test {

	public static void main(String[] args) {
		test4();

	}
	
	static void test7() {
		B b1 = new B();
		I3 b2 = b1;// caste implicite
		I2 b3 = b2;
//		I2 b3 = b1; //cette instance implicite fonctionne aussi car b2 est contenue dans b1
		B x = (B)b3; //on remonte à notre valeur initiale en sautant deux étapes (premier code) caste explicite
		
		I3 b4 = (I3)b3; // on remonte à notre code initiale un par un 
		B b5 = (B)b4;

	}
	
	static void test6() {
		I1 x = new B();
		B b = (B)x; //caste explicite

	}

	static void test5() {
		I1 x = new B();
		B b1 = new B();
		b1.mB();
		I3 i3 = b1;
		I2 i2 = i3;
		I3 ii3 = (I3) i2;
		B b2 = (B) i2;

	}

	static void test4() {
		B b1 = new B();
		b1.mB();
		I3 i3 = b1;
		I2 i2 = i3;
		I3 ii3 = (I3) i2;

	}

	static void test3() {
		I1[] tab = { new A(), new B() }; // on est restreint au méthode de I1
											// car il y a un caste implicite on
											// aura plus les méthodes de A et B
											// (exemple : mA() et mB() )
		for (I1 i : tab)
			i.m1();

		A a = (A) tab[0]; // caste explicite pour retrouver les méthodes de A
							// totalement
		a.mA();
		B b = (B) tab[1]; // caste explicite pour retrouver les méthodes de B
							// totalement
		b.mB();

	}

	static void test2() {

		I1 a1 = new A();
		a1.m1();
		// a1.mA(); //on peut pas car on a perdu en lisibilité en fesait une
		// méthode hybride juste au-dessus
		A mA = (A) a1;
		mA.mA();
		I1 a2 = new A();

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
