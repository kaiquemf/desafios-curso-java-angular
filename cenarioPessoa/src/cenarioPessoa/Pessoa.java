package cenarioPessoa;

public class Pessoa {
	private String nomePessoa;
	private int idadePessoa;
	private double alturaPessoa;

	public String getNomePessoa() {
		return this.nomePessoa;
	}
	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public int getIdadePessoa() {
		return this.idadePessoa;
	}
	public void setIdadePessoa(int idadePessoa) {
		this.idadePessoa = idadePessoa;
	}

	public double getAlturaPessoa() {
		return this.alturaPessoa;
	}
	public void setAlturaPessoa(double alturaPessoa) {
		this.alturaPessoa = alturaPessoa;
	}
	
	public Pessoa(String nomePessoa, int idadePessoa, double alturaPessoa) {
		this.nomePessoa   = nomePessoa;
		this.idadePessoa  = idadePessoa;
		this.alturaPessoa = alturaPessoa;
	}
}
