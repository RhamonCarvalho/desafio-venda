package desafios2;

import java.math.BigDecimal;

public class FormaDePagamento {

	public int idDoPagamento;
	public TipoPagamento tipoDoPagamento;
	public BigDecimal valorDoPagamento;
	public String bandeira;
	public String nomeDoProprietario;
	public String numeroDoCartão;
	public int quantidadeDeParcela;
	public BigDecimal valorDaParcela;
	
	public String exibirFormaDePagamento(String tipo) {
		String texto = "";
		if(this.tipoDoPagamento.equals(TipoPagamento.Credito)) {
			texto = "Forma de Pagamento = " + getTipoDoPagamento() + "\nBandeira = " 
					+ getBandeira() + "\nnome =  " + getNomeDoProprietario() + "\nnumero = "
					+ getNumeroDoCartão() + "\nQuantidade de Parcelas = " + getquantidadeDeParcela() 
					+ "\nValor da Parcela =  R$ "+ getValorDaParcela() + "\nValor Total = R$ " + getValorDoPagamento();
		}else{
			texto = "Forma de Pagamento: = " + getTipoDoPagamento() + "\nNome do Cliente = " 
					+ getNomeDoProprietario() + "\nValor Total =  R$ " + getValorDoPagamento();
		}
		return texto;
	}
	public int getIdDoPagamento() {
		return idDoPagamento;
	}

	public int getquantidadeDeParcela() {
		return quantidadeDeParcela;
	}
	public void setquantidadeDeParcela(int quantidadeDeParcela) {
		this.quantidadeDeParcela = quantidadeDeParcela;
	}
	public BigDecimal getValorDaParcela() {
		return valorDaParcela;
	}
	public void setValorDaParcela(BigDecimal valorDaParcela) {
		this.valorDaParcela = valorDaParcela;
	}
	public void setIdDoPagamento(int idDoPagamento) {
		this.idDoPagamento = idDoPagamento;
	}

	public TipoPagamento getTipoDoPagamento() {
		return tipoDoPagamento;
	}

	public void setTipoDoPagamento(TipoPagamento tipoDoPagamento) {
		this.tipoDoPagamento = tipoDoPagamento;
	}

	public BigDecimal getValorDoPagamento() {
		return valorDoPagamento;
	}

	public void setValorDoPagamento(BigDecimal valorDoPagamento) {
		this.valorDoPagamento = valorDoPagamento;
	}

	public String getBandeira() {
		return bandeira;
	}

	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}

	public String getNomeDoProprietario() {
		return nomeDoProprietario;
	}

	public void setNomeDoProprietario(String nomeDoProprietario) {
		this.nomeDoProprietario = nomeDoProprietario;
	}

	public String getNumeroDoCartão() {
		return numeroDoCartão;
	}

	public void setNumeroDoCartão(String numeroDoCartão) {
		this.numeroDoCartão = numeroDoCartão;
	}

}
