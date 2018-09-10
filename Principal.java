package carro;

import java.util.Scanner;

public class Principal {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		Carro car1 = new Carro();
		String entrada;
		
		while (true) {
			
			System.out.println("					[MENU]\n"
					+ "[E] - Para entrar no carro"
					+ " [S] - para Sair do carro"
					+ " [A] - para Abastecer"
					+ " [D] - para Dirigir\n");
			System.out.println(car1.toString());
			entrada = scan.nextLine().toUpperCase();
			
			
			String c[] = entrada.split(" ");
				
		switch (c[0]) {
		case "E":
			car1.embarcar();
			break;
		case "S":
			car1.desembarcar();
			break;
		case "A":
			car1.abastecer(car1.qtdGasolina);;
			break;
		case "D":
			car1.dirigir(car1.km);
			break;
		default:
			System.err.println("Comando invalido");
			break;
		}
		
		}

	}

}
