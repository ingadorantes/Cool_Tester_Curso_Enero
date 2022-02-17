package com.java;

public class Ejer_java_extra {

	public static boolean isLeapYear (int ayo) {
		
		boolean bandera=true;
		if (ayo>=0 && ayo<= 9999) {			 
			//if paso 1
			 if (ayo %4 == 0 ) {
				 //if paso 2
			     if(ayo %100 == 0) {
			    	 if (ayo %400 == 0 ) {
			    		 System.out.print("El año es un año bisiesto (tiene 365 dias)");
			    		 bandera =true; 
			    	 }else {
			    		 System.out.print("El año no es un año bisiesto (tiene 365 dias)");
			    		 bandera = false;
			    	 }
			    //if paso 4
			     }else {	
			    	 System.out.print("El año es un año bisiesto (tiene 365 dias)");
			    	 bandera =true;
			    }
				//if paso 5
			}else {	
				System.out.print("El año no es un año bisiesto (tiene 365 dias)");
				 bandera = false;
			}	 
		}else {	bandera=false;
		}
		return  bandera;
	}
	
	public static double area(double radio) {
		
		double res;
		if (radio < 0) {	
			res=-1;
		}else {
			 radio=Math.pow(radio, 2.0);
			System.out.print("El area del circulo es: ");
			res= Math.PI*(radio);
		}		
		return res;	}

 public static double area (double base,double altura) {
		
		double res;
		if (base < 0 || altura <0) {	
			res=-1.0;
		}else {
			System.out.print("El area del Rectangulo es: ");
			res= base*altura;
		}		
		return res;	}

 
 public  static int getBucketCount (double ancho, double altura, double areaPerBucket, double extraBuckets) {
	 
	           int capacidad;
	           if (ancho<=0||altura<=0||areaPerBucket<=0||extraBuckets<0) {
	        	   
	        	   capacidad=-1;
	           }else {
	        	   double cap1;
	        	   double area =ancho * altura;
	        	 cap1 = Math.ceil(area/areaPerBucket);
	        	 cap1 = cap1 - extraBuckets;
	        	 capacidad = (int)cap1;  
	           } 
	 return capacidad;
 }
 public  static int getBucketCount (double ancho, double altura, double areaPerBucket) {
	 
     int capacidad;
     if (ancho<=0||altura<=0||areaPerBucket<=0) {
  	   
  	   capacidad=-1;
     }else {
  	   double cap1;
  	   double area =ancho * altura;
  	 cap1 = Math.ceil(area/areaPerBucket);
  	 capacidad = (int)cap1;  
     } 
return capacidad;
}
 public  static int getBucketCount (double area, double areaPerBucket) {
	 
     int capacidad;
     if (area<=0||areaPerBucket<=0) {
  	   
  	   capacidad=-1;
     }else {
  	   double cap1;
  	 cap1 = Math.ceil(area/areaPerBucket);
  	 capacidad = (int)cap1;  
     } 
return capacidad;
}
		
} 
