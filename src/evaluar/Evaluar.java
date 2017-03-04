package evaluar;

public class Evaluar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double f;
		f = calcula();
		mostrar(f);
	}
	static double calcula(){
		double x = 3.1416/4;
		return x * Math.sin(x) + 0.5;
	}
	
	static void mostrar(double r){
		System.out.println("Valor de la funcion: "+r);
	}

}
