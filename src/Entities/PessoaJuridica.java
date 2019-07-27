package Entities;

public class PessoaJuridica extends Pessoa {

	
	private int numeroFuncionarios;
	
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String name, Double rendaAnual,int numeroFuncionarios) {
		super(name, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}
	
	public int getNumeroFuncionarios() {
		return this.numeroFuncionarios;
	}

	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	@Override
	public double impostoPago() {
		if (getNumeroFuncionarios() <= 10) {
			return  getRendaAnual()*0.16;
		}else {
			return getRendaAnual()*0.14;	
		}
	}

}
