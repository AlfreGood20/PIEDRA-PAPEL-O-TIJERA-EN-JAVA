package gamess;
import java.util.*;
import javax.swing.JOptionPane;

public class piedraPapelOrTijera {

	public static void main(String[] args) {
		int rondas;
		int ganadas=0;
		int perdidas=0;
		int empates=0;
		
		String numeros=JOptionPane.showInputDialog(null,"¿CUANTAS RONDAS VAS A JUGAR?","¡Hora de jugar!",JOptionPane.QUESTION_MESSAGE);
		rondas=Integer.parseInt(numeros);
		
		String [] JUEGO= {"PIEDRA","PAPEL","TIJERA"};
		int i=1;

		for(i=1;i<=rondas;i++){
			Random random=new Random();
			int eleccion=JOptionPane.showOptionDialog(null, "GANALE A LA MAQUINA", "MAQUINA", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, JUEGO, JUEGO[0]);
			//numeros aleatorios
			int numero_aleatorio=0+random.nextInt(3);
			if(eleccion==0){
				//SI NUMERO ALEATORIO ES IGUAL AL NUMERO SELECCIONADO ES EMPATE 0=0
				if(numero_aleatorio==eleccion && numero_aleatorio==0){
					JOptionPane.showMessageDialog(null,"Ronda #"+i+"\nUsted acaba de empate");
					empates+=1;
				}
				//SI NUMERO ALEATORIO ES MAYOR AL NUMERO SELECIONADO PIERDE LA MAQUINA 1=0
				else if(numero_aleatorio>eleccion && numero_aleatorio==1){
					JOptionPane.showMessageDialog(null,"Ronda #"+i+"\nUsted acaba de perder");
					perdidas+=1;
				}
				//SI NUMERO ALEATORIO ES MAYOR Y EL NUMERO ALEATORIL ES 2=0 
				else{
					JOptionPane.showMessageDialog(null,"Ronda #"+i+"\nAcabas de ganarme");
					ganadas+=1;
				}
			}
			if(eleccion==1){
				//piedra=0 papel=1 tijera=2
				if(numero_aleatorio==eleccion && numero_aleatorio==1){
					JOptionPane.showMessageDialog(null, "Ronda #"+i+"\nUsted acaba de empate");
					empates+=1;
				}
				else if(numero_aleatorio>eleccion && numero_aleatorio==0){
					JOptionPane.showMessageDialog(null,"Ronda #"+i+"\nUsted acaba de perder");
					perdidas+=1;
				}
				else{
					JOptionPane.showMessageDialog(null,"Ronda #"+i+"\nAcabas de ganarme");
					ganadas+=1;
				}
			}
			if(eleccion==2){
				if(numero_aleatorio==eleccion && numero_aleatorio==2){
					JOptionPane.showMessageDialog(null, "Ronda #"+i+"\nUsted acaba de empate");
					empates+=1;
				}
				else if(numero_aleatorio>eleccion && numero_aleatorio==1){
					JOptionPane.showMessageDialog(null,"Ronda #"+i+"\nAcabas de ganarme");
					ganadas+=1;
				}
				else{
					JOptionPane.showMessageDialog(null,"Ronda #"+i+"\nUsted acaba de perder");
					perdidas+=1;
				}
			}
			JOptionPane.showMessageDialog(null,"ESTADISTICAS\nGanadas: "+ganadas+"\nEmpate: "+empates+"\nPerdidas: "+perdidas);
		}
	}
}