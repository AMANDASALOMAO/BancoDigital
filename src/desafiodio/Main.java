package desafiodio;

public class Main {
	public static void main (String [] args) {
		Cliente amanda = new Cliente();
		amanda.setNome("Amanda");
		
		
		Conta cc =new ContaCorrente(amanda);
		Conta poupança =new ContaPoupança(amanda);
		
		cc.depositar(100);
		cc.transferir(100, poupança);
		
			cc.imprimirExtrato();
		poupança.imprimirExtrato();
	}

}
