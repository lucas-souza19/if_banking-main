import java.util.Date;

public class Main {
	public static void main(String[] args) {
		Pessoa pessoaFisica = new Pessoa("Pablo Escobar", "123.456.789-00", null, 0, new Date());
		System.out.println("\nNome: " + pessoaFisica.nome);
		System.out.println("Endereco: " + pessoaFisica.endereco);
		System.out.println("Email: " + pessoaFisica.email);
		System.out.println("Telefone: " + pessoaFisica.telefone);
		System.out.println("CPF: " + pessoaFisica.CPF);
		System.out.println("Data de nascimento: " + pessoaFisica.data_nascimento.toString());
	}
}