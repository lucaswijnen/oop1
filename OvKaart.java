package week1;

public class OvKaart
{
    private double saldo;
    private boolean ingecheckt;

    public OvKaart(double startSaldo)
    {
	saldo = Math.max(startSaldo, 0);
	ingecheckt = false;
    }

    public double bekijkSaldo()
    {
	return saldo;
    }

    public void voegSaldoToe(double bedrag)
    {
	if (bedrag > 0)
	{
	    saldo += bedrag;
	    System.out.println("Je nieuwe saldo: " + saldo);
	}
	else
	{
	    System.out.println("Een ongeldig bedrag.");
	}
    }

    public boolean isIngecheckt()
    {
	return ingecheckt;
    }

    public void setIngecheckt(boolean status)
    {
	ingecheckt = status;
    }

    public boolean betaalRit(double kosten)
    {
	if (saldo >= kosten)
	{
	    saldo -= kosten;
	    return true;
	}
	return false;
    }
}
