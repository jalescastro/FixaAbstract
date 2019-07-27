package Entities;

import Entities.Pessoa;

public class PessoaFisica extends Pessoa {
	
	
	private Double gastoSaude = 0.0; 

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String name, Double rendaAnual, Double gastoSaude) {
		super(name, rendaAnual);
		this.gastoSaude = gastoSaude;
		
		
	}
	
	public Double getGastoSaude() {
		return this.gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public double impostoPago() {
		if (getRendaAnual() < 20000) {
			return  (getRendaAnual()*0.15)-(getGastoSaude()*0.50);
		}else {
			return (getRendaAnual()*0.25)-(getGastoSaude()*0.50);	
		}
	}

	

}
