package AlcoolOuGasolina;

import java.util.Scanner;

/*
 * 
 * @author Anderson Veloso
 * 19/02/2023
 * 
 * 
 * Aplicação criada no intuito de ajudar condutores a escolher o melhor custo benefício 
 * para reabastecimento do seu veículo
 */

public class ComparaCombustivel {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Olá! Bem vindo ao comparador de custo-beneficio para seu combustivel.");
		System.out.println("Digite o valor de quilometros que seu veículo faz por litro de álcool: ");
		double desempenhoAlcool = sc.nextDouble();
		System.out.println("Agora, digite o valor de quilometros que seu veículo faz por litro de gasolina: ");
		double desempenhoGasolina = sc.nextDouble();

		double desempenhoComparado1 = desempenhoAlcool / desempenhoGasolina;
		System.out.println("Desempenho do alcool em relação à gasolina é: " + desempenhoComparado1);

		System.out.println("Digite o valor do preço do Álcool na sua região: ");
		double precoAlcool = sc.nextDouble();
		System.out.println("Agora, digite o valor do preço da gasolina na sua região: ");
		double precoGasolina = sc.nextDouble();

		double relacaoPreco = precoAlcool / precoGasolina;

		if (relacaoPreco >= desempenhoComparado1) {

			System.out.println("Escolha álcool para abastecimento, é o melhor custo-benefício!");

		} else {
			System.out.println("Escola gasolina como combustível principal, é o melhor custo-benefício!");
		}

		sc.close();
	}

}
