package projetoJava;

public class Usuario {

	private String nome;
	private String cpf;
	private String dataNascimento;

	public Usuario(String nome, String cpf, String dataNascimento) {
	        this.nome = nome;
	        this.cpf = cpf;
	        this.dataNascimento = dataNascimento;
	    }

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String toString() {
		return "Nome: " + nome + "\nCPF: " + cpf + "\nData de Nascimento: " + dataNascimento;
	}
}
