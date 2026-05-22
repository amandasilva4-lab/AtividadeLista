package projetoJava;

public class Professor extends Usuario {

	private String siape;
	private int cargaHoraria;

	public Professor(String nome, String cpf, String dataNascimento, String siape, int cargaHoraria) {

		super(nome, cpf, dataNascimento);
		this.siape = siape;
		this.cargaHoraria = cargaHoraria;
	}

	public String getSiape() {
		return siape;
	}

	public void setSiape(String siape) {
		this.siape = siape;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public String toString() {
		return super.toString() + "\nSIAPE: " + siape + "\nCarga Horária: " + cargaHoraria;
	}
}
