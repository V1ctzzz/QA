package Faccat;

import java.util.Scanner;

public class Faccat26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade atual em estoque: ");
		int quantidadeAtual = sc.nextInt();

		System.out.print("Digite a quantidade máxima em estoque: ");
		int quantidadeMaxima = sc.nextInt();

		System.out.print("Digite a quantidade mínima em estoque: ");
		int quantidadeMinima = sc.nextInt();

		int quantidadeMedia = (quantidadeMaxima + quantidadeMinima) / 2;

		System.out.println("Quantidade média: " + quantidadeMedia);

		if (quantidadeAtual >= quantidadeMedia) {
			System.out.println("Não efetuar compra");
		} else {
			System.out.println("Efetuar compra");
		}

		sc.close();
	}
}
