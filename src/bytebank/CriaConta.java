package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);

		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);

		/* segunda conta */

		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		System.out.println("a conta " + primeiraConta.saldo);
		System.out.println("a conta " + segundaConta.saldo);

		System.out.println(segundaConta.saldo - primeiraConta.saldo);
		
		
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
		if(primeiraConta == segundaConta) {
			System.out.println("mesma conta");
		}else {
			System.out.println("contas diferentes");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		
		System.out.println(primeiraConta.saldo * segundaConta.saldo);
		
		
		
		
		
		

	}

}
