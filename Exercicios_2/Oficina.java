package Exercicios_2;

import java.util.Scanner;

public class Oficina {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		Marcenaria furadeira1 =new Marcenaria ();
		furadeira1.sethora_uso(3);;
		furadeira1.setVolts(5);
				
		Marcenaria lixadeira =new Marcenaria ();
		lixadeira.sethora_uso(2);
		lixadeira.setVolts(5);
		
		Marcenaria serra =new Marcenaria ();
		serra.sethora_uso(4);
		serra.setVolts(5);
		
		Marcenaria alicate =new Marcenaria ();
		
		Marcenaria martelo =new Marcenaria ();
		
		Marcenaria serrote =new Marcenaria ();
		
		
		
		System.out.println("Com base na hora de uso, a Furadeira tem " + furadeira1.calcDesgaste(furadeira1.gethora_uso())+"% de horas de uso");
		System.out.println(" O consumo eletrico da Furadeira por semana é de " + furadeira1.calcSemana(furadeira1.gethora_uso(), furadeira1.getVolts()));
		System.out.println(" O consumo eletrico da Furadeira por mes é de " + furadeira1.calcMes(furadeira1.gethora_uso(), furadeira1.getVolts()));
		System.out.println();
		System.out.println("Com base na hora de uso, a lixadeira tem " + lixadeira.calcDesgaste(lixadeira.gethora_uso())+"% de horas de uso");
		System.out.println(" O consumo eletrico da lixadeira por semana é de " + lixadeira.calcSemana(lixadeira.gethora_uso(), lixadeira.getVolts()));
		System.out.println(" O consumo eletrico da lixadeira por mes é de " + lixadeira.calcMes(lixadeira.gethora_uso(), lixadeira.getVolts()));
		System.out.println();
		System.out.println("Com base na hora de uso, a Serra tem " + serra.calcDesgaste(serra.gethora_uso())+"% de horas de uso");
		System.out.println(" O consumo eletrico da serra por semana é de " + serra.calcSemana(serra.gethora_uso(), serra.getVolts()));
		System.out.println(" O consumo eletrico da serra por mes é de " + serra.calcMes(serra.gethora_uso(), serra.getVolts()));
		
		System.out.println(lixadeira.calcWatts(lixadeira.gethora_uso(), lixadeira.getVolts()));
		
	}

}
