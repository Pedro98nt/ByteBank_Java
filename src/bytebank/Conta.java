package bytebank;

public class Conta {
	
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	/*aplicando metodo */
  public	void deposita(double valor) {
	  
	  this.saldo = this.saldo + valor;
		
	}
	

}
