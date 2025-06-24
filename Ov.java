package week1;

import java.util.Scanner;

public class Ov
{
    public static void main(String[] args)
    {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Voer een startsaldo in: ");
	double startSaldo = scanner.nextDouble();

	OvKaart kaart = new OvKaart(startSaldo);
	Paaltje paal = new Paaltje();

	while (true)
	{
	    System.out.println("\nMenu:");
	    System.out.println("1. Bekijk saldo");
	    System.out.println("2. Voeg saldo toe");
	    System.out.println("3. Check in");
	    System.out.println("4. Check uit (ritkosten: €2.50)");
	    System.out.println("5. Stoppen");
	    System.out.print("Keuze: ");
	    int keuze = scanner.nextInt();

	    if (keuze == 1)
	    {
		System.out.println("Saldo: €" + kaart.bekijkSaldo());
	    }
	    else if (keuze == 2)
	    {
		System.out.print("Bedrag toevoegen: ");
		double bedrag = scanner.nextDouble();
		kaart.voegSaldoToe(bedrag);
	    }
	    else if (keuze == 3)
	    {
		paal.checkIn(kaart);
	    }
	    else if (keuze == 4)
	    {
		paal.checkUit(kaart, 2.50); // prijs wat je betaalt per rit
	    }
	    else if (keuze == 5)
	    {
		System.out.println("Programma gestopt.");
		break;
	    }
	    else
	    {
		System.out.println("Ongeldige keuze.");
	    }
	}

	scanner.close();
    }
}