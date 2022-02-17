package com.java;


public class EjerTres {
		
	public static boolean areEqualByThreeDecimalPlaces (double a, double b) {
		boolean cierto;
		
		double numeroA= a*1000;
		int VarA=(int)numeroA;
		double numeroB= b*1000;
		int VarB=(int)numeroB;	   
		  
		if (VarA==VarB) {			
			cierto =true;			
		}else {			
			cierto =false;
		}
				
		return  cierto;	
	}
	
	public static boolean isCatPlaying (boolean verano,int temperatura ) {
		
		int varZ;
		
		if(verano) {
		  varZ=1;
		}else {
		  varZ=2;
		}
				
		 switch(varZ) {		
		 case 1:
			 if (temperatura >= 25 && temperatura <= 45 ) {	
				verano= true; 
			 }else {
				 verano=false;
			 }
			 
		 case 2:
			 if (temperatura >= 25 && temperatura <= 35 ) {	
					verano= true; 
				 }else {
					 verano=false;
				 }		
		 }
	     return verano;
	}
	
	public static void  imprimirVerificadorNumeros (int z, int y, int x) {
		
		if (z<0 && y<0 && x<0) {					
			System.out.println("Valor no valido ");
		}else if (z==y && z==x && y==x ) {
			System.out.println("Todos los numeros son iguales ");
		}else if (z != y && z!=x && y!=x) {
			System.out.println("Todos los numeros son diferentes ");
		}else {
			System.out.println("Ni todos son iguales o diferentes");
		}
	}
	
	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		
		int zz= kiloBytes%1024;
		int yy= kiloBytes/1024;
		int xx= kiloBytes;		
				
		if (kiloBytes<0) {
			System.out.println("Valor no valido");
		}else {
			System.out.println(xx +" KB "+ " = "+ yy +" MB "+ zz +" KB" );
			
		}
				
	}
	public static int sumOdd (int ini, int fin ) {
	 
		int varM = 0;
		int totalSum=0;
		int ini2=0;
		
		if (isOdd(ini)) {					
		      if(ini > fin ) {		
			   varM=-1;
		     }else {
			for( ini2=ini ;ini2<=fin ;ini2++) {
			
			boolean imp=isOdd2(ini2);
			 if (imp) {
				 totalSum = totalSum + ini2;
			 }			 			
		}		
	  varM = totalSum;				
		}
	
	} else {
		varM=-1;
	}
		
	return varM;
}
	
	public static boolean isOdd (int numero) {
		
		boolean varN=true;
		
		if(numero>0) {
				//varN = true;			
		       			
		}else {
			varN= false;
		}
		  
		return  varN;
	}
	
	public static boolean isOdd2 (int number) {
		
		boolean varN2=true;
		 if (number%2==0) {
			   varN2 = false; 
		     } else {	  
					 varN2= true;
			   }		
		return varN2;
	}
	
	public static boolean hasEqualSum (int o, int p, int q) {
		boolean varS;
		int sum=o+p;
		
		if (sum==q) {
			varS=true;
		}else {
			varS=false;
		}
		
		return varS;
	}
	
	public static boolean  isOdd3(int number) // impar
	{
		if (number > 0 && number %2 != 0) {
			
			return true;
				
		}else
		{
			return false;
		}
			
	}
	
	public static int EjerTre(int start, int end)
	{
		int sum = 0;
		//EjerTres sm = new EjerTres();
		
		if (start <= end && start >0 && end > 0) {	
		for (int i=start; i<= end; i++)
		{
			if (isOdd3(i))
				
			{
				sum = sum + i;
			}
		}
		
		}else
		{
			sum = -1;
		}
		return sum;
	}
	
}
