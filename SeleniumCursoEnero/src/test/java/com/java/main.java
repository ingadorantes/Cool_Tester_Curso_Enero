package com.java;

import java.text.DecimalFormat;

public class main {

	public static void main(String[] args) {
			
		//String chiuaua= EjercicioPerro.shouldWakeUp(true, 8);		
	System.out.println(EjercicioPerro.shouldWakeUp(true, 8));
	System.out.println(" ");	
	System.out.println(EjerTres.areEqualByThreeDecimalPlaces(3.0,-3.0));
	System.out.println(" ");
	System.out.println(EjerTres.isCatPlaying(false, 35));
	System.out.println(" ");
	EjerTres.imprimirVerificadorNumeros(1, 2, 3);
	System.out.println(" ");
	EjerTres.printMegaBytesAndKiloBytes(5000);
	System.out.println(" ");
	System.out.println(EjerTres.sumOdd(100,1000));
	System.out.println(" ");
	System.out.println(EjerTres.hasEqualSum(1, 1, 2));
	System.out.println(" ");
	System.out.println(EjerTres.EjerTre(1,3));
	System.out.println(" ");
	System.out.println(Ejer_java_extra.isLeapYear(2024));
	System.out.println(" ");
	System.out.println(Ejer_java_extra.area(5.0));
	System.out.println(" ");
	System.out.println(Ejer_java_extra.area(-5.0,4.0));
	System.out.println(" ");
	System.out.println(Ejer_java_extra.getBucketCount(3.4,2.1,1.5,2));
	System.out.println(Ejer_java_extra.getBucketCount(2.75,3.25,2.5,1));
	System.out.println(Ejer_java_extra.getBucketCount(3.4,2.1,1.5));
	System.out.println(Ejer_java_extra.getBucketCount(7.25,4.3,2.35));
	System.out.println(" ");
	persona persona1=new persona();
	persona1.setFirstName("");
	persona1.setLastName("");
	persona1.setEdad(10);
	System.out.println("Nombre completo: "+persona1.getFullName());
	System.out.println("adolecente: "+ persona1.isTeen());
	persona1.setFirstName("juan");
	persona1.setEdad(18);
	System.out.println("Nombre completo: "+persona1.getFullName());
	System.out.println("adolecente: "+ persona1.isTeen());
	persona1.setLastName("smith");
	System.out.println("Nombre completo: "+persona1.getFullName());
	}

}
