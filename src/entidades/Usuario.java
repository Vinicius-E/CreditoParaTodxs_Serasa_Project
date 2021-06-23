package entidades;

public abstract class Usuario implements OfertaDeCredito {

	private String nome;
	private Double renda;

	public Usuario(String nome, Double renda) {
		this.nome = nome;
		this.renda = renda;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRenda() {
		return renda;
	}

	public void setRenda(Double renda) {
		this.renda = renda;
	}

	public Integer renda(Double renda) {
		Integer r = 0;

		if (renda < 1801.00) {
			r = 1;
		} else if (renda < 3201.00) {
			r = 2;
		} else if (renda < 5701.00) {
			r = 3;
		} else {
			r = 4;
		}

		return r;
	}
}
