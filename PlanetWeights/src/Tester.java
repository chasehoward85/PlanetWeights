import java.util.*;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("What is your weight on Earth?");
		Scanner kbReader = new Scanner(System.in);
		double ew = kbReader.nextDouble();
		
		System.out.println("\n\nWhat planet would you like to know your weight on?");
		System.out.println("	1.Voltar\n	2.Kyrpton\n	3.Fertos\n	4."
				+ "Servontos");
		int planet = kbReader.nextInt();
		
		double vw = ew * 0.091;
		double kw = ew * 0.720;
		double fw = ew * 0.865;
		double sw = ew * 4.612;
		
		switch(planet)
		{
		case 1: //Voltar
			System.out.println("Your weight on Voltar is " + vw + " pounds");
				break;
		case 2: //Kyrpton
			System.out.println("Your weight on Kyrpton is " + kw + " pounds");
				break;
		case 3: //Fertos
			System.out.println("Your weight on Fertos is " + fw + " pounds");
				break;
		case 4: //Servontos
			System.out.println("Your weight on Servontos is " + sw + " pounds");
				break;
		default:
			System.out.println("Pick a number between 1 and 4 only");
		}
		
	}

}
