package com.java;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] nombres = new String[2][3];
		nombres[0][0]= "Ricardo";
		nombres[0][1]= "Adonai";
		nombres[0][2]= "Irma";
		nombres[1][0]= "Alejandro";
		nombres[1][1]= "Zeltzin";
		nombres[1][2]= "Adolfo";
		
		for(int i=0;i <2;i++) {
			
			     for (int j=0;j<3;j++) {
			    	    	 
			  System.out.println(" Nombre: "+ nombres [i][j] +" Posicion: "+i+","+j );
			    	 
			    }
		}

	}

}
