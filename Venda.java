package desafios2;

import java.math.BigDecimal;

public class Venda {
	public int codigoVenda;
	public BigDecimal valorMensalDoPlano;
	public String dataDaAssinatura;
	public Vendedor vendedorDoPlano;
	public FormaDePagamento formaDePagamento;

	public Venda() {
		super();

	}

	public Venda(int codigoVenda, String dataDaAssinatura) {
		super();
		this.codigoVenda = codigoVenda;
		this.dataDaAssinatura = dataDaAssinatura;
	}
	
	public String exibirVenda(Vendedor vendedor) {
		String texto = "";
		texto = "O codigo da Venda =  " + getcodigoVenda() + "\nData da Assinatura = " + getdataDaAssinatura()
				+ "\n Vendedor do Plano = " + vendedor.getnomeDoVendedor() + "\n Forma de Pagamento = "
				+ formaDePagamento.getTipoDoPagamento();
		return texto;
	}

	public void adicionaVendedor(Vendedor vendedor) {
		this.vendedorDoPlano = vendedor;
	}

	public int getcodigoVenda() {
		return codigoVenda;
	}

	public void setcodigoVenda(int codigoVenda) {
		this.codigoVenda = codigoVenda;
	}

	public BigDecimal getvalorMensalDoPlano() {
		return valorMensalDoPlano;
	}

	public void setvalorMensalDoPlano(BigDecimal valorMensalDoPlano) {
		this.valorMensalDoPlano = valorMensalDoPlano;
	}

	public String getdataDaAssinatura() {
		return dataDaAssinatura;
	}

	public void setdataDaAssinatura(String dataDaAssinatura) {
		this.dataDaAssinatura = dataDaAssinatura;
	}

	public Vendedor getvendedorDoPlano() {
		return vendedorDoPlano;
	}

	public void setvendedorDoPlano(Vendedor vendedorDoPlano) {
		this.vendedorDoPlano = vendedorDoPlano;
	}

	public FormaDePagamento getFormaDePagamento() {
		return formaDePagamento;
	}

	public void setFormaDePagamento(FormaDePagamento formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}

	@Override
	public String toString() {
		return "Venda [codigoVenda=" + getcodigoVenda() + ", valorMensalDoPlano=" + getvalorMensalDoPlano()
				+ ", dataDaAssinatura=" + getdataDaAssinatura() + ", vendedorDoPlano=" + getvendedorDoPlano()
				+ ", formaDePagamento=" + getFormaDePagamento() + "]";
	}
	
}
