package codigo06;

import java.util.Scanner;

//Se añadió main
public static void main(String[] args) {
		
	// Se refactorizó el nombre de la clase
	// codigo6 -- Codigo6
		public class Codigo6 {
			
			//Se añadió la clase scanner y se importó
			 Scanner s = new Scanner(System.in);
			 int[] numero = s.nextLine();
			       numero = 20;
			//Se cambió el nombre de la variable n --- numero  
		    //int[] numero = [20];
                      // Faltaba añadir un signo de +
		    for (int i = 0; i < 20; i++) {
		      numero[i] = (int)(Math.random() * 381) + 20;
		      System.out.print(numero[i] + " ");
		      // se añadió out después de system
		    }
		    
		    System.out.printl("\n¿Qué números quiere resaltar? ");
		    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
		    // Faltaba cerrar con un paréntesis
		    int opcion = Integer.parseInt(System.console().readLine());
            //Se cambió la posición de los paréntesis
		    int multiplo = (opcion == 1 : 5 ? 7);

		     foreach (char e : numero) {
		      if (e % multiplo == 0) {
		        System.out.print("[" + e + "] ");
		       else {	   
		        System.in.print(e + " ");
		      }
		    }
		  
		}
	}
}