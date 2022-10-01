package bytebank;

public class Conta {
	
	double saldo;
	int agencia;
	int numero;
	String titular;
	double status;
	
	/*aplicando metodo */
  public	void deposita(double valor) {
	  
	  this.saldo = this.saldo + valor;
		
	}
  
	/*
	 * adicionando os metodos no sacar
	 */

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;

		}

	}
    	
    	public boolean transfere(double valor, Conta destino) {
    		if(this.saldo >= valor) {
    			this.saldo -= valor;
    			destino.deposita(valor);
    			return true;
    			
    		}
    		return false;
    	
		
    	
	  
  }
	

}
