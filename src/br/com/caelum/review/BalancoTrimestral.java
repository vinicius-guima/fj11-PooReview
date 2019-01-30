package br.com.caelum.review;

public class BalancoTrimestral {

	public static void main(String[] args) {

		int gastoJaneiro = 1500;
		int gastoFevereiro = 2300;
		int gastoMarco = 1700;
		int gastoTrimestre = gastoJaneiro + gastoFevereiro + gastoMarco;
		int mediaMensal = gastoTrimestre / 3;

		System.out.println("O valor gasto no trimestre foi " + gastoTrimestre);

		System.out.println("A média de valores no trimestre é de R$: " + mediaMensal);
	}
}
