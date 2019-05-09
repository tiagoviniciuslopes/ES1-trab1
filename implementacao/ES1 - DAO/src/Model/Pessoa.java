package Model;
public class Pessoa {

	private int idPessoa;

	private String nome;

	private String cpf;

	private String rg;

	private String senha;

	private Veiculo[] veiculo;

	private Email[] email;

	private Telefone[] telefone;

	private EnderecoEspecifico enderecoEspecifico;

	private TipoUsuario tipoUsuario;

	public int getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Veiculo[] getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo[] veiculo) {
		this.veiculo = veiculo;
	}

	public Email[] getEmail() {
		return email;
	}

	public void setEmail(Email[] email) {
		this.email = email;
	}

	public Telefone[] getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone[] telefone) {
		this.telefone = telefone;
	}

	public EnderecoEspecifico getEnderecoEspecifico() {
		return enderecoEspecifico;
	}

	public void setEnderecoEspecifico(EnderecoEspecifico enderecoEspecifico) {
		this.enderecoEspecifico = enderecoEspecifico;
	}

	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	
	

}
