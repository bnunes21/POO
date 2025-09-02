package RafazendoExercicio1;

public class Cozinha {

	public static void main(String[] args) {
		Geladeira g1 = new Geladeira("Gela tudo", "Brasgelada", 50, 15);
		Fogao f1 = new Fogao("Bota fogo", "Brasfogo", 10, 5);
		LavaLouca l1= new LavaLouca("Lava até a mãe", "Eletrolux", 5, 2);
		MicroOndas m1 = new MicroOndas("Esquenta e assa", "Philco", 5, 3);
		FornoEletrico forn = new FornoEletrico("Esquenta demais", "CCE", 5);
		
		double consumoTotalMensal = g1.calcMensal() 
				+ f1.calcMensal() 
				+l1.calcMensal()
				+m1.calcMensal()
				+forn.consumoMensal();
		
		double consumoThenDaysTotal = g1.thenDay()
				+f1.thenDay()
				+l1.thenDay()
				+m1.thenDay()
				+forn.consumoDias();
				
				
	System.out.println(" O consumo total da cozinha em 30 dias foi de" + consumoTotalMensal);
	System.out.println(" O consumo total da cozinha em 10 dias foi de" + consumoThenDaysTotal);
	System.out.println(" O consumo total do forno em 10 dias foi de" + forn.consumoDias());
	System.out.println(" O consumo total do forno em 30 dias foi de" + forn.consumoMensal());


	}


}
