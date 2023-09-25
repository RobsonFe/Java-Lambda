package Expressions;

public class App {

	public static void main(String[] args) {
		
		// Com retorno explicito
		
		 Calculo cal = (x,y) -> {
			return x+y;
		};
		
		System.out.println(cal.calcular(2, 3));
		
		// Sem retorno explicito
		
		cal =(a,b) -> a*b;
		
		System.out.println(cal.calcular(3, 5));
		
		//Outros tipos de chamada de metodo dentro de uma Functional Interface.
		
		System.out.println(cal.chamado());
		System.out.println(Calculo.chamado2());

	}

}
