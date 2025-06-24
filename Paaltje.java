package week1;

public class Paaltje
{
    public void checkIn(OvKaart kaart)
    {
	if (!kaart.isIngecheckt())
	{
	    kaart.setIngecheckt(true);
	    System.out.println("Je bent ingecheckt.");
	}
	else
	{
	    System.out.println("Je bent al ingecheckt!");
	}
    }

    public void checkUit(OvKaart kaart, double ritKosten)
    {
	if (kaart.isIngecheckt())
	{
	    if (kaart.betaalRit(ritKosten))
	    {
		System.out.println("Je bent uitgecheckt.");
		System.out.println("Ritkosten: " + ritKosten);
		System.out.println("Nieuw saldo: " + kaart.bekijkSaldo());
	    }
	    else
	    {
		System.out.println("Je hebt onvoldoende saldo.");
	    }
	    kaart.setIngecheckt(false);
	}
	else
	{
	    System.out.println("Je was niet ingecheckt!");
	}
    }
}
