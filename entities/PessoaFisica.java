package entities;

public class PessoaFisica extends Pessoa {
	private double gastosSaude;
	
	public PessoaFisica(){
		super();
	}
	
	public PessoaFisica(String nome, double rendaAnual, double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	@Override
	public double imposto() {
		
		double imposto = 0;
		
		if(rendaAnual < 20000) {
			imposto = (rendaAnual *0.15) - (gastosSaude * 0.5);
		}else {
			imposto = (rendaAnual *0.25) - (gastosSaude * 0.5);
		}
		
		return imposto;
	}

	public double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}
	
	
}
