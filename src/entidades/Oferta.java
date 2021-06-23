package entidades;

public class Oferta extends Usuario {

	public final Double o1A = 3000.00;
	public final Double o1B = 5000.00;
	public final Double o1C = 8000.00;
	public final Double o1D = 12000.00;
	public final Double o2A = 10000.00;
	public final Double o2B = 20000.00;
	public final Double o2C = 25000.00;
	public final Double o2D = 32000.00;
	public final Double o3A = 20000.00;
	public final Double o3B = 30000.00;
	public final Double o3C = 40000.00;
	public final Double o3D = 78000.00;
	public final Double o4A = 50000.00;
	public final Double o4B = 100000.00;
	public final Double o4C = 125000.00;
	public final Double o4D = 175000.00;

	public final Double j1 = 0.2;
	public final Double j2 = 0.3;
	public final Double j3 = 0.4;
	public final Double j4 = 0.5;
	public final Double j5 = 0.6;
	public final Double j6 = 0.7;
	public final Double j7 = 0.8;
	public final Double j8 = 0.9;
	public final Double j9 = 1.0;

	public final Integer p1 = 24;
	public final Integer p2 = 36;
	public final Integer p3 = 48;
	public final Integer p4 = 60;

	public Oferta(String nome, Double renda) {
		super(nome, renda);
	}

	@Override
	public String ofertas(Double renda) {
		Integer r = renda(getRenda());
		String s = null;

		if (r == 1) {
			s = "A= R$" + String.format("%.2f", o1A) + " - " + j9 + "% a.m." + "\nB= R$" + String.format("%.2f", o1B)
					+ " - " + j8 + "% a.m." + "\nC= R$" + String.format("%.2f", o1C) + " - " + j7 + "% a.m." + "\nD= R$"
					+ String.format("%.2f", o1D) + " - " + j6 + "% a.m.";
		} else if (r == 2) {
			s = "A= R$" + String.format("%.2f", o2A) + " - " + j8 + "% a.m." + "\nB= R$" + String.format("%.2f", o2B)
					+ " - " + j7 + "% a.m." + "\nC= R$" + String.format("%.2f", o2C) + " - " + j6 + "% a.m." + "\nD= R$"
					+ String.format("%.2f", o2D) + " - " + j5 + "% a.m.";
		} else if (r == 3) {
			s = "A= R$" + String.format("%.2f", o3A) + " - " + j5 + "% a.m." + "\nB= R$" + String.format("%.2f", o3B)
					+ " - " + j5 + "% a.m." + "\nC= R$" + String.format("%.2f", o3C) + " - " + j4 + "% a.m." + "\nD= R$"
					+ String.format("%.2f", o3D) + " - " + j3 + "% a.m.";
		} else {
			s = "A= R$" + String.format("%.2f", o4A) + " - " + j2 + "% a.m." + "\nB= R$" + String.format("%.2f", o4B)
					+ " - " + j2 + "% a.m." + "\nC= R$" + String.format("%.2f", o4C) + " - " + j1 + "% a.m." + "\nD= R$"
					+ String.format("%.2f", o4D) + " - " + j1 + "% a.m.";
		}

		return s;
	}

	@Override
	public String detalhesOferta(Double renda, Character cUpper) {
		Integer r = renda(renda);
		String s = null;
		Double valorPrimeiraParcela = null;

		if (r == 1) {
			if (cUpper == 'A') {
				valorPrimeiraParcela = o1A / p1;

				s = "Valor da oferta de crédito escolhida: R$" + String.format("%.2f", o1A)
						+ "\nQuantidade de parcelas: " + p1 + "   - Valor da primeira parcela: R$"
						+ String.format("%.2f", valorPrimeiraParcela) + "\nValor total a pagar: R$3809,20"
						+ "   - Taxa de juros: " + j9 + "% a.m.";
			} else if (cUpper == 'B') {
				valorPrimeiraParcela = o1B / p1;

				s = "Valor da oferta de crédito escolhida: R$" + String.format("%.2f", o1B)
						+ "\nQuantidade de parcelas: " + p1 + "   - Valor da primeira parcela: R$"
						+ String.format("%.2f", valorPrimeiraParcela) + "\nValor total a pagar: R$6199,50"
						+ "   - Taxa de juros: " + j8 + "% a.m.";
			} else if (cUpper == 'C') {
				valorPrimeiraParcela = o1C / p1;

				s = "Valor da oferta de crédito escolhida: R$" + String.format("%.2f", o1C)
						+ "\nQuantidade de parcelas: " + p1 + "   - Valor da primeira parcela: R$"
						+ String.format("%.2f", valorPrimeiraParcela) + "\nValor total a pagar: R$9686,00"
						+ "   - Taxa de juros: " + j7 + "% a.m.";
			} else {
				valorPrimeiraParcela = o1D / p1;

				s = "Valor da oferta de crédito escolhida: R$" + String.format("%.2f", o1D)
						+ "\nQuantidade de parcelas: " + p1 + "   - Valor da primeira parcela: R$"
						+ String.format("%.2f", valorPrimeiraParcela) + "\nValor total a pagar: R$14186,90"
						+ "   - Taxa de juros: " + j6 + "% a.m.";
			}
		} else if (r == 2) {
			if (cUpper == 'A') {
				valorPrimeiraParcela = o2A / p2;

				s = "Valor da oferta de crédito escolhida: R$" + String.format("%.2f", o2A)
						+ "\nQuantidade de parcelas: " + p2 + "   - Valor da primeira parcela: R$"
						+ String.format("%.2f", valorPrimeiraParcela) + "\nValor total a pagar: R$13806,40"
						+ "   - Taxa de juros: " + j8 + "% a.m.";
			} else if (cUpper == 'B') {
				valorPrimeiraParcela = o2B / p2;

				s = "Valor da oferta de crédito escolhida: R$" + String.format("%.2f", o2B)
						+ "\nQuantidade de parcelas: " + p2 + "   - Valor da primeira parcela: R$"
						+ String.format("%.2f", valorPrimeiraParcela) + "\nValor total a pagar: R$26644,60"
						+ "   - Taxa de juros: " + j7 + "% a.m.";
			} else if (cUpper == 'C') {
				valorPrimeiraParcela = o2C / p2;

				s = "Valor da oferta de crédito escolhida: R$" + String.format("%.2f", o2C)
						+ "\nQuantidade de parcelas: " + p2 + "   - Valor da primeira parcela: R$"
						+ String.format("%.2f", valorPrimeiraParcela) + "\nValor total a pagar: R$32136,70"
						+ "   - Taxa de juros: " + j6 + "% a.m.";
			} else {
				valorPrimeiraParcela = o2D / p2;

				s = "Valor da oferta de crédito escolhida: R$" + String.format("%.2f", o2D)
						+ "\nQuantidade de parcelas: " + p2 + "   - Valor da primeira parcela: R$"
						+ String.format("%.2f", valorPrimeiraParcela) + "\nValor total a pagar: R$39689,70"
						+ "   - Taxa de juros: " + j5 + "% a.m.";
			}
		} else if (r == 3) {
			if (cUpper == 'A') {
				valorPrimeiraParcela = o3A / p3;

				s = "Valor da oferta de crédito escolhida: R$" + String.format("%.2f", o3A)
						+ "\nQuantidade de parcelas: " + p3 + "   - Valor da primeira parcela: R$"
						+ String.format("%.2f", valorPrimeiraParcela) + "\nValor total a pagar: R$36652,20"
						+ "   - Taxa de juros: " + j5 + "% a.m.";
			} else if (cUpper == 'B') {
				valorPrimeiraParcela = o3B / p3;

				s = "Valor da oferta de crédito escolhida: R$" + String.format("%.2f", o3B)
						+ "\nQuantidade de parcelas: " + p3 + "   - Valor da primeira parcela: R$"
						+ String.format("%.2f", valorPrimeiraParcela) + "\nValor total a pagar: R$39978,30"
						+ "   - Taxa de juros: " + j5 + "% a.m.";
			} else if (cUpper == 'C') {
				valorPrimeiraParcela = o3C / p3;

				s = "Valor da oferta de crédito escolhida: R$" + String.format("%.2f", o3C)
						+ "\nQuantidade de parcelas: " + p3 + "   - Valor da primeira parcela: R$"
						+ String.format("%.2f", valorPrimeiraParcela) + "\nValor total a pagar: R$50819,60"
						+ "   - Taxa de juros: " + j4 + "% a.m.";
			} else {
				valorPrimeiraParcela = o3D / p3;

				s = "Valor da oferta de crédito escolhida: R$" + String.format("%.2f", o3D)
						+ "\nQuantidade de parcelas: " + p3 + "   - Valor da primeira parcela: R$"
						+ String.format("%.2f", valorPrimeiraParcela) + "\nValor total a pagar: R$94474,10"
						+ "   - Taxa de juros: " + j3 + "% a.m.";
			}
		} else {
			if (cUpper == 'A') {
				valorPrimeiraParcela = o4A / p4;

				s = "Valor da oferta de crédito escolhida: R$" + String.format("%.2f", o4A)
						+ "\nQuantidade de parcelas: " + p4 + "   - Valor da primeira parcela: R$"
						+ String.format("%.2f", valorPrimeiraParcela) + "\nValor total a pagar: R$59844,70"
						+ "   - Taxa de juros: " + j2 + "% a.m.";
			} else if (cUpper == 'B') {
				valorPrimeiraParcela = o4B / p4;

				s = "Valor da oferta de crédito escolhida: R$" + String.format("%.2f", o4B)
						+ "\nQuantidade de parcelas: " + p4 + "   - Valor da primeira parcela: R$"
						+ String.format("%.2f", valorPrimeiraParcela) + "\nValor total a pagar: R$119689,50"
						+ "   - Taxa de juros: " + j2 + "% a.m.";
			} else if (cUpper == 'C') {
				valorPrimeiraParcela = o4C / p4;

				s = "Valor da oferta de crédito escolhida: R$" + String.format("%.2f", o4C)
						+ "\nQuantidade de parcelas: " + p4 + "   - Valor da primeira parcela: R$"
						+ String.format("%.2f", valorPrimeiraParcela) + "\nValor total a pagar: R$149611,90"
						+ "   - Taxa de juros: " + j1 + "% a.m.";
			} else {
				valorPrimeiraParcela = o4D / p4;

				s = "Valor da oferta de crédito escolhida: R$" + String.format("%.2f", o4D)
						+ "\nQuantidade de parcelas: " + p4 + "   - Valor da primeira parcela: R$"
						+ String.format("%.2f", valorPrimeiraParcela) + "\nValor total a pagar: R$197288,30"
						+ "   - Taxa de juros: " + j1 + "% a.m.";
			}
		}

		return s;
	}

}
