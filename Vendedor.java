package desafios2;

public class Vendedor {
		public String nomeDoVendedor;
		public long cpfDoVendedor;
		public Venda venda;
		
		public Vendedor() {
			super();
			
		}

		public Vendedor(String nomeDoVendedor, long cpfDoVendedor) {
			super();
			this.nomeDoVendedor = nomeDoVendedor;
			this.cpfDoVendedor = cpfDoVendedor;
		}

		public void adicionaVenda(Venda venda) {
			this.venda = venda;
		}

		public String getnomeDoVendedor() {
			return nomeDoVendedor;
		}

		public void setnomeDoVendedor(String nomeDoVendedor) {
			this.nomeDoVendedor = nomeDoVendedor;
		}

		public long getcpfDoVendedor() {
			return cpfDoVendedor;
		}

		public void setcpfDoVendedor(long cpfDoVendedor) {
			this.cpfDoVendedor = cpfDoVendedor;
		}

		public Venda getvenda() {
			return venda;
		}

		public void setVenda(Venda venda) {
			this.venda = venda;
		}
		
		
		
		
		
		
}
