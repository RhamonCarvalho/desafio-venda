package desafios2;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Plano plano1 = new Plano("Premium", new BigDecimal("500.00"));
		Plano plano2 = new Plano("Classic", new BigDecimal("200.00"));
		Cliente cliente1 = new Cliente("Joao", 1234567, "Goias");

		Venda venda1 = new Venda(123456, "11121996");
		Vendedor vendedor1 = new Vendedor("Henrique José", 01231546);
		vendedor1.adicionaVenda(venda1);
		venda1.adicionaVendedor(vendedor1);
		Scanner sc = new Scanner(System.in);
		int i = 0;
		System.out.println("Digite o número do plano, temos Premium (1) e Classic (2)");
		i = sc.nextInt();
		if (i == 1) {
			cliente1.adicionaPlano(plano1);

		} else {
			cliente1.adicionaPlano(plano2);
		}
		System.out.println("Plano = " + cliente1.plano.getnomePlano() + ", R$ = "
				+ cliente1.plano.getvalorMensalDoPlano() + " , ");
		System.out.println("O Vendedor é = " + vendedor1.getnomeDoVendedor() + "\nO CPF = "
				+ vendedor1.getcpfDoVendedor() + "\nValor da Venda = " + cliente1.plano.getvalorMensalDoPlano());

		FormaDePagamento formaDePagamento = new FormaDePagamento();

		System.out.println("qual a forma de Pagamento?, Dinheiro, Debito, Credito, Boleto");
		String tipo = "";
		tipo = sc.next();
		switch (tipo) {
		case "Dinheiro":
			formaDePagamento.setTipoDoPagamento(TipoPagamento.Dinheiro);
			break;
		case "Debito":
			formaDePagamento.setTipoDoPagamento(TipoPagamento.Debito);
			break;
		case "Credito":
			formaDePagamento.setTipoDoPagamento(TipoPagamento.Credito);
			break;
		case "Boleto":
			formaDePagamento.setTipoDoPagamento(TipoPagamento.Boleto);
			break;
		default:
			System.err.println("Opcão invalida");
			break;
		}
		if (formaDePagamento.getTipoDoPagamento().descricao.equalsIgnoreCase("Dinheiro")) {
			System.out.println("Nome do Cliente");
			System.out.print(sc.nextLine());
			formaDePagamento.setNomeDoProprietario(sc.nextLine());
			System.out.println("Valor do Pagamento");
			formaDePagamento.setValorDoPagamento(sc.nextBigDecimal());
		} else if (formaDePagamento.getTipoDoPagamento().descricao.equalsIgnoreCase("Debito")) {
			System.out.println("Nome do Cliente");
			System.out.print(sc.nextLine());
			formaDePagamento.setNomeDoProprietario(sc.nextLine());
			System.out.println("Valor do Pagamento");
			formaDePagamento.setValorDoPagamento(sc.nextBigDecimal());
		} else if (formaDePagamento.getTipoDoPagamento().descricao.equalsIgnoreCase("Credito")) {
			System.out.println("Digite a bandeira");
			formaDePagamento.setBandeira(sc.next());
			System.out.println("Numero do Cartao");
			formaDePagamento.setNumeroDoCartão(sc.next());
			System.out.println("Nome do Proprietario");
			System.out.print(sc.nextLine());
			formaDePagamento.setNomeDoProprietario(sc.nextLine());
			System.out.println("Quantidade de Parcelas");
			formaDePagamento.setquantidadeDeParcela(sc.nextInt());
			System.out.println("Valor da Parcela");
			formaDePagamento.setValorDaParcela(sc.nextBigDecimal());
			System.out.println("Valor do Pagamento");
			formaDePagamento.setValorDoPagamento(sc.nextBigDecimal());
		}else {
			System.out.println("Nome do Cliente");
			System.out.print(sc.nextLine());
			formaDePagamento.setNomeDoProprietario(sc.nextLine());
			System.out.println("Valor do Pagamento");
			formaDePagamento.setValorDoPagamento(sc.nextBigDecimal());
		}

		System.out.println(formaDePagamento.exibirFormaDePagamento(tipo));
	}

}
