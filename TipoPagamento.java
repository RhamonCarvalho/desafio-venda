package desafios2;

public enum TipoPagamento {
		
		Debito("DEBITO"),
		Credito("CREDITO"),
		Boleto("BOLETO"),
		Dinheiro("DINHEIRO");
	
		public String descricao;
		
		TipoPagamento(String descricao){
			this.descricao = descricao;
		}

		public String getDescricao() {
			return descricao;
		}
		

	

}
