package br.ufpe.cin.ui.tui;

import java.util.Scanner;

import br.ufpe.cin.banco.ContaAbstrata;

public class Opcao {

	
	public static int Inicial( int numero){
		Scanner receber = new Scanner(System.in);
		String menuPrincipal =new String("=============Banco============\n"
				+ " 1. Cadastrar uma conta\n"
				+ " 2. Creditar um valor em uma conta \n"
				+ " 3. Debitar  um  valor em uma conta \n"
				+ " 4. Verificar  o Saldo\n"
				+ " 5. Fazer transf�ncia \n"
				+ " 6. Render Juros\n"
				+ " 7. Render Bonus\n"
				+ " 0. Sair\n"
				+ "============================");
		numero= receber.nextInt();
		while(numero <0 || numero >7) {
			System.out.println("Voc� escolheu uma op��o inv�lida! "
					+ "Tente novamente!"
					+ "\n"
					+ "======================================");
			System.out.println(menuPrincipal);
	}
		return numero;
}
	static void Cadastrar(){
		String tiposDeConta= new String(" Escolha o tipo de conta\n"
				+ "1.Conta corrente \n"
				+ "2.Conta Imposto \n"
				+ "3.Conta Especial \n"
				+ "4.Conta Poupan�a \n"
				+ "5.Conta Poupan�a Especial \n");
		System.out.println(tiposDeConta);
	}

	static void MenuCreditar(){
		 System.out.println("Digite o numero da Conta\n");
		 
		 System.out.println("Digite o valor que deseja creditar \n");
		 
	}
	static void MenuDebitar(){
		System.out.println("Digite o numero da Conta\n");
		System.out.println("Digite o valor que deseja debitar\n");
		Cadastrar();
		
	}
	static void MenuSaldo() {
		System.out.println("Digite o numero da Conta\n");
		Cadastrar();
		
		
	}
	static void MenuRenderBonus() {
		System.out.println("Digite o numero da Conta\n");
		System.out.println("Digite o valor que deseja render B�nus\n");
		Cadastrar();
	}
	static void MenRenderJuros() {
		System.out.println("Digite o numero da Conta\n");
		System.out.println("Digite o valor que deseja juros\n");
		Cadastrar();
		
	}

}
