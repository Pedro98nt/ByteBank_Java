package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoPedro = new Conta();

		/* o this ta fazendo apontamento para esta conta */

		contaDoPedro.saldo = 100;
		contaDoPedro.deposita(50);

		System.out.println(contaDoPedro.saldo);
		boolean conseguiRetirar = contaDoPedro.saca(20);

		System.out.println(contaDoPedro.saldo);

		System.out.println(conseguiRetirar);
		System.out.println(" teste de commit no github");

	}

}
