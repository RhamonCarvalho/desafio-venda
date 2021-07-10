package desafios2;

public class Cliente {
	public String nomeDoCliente;
	public long cpfDoCliente;
	public String enderecoDoCliente;
	public Plano plano;

	public Cliente() {

	}

	public Cliente(String nomeDoCliente, long cpfDoCliente, String enderecoDoCliente) {
		super();
		this.nomeDoCliente = nomeDoCliente;
		this.cpfDoCliente = cpfDoCliente;
		this.enderecoDoCliente = enderecoDoCliente;
	}
	
	public void adicionaPlano(Plano plano) {
		this.plano = plano;
	}
	public String getNomeDoCliente() {
		return nomeDoCliente;
	}

	public void setNomeDoCliente(String nomeDoCliente) {
		this.nomeDoCliente = nomeDoCliente;
	}

	public long getCpfDoCliente() {
		return cpfDoCliente;
	}

	public void setCpfDoCliente(int cpfDoCliente) {
		this.cpfDoCliente = cpfDoCliente;
	}

	public String getEnderecoDoCliente() {
		return enderecoDoCliente;
	}

	public void setEnderecoDoCliente(String enderecoDoCliente) {
		this.enderecoDoCliente = enderecoDoCliente;
	}

}
