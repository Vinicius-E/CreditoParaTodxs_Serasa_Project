package aplicação;

import java.util.InputMismatchException;
import java.util.Scanner;

import entidades.ExcecaoPadrao;
import entidades.Oferta;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("SISTEMA DE OFERTA DE CRÉDITO CRÉDITOPARATODXS");
			System.out.print("Informe seu nome: ");
			String nome = sc.nextLine();
			System.out.print("Informe a sua renda atual: R$");
			Double renda = sc.nextDouble();
			sc.nextLine();

			if (renda < 0) {
				extracted();
			}

			Oferta oferta = new Oferta(nome, renda);

			System.out.println("Ofertas de crédito de acordo com sua renda" + " + porcentagem de juros composto:");

			System.out.println();
			System.out.println(oferta.ofertas(renda));

			System.out.println();
			Character resposta = null;
			Character cUpper = null;
			Boolean finalizarPrograma = false;

			do {
				System.out.print("Qual oferta de crédito você deseja mais detalhes? (A/B/C/D) ");
				String s = sc.nextLine();
				String sUpper = s.toUpperCase();
				cUpper = sUpper.charAt(0);

				while (cUpper != 'A' && cUpper != 'B' && cUpper != 'C' && cUpper != 'D') {
					System.out.print("Existe apenas as ofertas (A/B/C/D). Qual você deseja? ");
					s = sc.nextLine();
					sUpper = s.toUpperCase();
					cUpper = sUpper.charAt(0);
				}

				System.out.println("Detalhes da oferta escolhida:");
				System.out.println();
				System.out.println(oferta.detalhesOferta(renda, cUpper));

				System.out.println();
				System.out.print("Você deseja contratar essa oferta? (S-sim/N-não) ");
				String s1 = sc.nextLine();
				String s1Upper = s1.toUpperCase();
				resposta = s1Upper.charAt(0);

				while (resposta != 'S' && resposta != 'N') {
					System.out.println("O sistema aceita apenas sim ou não.");
					System.out.print("Você deseja contratar esse oferta? (S-sim/N-não) ");
					s1 = sc.nextLine();
					s1Upper = s1.toUpperCase();
					resposta = s1Upper.charAt(0);
				}

				if (resposta == 'N') {
					System.out.print("Você deseja mais informações sobre alguma outra oferta? (S-sim/N-não) ");
					String s2 = sc.nextLine();
					String s2Upper = s2.toUpperCase();
					char resposta1 = s2Upper.charAt(0);

					while (resposta1 != 'S' && resposta1 != 'N') {
						System.out.println("O sistema aceita apenas sim ou não.");
						System.out.print("Você deseja mais informações sobre alguma outra oferta? (S-sim/N-não) ");
						s1 = sc.nextLine();
						s1Upper = s1.toUpperCase();
						resposta1 = s1Upper.charAt(0);
					}

					if (resposta1 == 'N') {
						finalizarPrograma = true;
						break;
					}
				}
			} while (resposta != 'S');

			do {
				if (finalizarPrograma == true) {
					System.out.println("CréditoParaTodxs agradece a sua interação.");
					break;
				}

				System.out.println("Oferta contratada!");
				System.out.println("Cliente: " + nome);
				System.out.println(oferta.detalhesOferta(renda, cUpper));
				finalizarPrograma = true;
			} while (finalizarPrograma == false);
		} catch (InputMismatchException e) {
			System.out.println("Erro: Valor inválido");
		} catch (ExcecaoPadrao e) {
			System.out.println("Erro em renda: " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Erro inesperado");
		}
		sc.close();
	}

	private static void extracted() {
		throw new ExcecaoPadrao("A sua renda atual não pode ser menor do que 0");
	}

}
