package br.com.alura.rh.service.promocao;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;

public class PromocaoService {

	public void promover(Funcionario funcionario, boolean metaBatida) {
		Cargo cargoAtual = funcionario.getCargo();
		if (Cargo.GERENTE.equals(cargoAtual))
				throw new ValidacaoException("Gerentes nao podem ser promovidos!");
		
		if (!metaBatida) {
			throw new ValidacaoException("Funcionario nao bateu a meta!");
	    } else {
			Cargo novoCargo = cargoAtual.getProximoCargo();
			funcionario.promover(novoCargo);
		}
	}
	
}
