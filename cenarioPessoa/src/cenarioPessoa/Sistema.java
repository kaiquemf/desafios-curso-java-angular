package cenarioPessoa;

public class Sistema {
	public static void main(String[] args) {
		Pessoa joao = new Pessoa("João", 30, 1.80);
		
		System.out.println(
		  "Nome: "   + joao.getNomePessoa() +
		"\nIdade: "  + joao.getIdadePessoa()+
		"\nAltura: " + joao.getAlturaPessoa());
	}
}
