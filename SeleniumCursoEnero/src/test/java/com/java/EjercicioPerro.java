package com.java;

public class EjercicioPerro {		
	
	public static String shouldWakeUp (boolean ladrando, int hourOfDay) {
		String perro;
	if (ladrando) {//ver
		if (hourOfDay >= 0 && hourOfDay <= 23) {
			 if (hourOfDay < 8 || hourOfDay > 22) {	
				 perro ="Despiesta. El perro esta ladrando";//ver
				 
			}else {
			    perro ="Duerme. El perro esta dormido";//fal
		} 
		}else {
			perro = "No tiene el rango correcto ";//fal
		}
			
		}else{ 
			perro="Duerme. El perro esta dormido";//false
		}
							
	return perro;	
	}

  }
	

