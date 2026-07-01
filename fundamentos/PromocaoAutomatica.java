public class PromocaoAutomatica {

	public static void main(String[] args) {

		byte a = 5;
		short b = 10;
		int c = 100;
		long d = 1000L;
		float e = 10.0f;
		double f = 100.0;
		char g = 'a';

		int promocaoInt = a + c; // 105
		System.out.println("Promoção de byte para int: " + promocaoInt);

		float promocaoFloat = c * e; // 1000.0
		System.out.println("Promoção de int para float: " + promocaoFloat);

		double promocaoDouble = f - e; // 90.0
		System.out.println("Promoção de float para double: " + promocaoDouble);

		System.out.println("Valor do char: " + g);
	}
}