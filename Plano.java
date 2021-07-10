package desafios2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Plano {
	List<Cliente> ListaDeCliente = new ArrayList<Cliente>();
	public String nomePlano;
	public BigDecimal valorMensalDoPlano;
	public Boolean Status;
//	protected Date dataDaAssinatura;
//	protected Vendedor vendedorDoPlano;
//	protected boolean Status;
//	protected FormaDePagamento formaDePagamento;

	public String exibirCliente() {
		String texto = "";
		for (Cliente cliente : ListaDeCliente) {
			texto += "cliente: " + cliente.getNomeDoCliente() + "\n";
		}
		return texto;
	}

	public Plano(String nomePlano, BigDecimal valorMensalDoPlano) {
		this.nomePlano = nomePlano;
		this.valorMensalDoPlano = valorMensalDoPlano;
	}

	public Plano() {
		super();
	}

	public void adicionaCliente(Cliente cliente) {
		ListaDeCliente.add(cliente);
	}

	public List<Cliente> getListaDeCliente() {
		return ListaDeCliente;
	}

	public String getnomePlano() {
		return nomePlano;
	}

	public void setnomePlano(String nomePlano) {
		this.nomePlano = nomePlano;
	}

	public BigDecimal getvalorMensalDoPlano() {
		return valorMensalDoPlano;
	}

	public void setvalorMensalDoPlano(BigDecimal valorMensalDoPlano) {
		this.valorMensalDoPlano = valorMensalDoPlano;
	}

	@Override
	public String toString() {
		return "Nome Plano =" + getnomePlano() + ", valor = " + getvalorMensalDoPlano();
	}

}
