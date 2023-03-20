package capitulo09;

public class UsaPessoa {
	
	public static void main(String[] args) {
		
		Object fisica =  new PessoaJuridica();
		
		PessoaFisica pessoaFisica =  new PessoaFisica();
		PessoaJuridica pessoaJuridica = new PessoaJuridica();
		Medico medico = new Medico();
		
		if (fisica instanceof Pessoa) {
			System.out.println("É uma pessoa física");
		} else {
			System.out.println("É uma pessoa jurídica");
		}
		
		
		salvaPessoa(pessoaFisica);
		salvaPessoa(pessoaJuridica);
		salvaPessoa(medico);
		
		pessoaFisica.getNome();
		
		
		
	}

	public static void salvaPessoa(ValidacaoPessoa pessoa) {
		///
	}
}
