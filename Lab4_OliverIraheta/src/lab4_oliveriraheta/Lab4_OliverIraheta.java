package lab4_oliveriraheta;

import java.util.Scanner;
import java.util.Random;

public class Lab4_OliverIraheta {

    
    public static void main(String[] args) {
        Scanner vini = new Scanner(System.in);
        Scanner rm = new Scanner(System.in);
        boolean bandera = true;
        //try{
            do{
                System.out.println("_________________________________________");
                System.out.println("Bienvenid@ al Laboratorio #4");
                System.out.println("Ingrese una opcion (4. para salir}");
                System.out.println("1. Fallout words        2. Rodatcripne      3. Alpha");
                int opc = vini.nextInt();
                
                switch(opc){
                    case 1:
                        falloutwords();break;
                        
                    case 2:
                        System.out.println(Rodatcripne());break;
                        
                    case 3:
                        System.out.println("Ingrese una cadena");
                        String cadena = rm.nextLine();
                        is_alpha(cadena);
                        break;
                        
                    case 4:bandera=false;break;
                        
                    default: System.out.println("Opcion no valida");            
                }
            }while(bandera==true);
       // }catch(Exception e){System.out.println("Usted ingreso un caracter no valido ");}
    }

    public static void falloutwords (){
        Scanner vini = new Scanner(System.in);
        String _hack="";
        int vidas= 6;
        int hack = new Random().nextInt((10-1)+1)+1;
        
        if(hack==1){_hack="comer";}else if(hack==2){_hack="jugar";}else if(hack==3){_hack="salta";}else if(hack==4){_hack="llora";}else if(hack==5){_hack="muere";}
        else if(hack==6){_hack="unida";}else if(hack==7){_hack="venti";}else if(hack==8){_hack="llama";}else if(hack==9){_hack="eevee";}else if(hack==10){_hack="local";}     
         //System.out.println(_hack);      
        boolean bandera=false;
        
        while(bandera==false && vidas!=0){
            vidas-= 1;
            System.out.println("Solo tiene "+vidas+" vidas");
            System.out.println("Lista de palabras");
            System.out.println("1. Comer    2. jugar    3. salta    4.Llora     5. Muere");
            System.out.println("6. Unida    7. Venti    8. Llama    9.Eevee     10. Local");
            int opc = vini.nextInt();
            switch(opc){
                case 1: if(hack==1){System.out.println("¡Acceso concedido!");bandera=true;}
                else{}break;
                default: break;
            }
         } 
        }
    public static String Rodatcripne(){
        Scanner rm = new Scanner (System.in);//solo para strings
        String newpassword="";
        String invertida="";
        String password = ""; 
        boolean band= false;
        do{ 
          band = false;
          System.out.println("Ingrese su contraseña(En minusculas)");
          password= rm.nextLine();
          for(int i=0; i<=password.length()-1;i++){
             char c = password.charAt(i);
             if(c>=65 && c<=90){
                   band=true;}
           }
           if(band==true){System.out.print("");}
           }while(band==true);
        
        for(int b=password.length()-1; b>=0;b--){
            invertida += password.charAt(b);
        }
        
        for(int z=0; z<invertida.length(); z++){
            int ran = new Random().nextInt(10);
            char letra = invertida.charAt(z);
            if(z%2!=0){
                newpassword+= ran;
            }else{
            newpassword += letra;
        }         
     }      
        return newpassword;
    }
    
    public static void is_alpha(String cadena){
        boolean _bandera= false;
        for(int s=0; s<cadena.length(); s++){
           char leer = cadena.charAt(s);
           if(leer>=65 && leer<=90 || leer>=97 && leer<=122){
               _bandera= false;
           }else{_bandera=true;break;}      
        }
        if(_bandera==false){System.out.println("La cadena solo contiene letras");}
        else{System.out.println("La cadena contiene caracteres que no son letras");}
       
    }
}
