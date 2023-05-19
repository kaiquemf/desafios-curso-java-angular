package cenarioPessoa;

public class Sistema {
	public static void main(String[] args) {
		Pessoa joao = new Pessoa("Nenhum", 0, 0);
		joao.setNomePessoa("João");
		joao.setIdadePessoa(30);
		joao.setAlturaPessoa(1.80);
		
		System.out.println(
		  "Nome: "   + joao.getNomePessoa() +
		"\nIdade: "  + joao.getIdadePessoa()+
		"\nAltura: " + joao.getAlturaPessoa());
	}
}
