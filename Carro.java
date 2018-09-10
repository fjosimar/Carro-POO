package carro;

import java.util.Scanner;

public class Carro {
	public int qtdpassageiros;
	public static final int limiteqtdPassageiros = 2;
	public double qtdGasolina;
	public static final double limiteQtdGasolina = 10;
	public double km;
	Scanner scan = new Scanner(System.in);

	public void embarcar() {
		if (qtdpassageiros < limiteqtdPassageiros) {
			qtdpassageiros += 1;

		} else {
			System.err.println("Limite de passageiros atingindo!");
		}

	}

	public void desembarcar() {
		if (qtdpassageiros > 0) {
			qtdpassageiros -= 1;

		} else {
			System.err.println("Não a passageiros no carro!");

		}

	}

	public void abastecer(double qtdGasolina) {
		System.out.print("Quantos litros de combustivel?: ");
		qtdGasolina = scan.nextDouble();
		
		this.qtdGasolina += qtdGasolina;
		
		if (this.qtdGasolina > limiteQtdGasolina) {
			this.qtdGasolina = limiteQtdGasolina;

		}

	}

	public void dirigir(double km) {
		System.out.print("Quantos Km quer rodar?: ");
		km = scan.nextDouble();
		
		if (qtdpassageiros == 0) {
			System.err.println("Não tem ninguem no carro!");
			
		} else if (qtdGasolina < (km / 10)) {
			System.err.println("Não tem gasolina!");
			
		} else {
			this.qtdGasolina = qtdGasolina - km / 10;
			this.km = this.km + km;
		}
	}

	@Override
	public String toString() {
		
		return "Passageiros: " + qtdpassageiros + " Tanque: " + qtdGasolina + "L"+" KM: " + km;
	}

}
