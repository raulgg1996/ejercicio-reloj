/**
 * @author Raul Gonzalez Gonzalez
 * version 4.1.1
 */
public class Reloj
{
    private int horas;
    private int minutos;
    
    public Reloj(int horainicial,int mininicial)
    {
        horas=horainicial;
        minutos=mininicial;
    }
    /**
     * metodo que permite mostrar al usuario la hora exacta con 4 digitos.
     * 
     */
    public String dimeTuTiempo()
    {
        String cadResultado="";
        if (horas<10)
        {
            cadResultado=cadResultado+"0";
        }
        cadResultado=cadResultado+horas;
        cadResultado=cadResultado+":";
        if(minutos<10)
        {
            cadResultado=cadResultado+"0";
        }
        cadResultado=cadResultado+minutos;
        
        return cadResultado;
    }
    /**
     * metodo que permite avanzar el reloj un minuto cada vez que el usuario lo decida.
     */
    public void TicTac()
    {
        if(minutos<=59)
        {
            minutos=minutos+1;
    
        }
        else
        {
            minutos=00;
            horas+=1;
            
        }
        if(horas>23)
        {
            horas=00;
            
        }
        else
        {
            minutos+=1;
        }
    } 
}   