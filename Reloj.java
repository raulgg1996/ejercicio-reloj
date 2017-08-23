
public class Reloj
{
    private int horas;
    private int minutos;
    
    public Reloj(int horainicial,int mininicial)
    {
        horas=horainicial;
        minutos=mininicial;
    }
    public String dimeTuTiempo()
    {
        String cadResultado="";
        cadResultado=cadResultado+horas;
        cadResultado=cadResultado+":";
        cadResultado=cadResultado+minutos;
        
        return cadResultado;
    }
    
}   