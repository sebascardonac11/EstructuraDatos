/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author placebo
 */
public class BuscaMinas {

    int tablero[][] = new int[20][20];
    double w = 0;
    double z = 0;
    int ntminas = 0;
    int intento = 75;
    int tminas = 10;
    int nminas = 0;

    public void llenarMinas() {
        for (int j = 0; j < 20; j++) {
            for (int i = 0; i < 20; i++) {
                tablero[j][i] = 0;
            }
        }
        do {
            w = Math.random() * 20;
            z = Math.random() * 20;
            w = (int) w;
            z = (int) z;
            if (z != 0 && w != 0 && z != 20 - 1 && w != 20 - 1) {
                tablero[(int)w][(int) z] = 1;
                ntminas++;
            }
        } while (ntminas <= 10);
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(" "+tablero[i][j]);
            }
            System.out.println("|");
        }
    }
    public void buscarMina(int x, int y){
        if(tablero [x][y]==0){
       			
       			if (x==0&&y==0){
       				if(x+1>=0 && x+1<20 && y<20)
       					nminas=nminas+tablero [x+1][y];
       				if(x+1>=0 && x+1<20 && y+1<20 && y+1>=0)
       					nminas=nminas+tablero [x+1][y+1];
       				if(x>=0 && x<20 && y+1<20 && y+1>= 0)
       					nminas=nminas+tablero [x][y+1];
       			}
       			else {
       				if(y==0){
       					if(x+1>=0 && x+1<20 && y<20)
       						nminas=nminas+tablero [x+1][y];
       					if(x-1>=0 && x-1<20 && y<20)
       						nminas=nminas+tablero [x-1][y];
       					if(x-1>=0 && x-1<20 && y+1<20 && y+1>=0)
       						nminas=nminas+tablero [x-1][y+1];
       					if(x>=0 && x<20 && y+1<20 && y+1>= 0)
       						nminas=nminas+tablero [x][y+1];
       					if(x+1>=0 && x+1<20 && y+1<20 && y+1>=0)
       						nminas=nminas+tablero [x+1][y+1];
       					
       				}
       				
       				else{
       				
       					if(x-1>=0 && x-1<20 && y-1<20)
       						nminas=nminas+tablero [x-1][y-1];
       					if(x>=0 && x<20 && y-1<20)
       						nminas=nminas+tablero [x][y-1];
       					if(x+1>=0 && x+1<20 && y-1<20)
       						nminas=nminas+tablero [x+1][y-1];
       					if(x+1>=0 && x+1<20 && y<20)
       						nminas=nminas+tablero [x+1][y];
       					if(x-1>=0 && x-1<20 && y<20)
       						nminas=nminas+tablero [x-1][y];
       					if(x-1>=0 && x-1<20 && y+1<20 && y+1>=0)
       						nminas=nminas+tablero [x-1][y+1];
       					if(x>=0 && x<20 && y+1<20 && y+1>= 0)
       						nminas=nminas+tablero [x][y+1];
       					if(x+1>=0 && x+1<20 && y+1<20 && y+1>=0)
       						nminas=nminas+tablero [x+1][y+1];
       					}
       			 }
       			 System.out.print("\n	Mina no encontrada. ");
       			 
       			 if(intento>tminas)
       			 	 System.out.print("	Alrededor hay: "+ nminas);
       			 System.out.println("\n	Intentos restantes: "+(intento-1));
       		}
       		else
       			{
       				tminas = tminas-1;
       				System.out.println("\n	Acertaste!, Mina Eliminada Restan "+tminas+" Minas");
       				System.out.println("\n	Intentos restantes: "+(intento-1));
       			}
       	
    }
}
