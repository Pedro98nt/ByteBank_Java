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
		// System.out.println(" teste de commit no github");

		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);

		boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaDoPedro);
        if(sucessoTransferencia) {
            System.out.println("transferencia com sucesso");
        } else {
            System.out.println("faltou dinheiro");
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoPedro.saldo);
		

	}

	}
}
