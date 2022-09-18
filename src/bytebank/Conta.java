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
  
   /*
    * adicionando os metodos no sacar
    */
  
  
    public boolean   saca(double valor){
    	if(this.saldo >= valor) {
    		this.saldo = this.saldo - valor;
    		return true;
    	}else {
    		return false;
    		
    		
    	}
		
    	
	  
  }
	

}
