package aplication;

import java.util.Locale;
import java.util.Scanner;

import entidades.RegistroQuarto;

public class HotelAula {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		RegistroQuarto[] vect = new RegistroQuarto[10];
		System.out.println("quantas pessoas serao registreixon? ");
		int p = sc.nextInt();
		for (int i = 0; i < p; i++) {
			System.out.print("Digite o nome do cliente: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Digite o E-mail do cliente: ");
			String email = sc.nextLine();
			System.out.print("Digite o Numero do quarto: ");
			int quarto = sc.nextInt();

			RegistroQuarto in = new RegistroQuarto(nome, email, quarto);

			vect[quarto - 1] = in;

		}
		System.out.println("Quartos ocupados: ");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.println("quarto #" + vect[i].getQuarto() + ", nome do ocupante: "
						+ vect[i].getNome() + ", e seu email é: " + vect[i].getEmail());
			}
		}
		sc.close();
	}

}
