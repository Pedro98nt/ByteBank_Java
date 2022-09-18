package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		
		/*o this ta fazendo apontamento para esta conta */
		
		conta.saldo = 100;
		conta.deposita(50);
		
		System.out.println(conta.saldo);
		
	
		

	}

}
