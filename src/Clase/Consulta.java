
package Clase;



public class Consulta extends ClasePadre{
    
    @Override
    public void Transacciones()
    {
        System.out.println("-------------------------------");
        System.out.println("Tu saldo actual es: "+getSaldo());
        System.out.println("-------------------------------");
    
    }
    
}
