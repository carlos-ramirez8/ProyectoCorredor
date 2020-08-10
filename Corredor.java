import java.util.Scanner;

public class Corredor {
       int SumaEnergia;
       int energia;
       
       
       public void VerificarEnergia() {
    	   Scanner ingresar =new Scanner(System.in);
    	  System.out.println("ingrese el valor de energia");
    	  energia = ingresar.nextInt();
    	  
    	  if (energia >= 0 && energia <100)
    		  System.out.println("el valor si se encuentre entre 0 y 100");
    	    if(energia>100)
    	    	energia=100;
    	        System.out.println("el valor de energia es " + energia);
    	          if(energia<0) {
    	        	  energia = 0;
    	        	  System.out.println("el valor de energia es mayor o igual a 0");
  }
    	 	 
 }
       public void RecargarEnergia(int sumaEnergia) {
    	   if (energia <100) {
    		   energia+= sumaEnergia;
    		   System.out.println("la energia total al recargar es :" +  energia);
    	   }else {
    		   System.out.println(" se llego al maximo de energia =100");
    		   
    		   
    	   }
     }
               public void Correr() {
            	   if (energia <10) {
            		   energia = 0;
            		   System.out.println(" se llego al minimo de energia   -" +energia);
            		   System.out.println("Energia agotada");
            		   
            	      }else {
            	    	  energia-=10;
            	    	  System.out.println("la energia es: "+energia);
            	    	  
            	    	  
            	      }
            	   }
                  
                   	public void entrenar() {
               		int entrenamiento = 15;
               		energia+=entrenamiento;
               		if(energia>100) {
               			energia=100;
               			System.out.println("SU ENERGIA NO PUEDE SER MAYOR A 100");
               			System.out.println("RESTABLECIENDO SU ENERGIA");
               			System.out.println("SU ENERGIA ES DE: "+ energia);
               		}else {
               			System.out.println("SU ENERGIA ES DE: "+ energia);
               		}
               	}
}
       

