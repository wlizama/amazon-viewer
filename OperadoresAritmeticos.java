
public class OperadoresAritmeticos {
	
	public static void main(String[] args) {
	
		//Operadores Aritméticos
		int a = 1;
		int aa = a + a;
		
		System.out.println("el valor de  aa: " + aa);
		
		double x = 2.56;
		int y = 9;
		float w = (float)x + y;
		System.out.println(w);
		
		System.out.println(w*2);
		
		double k = 4/0.00002;
		System.out.println(k);
		
		System.out.println(7%2);
		
		
		double f = 2;
		int g = 3;
		//f = f + g;
		//f += g;
		//f -= g;
		//f -*= g;
		//f /= g;
		f %= g;
		System.out.println(f);
	}
}
