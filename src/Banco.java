import java.util.ArrayList;
import java.util.List;

import lombok.Data;


public @Data class Banco {

	private String nome;
	private List<Conta> contas = new ArrayList<>();
	
	public void addConta(Conta conta) {
		this.contas.add(conta);
	}

	public void imprimirListaClientes(boolean todos, boolean saldoPositivo) {
		contas.forEach(conta -> {
			if(todos) {
				conta.imprimirInfosComuns();
			} else {
				if(saldoPositivo) {
					if(conta.saldo >= 0) {
						conta.imprimirInfosComuns();
					}
				} else {
					if(conta.saldo < 0) {
						conta.imprimirInfosComuns();
					}
				}
			}
		});
	}
	
}
