package com.java;

import javax.swing.JOptionPane;

public class EjerciciosBasicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Ejercicio 1

	double varA=5.0;
	double varB=10.0;
	double varC=20.0;
	
	double suma  = varA+varB+varC;
	double resta = varA-varC;
	double mul   = varA*varB;
	double div   = varA/varB;
	
System.out.println("La suma de la variable A mas B mas C = "+ suma );
System.out.println("La resta de la variable A menos C = "+ resta );
System.out.println("La Multiplicacion de la variable A por B = "+ mul );
System.out.println("La Divicion de la variable A entre B = "+ div );
	
System.out.println(" ");

  //ejercicio 2
	
	String  Var1 = "Cool" ;
	String  Var2 = "Selenium con Java" ;
    String  Var3 = "Curso de" ;
	String  Var4 = "Testers"; 
	
	System.out.println(Var3+" "+Var2+" "+Var1+" "+Var4);
	
	
	int edad;                                                
	int códigoPostal; 
	double altura;                                              
	String genero;                    
	String nombre;                                              
	int númeroDeHijos; 
	double  iva;                        
	double tallaCamisa; 
    double peso; 
    double precio;  
    String alumnoRepetidor;
    String  mensaje; 
     String letra;
     String mayorEdad;                                               
     double minutos;
     String días;
	int  matriculaCoche;        
	int contador; 
	boolean mayorDeEdad;
	String tallaCamiseta;
	
	int Z=9;
	int Y=8;
	
	int X = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero "));
	
	if (Y > Z) {
		
		System.out.println(Y +" es mayor que "+ Z );
		
	}else if (Y == Z) {
		
		System.out.println(Y+" es igual a "+ Z);
	}
	else {
		
		System.out.println(Y+" es menor que "+Z);
	}
	
	
	if (X < 0 && X % 2==0) {
	System.out.println("Tu vriable es negtiva");
	System.out.println("Tu vriable es par");
		
	} else if (X < 0 && X  %2 != 0){
		System.out.println("Tu variable es negativa");
		System.out.println("Tu vriable es impar");
		
	}else if (X > 0 && X %2==0) {	
		System.out.println("Tu vriable es negtiva");
	System.out.println("Tu vriable es par");
	
	} else if (X > 0 && X %2==0) {	
	System.out.println("Tu vriable es positiva");
    System.out.println("Tu vriable es par");
	}
	else if (X > 0 && X % 2!=0) {	
		System.out.println("Tu vriable es positiva");
	    System.out.println("Tu vriable es impar");
	
	 }else {
		 System.out.println("Tu vriable es 0");
	 } 
   }

}
