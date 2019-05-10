package Model;
public class Veiculo {

	private int idVeiculo;

	private String placa;

	private String modelo;

	private String numeroChassi;

	private String marca;

	private String cor;

	private OrdemServico[] ordemServico;

	public int getIdVeiculo() {
		return idVeiculo;
	}

	public void setIdVeiculo(int idVeiculo) {
		this.idVeiculo = idVeiculo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getNumeroChassi() {
		return numeroChassi;
	}

	public void setNumeroChassi(String numeroChassi) {
		this.numeroChassi = numeroChassi;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public OrdemServico[] getOrdemServico() {
		return ordemServico;
	}

	public void setOrdemServico(OrdemServico[] ordemServico) {
		this.ordemServico = ordemServico;
	}
	
	

}
