
package Clase;

import java.util.Scanner;

/**
 *
 * @author Edgeworth
 */
public abstract class  ClasePadre {
    Scanner entrada=new Scanner(System.in);
    
   protected int transacciones,retiro, deposito;
   private static int saldo; 
   
   public void Operaciones()
   {
   int bandera=0;
   int seleccion=0;
   do
   {
   do
   {
       System.out.println("Por favor seleccione una opcion: ");
       System.out.println("    1. Consulta de saldo.");
       System.out.println("    2. Retiro de efectivo.");
       System.out.println("    3. Deposito de efectivo.");
       System.out.println("    4. Salir.");
       seleccion = entrada.nextInt();
       
       if(seleccion >=1 && seleccion <=4)
       {
       bandera =1;
       }
       else
       {
           System.out.println("--------------------------------------------------");
           System.out.println("Opcion no disponible, vuelva a intentar por favor.");
           System.out.println("--------------------------------------------------");
       }
       
       
   }while(bandera==0);
   
   if(seleccion==1)
   {
       ClasePadre mensaje=new Consulta();
       mensaje.Transacciones();
   
    }
   else if(seleccion==2)
   {
     ClasePadre mensaje=new Retiro();
      mensaje.Transacciones();
   }
   else if(seleccion==3)
   {
       ClasePadre mensaje=new Deposito();
        mensaje.Transacciones();
   }
   else if(seleccion==4)
   {
       System.out.println("-------------------------");
       System.out.println("¡Gracias!, vuelva pronto.");
       System.out.println("-------------------------");
       bandera =2;
   }
   
   
   
   }while(bandera!=2);
 }
   
   
   public void Retiro(){
   
   retiro= entrada.nextInt();
   
   }
           
  public void Deposito(){
  deposito =entrada.nextInt();
  
  }
  
  public abstract void Transacciones();

    public static int getSaldo() {
        return saldo;
    }

    public static void setSaldo(int saldo) {
        ClasePadre.saldo = saldo;
    }
  
  
  
  }
   
   

