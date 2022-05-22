package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Pessoa> list = new ArrayList<>();
		
		System.out.println("Entre com o número de pagadores de impostos: ");
		int number = sc.nextInt();
		
		for(int i = 0; i < number; i++) {
			System.out.println("Dados do #" + (1+i) + " pagador de imposto");
			System.out.println("Pessoa Fisica ou Juridica (f/j)");
			char tipo = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Renda anual: ");
			double rendaAnual = sc.nextDouble();
			if(tipo == 'f') {
				System.out.print("Gastos com saúde: ");
				double gastosSaude = sc.nextDouble();
				list.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
			}else {
				System.out.print("Numero de funcionários: ");
				int numeroFuncionarios = sc.nextInt();
				list.add(new PessoaJuridica(nome, rendaAnual, numeroFuncionarios));
			}
			
		}
		
		System.out.println();
		System.out.println("Imposto pago");
		for(Pessoa person : list) {
			System.out.println(person.getNome() + ": $" + String.format("%.2f", person.imposto()));
		}
		
		System.out.println();
		double total = 0;
		
		for(Pessoa pessoa : list) {
			total += pessoa.imposto();
		}
		
		System.out.println("Total do imposto: $ " + String.format("%.2f", total) );
	
		
		sc.close();
	}

}
