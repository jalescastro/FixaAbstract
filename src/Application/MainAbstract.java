package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Pessoa;
import Entities.PessoaFisica;
import Entities.PessoaJuridica;

public class MainAbstract {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		char choice = ' ';
		List <Pessoa> list = new ArrayList<>();
		int numPessoas = 0;
		StringBuilder sbd = new StringBuilder();
		double totalArrecadado = 0.0;
		
		System.out.print("Quantos funcionarios você quer cadastrar?");
		numPessoas = scan.nextInt();
		
		for (int i = 0; i < numPessoas; i++) {
			
			System.out.println("Você cadastrara uma pessoa fisica (F) ou uma pessoa juridica(J)?");
			choice = scan.next().charAt(0);
			
			if (Character.toLowerCase(choice) == 'f') {
				System.out.print("Digite o nome da pessoa: ");
				String name = scan.next();
				
				System.out.print("Digite a renda anual: ");
				double rendaAnual = scan.nextDouble();
				
				System.out.print("Digite o gasto com saude: ");
				double gastoSaude = scan.nextDouble();
				list.add(new PessoaFisica(name, rendaAnual, gastoSaude));
			}else if (Character.toLowerCase(choice) == 'j') {
				System.out.print("Digite o nome da pessoa: ");
				String name = scan.next();
				
				System.out.print("Digite a renda anual: ");
				double rendaAnual = scan.nextDouble();
				
				System.out.print("Digite o numero de funcionarios: ");
				int numeroFuncionarios = scan.nextInt();
				
				list.add(new PessoaJuridica(name, rendaAnual, numeroFuncionarios));
			}else {
				System.out.println("Invalide input");
				i--;
			}
		}
		
		
		for (Pessoa pessoa : list) {
			sbd.append(pessoa.getName()+" ");
			sbd.append(pessoa.impostoPago()+"\n");
			totalArrecadado += pessoa.impostoPago();
		}
		sbd.append("Total arrecadado ");
		sbd.append(totalArrecadado);
		
		System.out.println(sbd);
		
		
	scan.close();}

}
