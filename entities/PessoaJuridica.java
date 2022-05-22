package entities;

public class PessoaJuridica extends Pessoa {
	private int numeroFuncionarios;
	
	public PessoaJuridica() {
		super();
	}
		
	
	public PessoaJuridica(String nome, double rendaAnual, int numeroFuncionarios) {
		super(nome, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}


	@Override
	public double imposto() {

		double imposto = 0;

		if (numeroFuncionarios > 10) {
			imposto = rendaAnual * 0.14;
		} else {
			imposto = rendaAnual * 0.16;
		}

		return imposto;
	}

	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}
	
	
}