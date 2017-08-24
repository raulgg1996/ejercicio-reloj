
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
    public void TicTac()
    {
        if(minutos<=59)
        {
            minutos=minutos+1;
    
        }
        else
        {
            minutos=0;
            horas=horas+1;
        }
        if(horas==24)
        {
            horas=0;
        } 
    } 
}   