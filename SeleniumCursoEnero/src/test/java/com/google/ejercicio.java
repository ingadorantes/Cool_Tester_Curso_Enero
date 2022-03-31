package com.google;

import java.util.ArrayList;
import java.util.List;

public class ejercicio {
	
	public double sumaVariables(double a, double b) {
		 double res = a +b;	
		return res;
	}
	public double sumaVariables(double a, double b, double c) {
		 double res = a +b+c;	
		return res;
	}
	
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public double getTamaño() {
		return tamaño;
	}
	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}
	public String getSexo() {
		return Sexo;
	}
	public void setSexo(String sexo) {
		Sexo = sexo;
	}
	private double tamaño;
	private String Sexo;
	private String raza;
	
	public ejercicio () {	
		
	}
	 public static int[] burbuja(int[] arreglo)
	    {
	      int auxiliar,varA,varB;
	      int[] arregloOrdenado;
	      for(int i = 2; i < arreglo.length; i++)
	      {
	        for(int j = 0;j < arreglo.length-i;j++)
	        {
	        	varA = arreglo[j];
	        	varB = arreglo[j+1];
	          if(arreglo[j] > arreglo[j+1])
	          {
	            auxiliar = arreglo[j];
	            arreglo[j] = arreglo[j+1];
	            arreglo[j+1] = auxiliar;
	          }   
	        }
	      }
	      arregloOrdenado = arreglo;
	      return arregloOrdenado;
	    }
	 
	 public static int [] insertionSort(int array[]) {
		         int [] arregloOred;
		    for (int j = 1; j < array.length; j++) {
		        int current = array[j];//3//4//6//6//3
		        System.out.println("vlorCurrent "+current);
		        int i = j-1;//0
		        System.out.println("valor i "+i);
		        while ((i > -1) && (array[i] > current)) {
		            array[i+1] = array[i];
		            System.out.print("Vlorwhile:"+ array[i+1]+" " );
		            i--;
		        }
		        
		        array[i+1] = current;//
		        System.out.println("ValorFinal: "+array[i+1]);
		       // System.out.println("valorfina "+current);
		        System.out.println("****");
		        
		    }
		    arregloOred=array;
		    return arregloOred;
		}
	
	public static void main(String[] args) {
		  // TODO Auto-generated method stub
		int[] array = {1,3,4,6,6,3,1,8,9,3};//1,3,4,6,8,9;
					 
		int arregloOrdenado[]=ejercicio.insertionSort(array);
 
  //imprimimos el arreglo ordenado.
		
// System.out.println(arregloOrdenado[i]);	
// System.out.print(arregloOrdenado[i]);
    	  int varA,varB;
    	  for(int j=0;j<arregloOrdenado.length;j++) {    		      		
    		    // for (int i=0;i<arregloOrdenado.length;i++) {
    		    	 int rep=arregloOrdenado.length-1;//10
    		    	 if (j<rep) {
    		    		  varB = arregloOrdenado[j+1];//1
    		    	 }else {
    		    		 varB = arregloOrdenado[j-1];//1
    		    	 }
    		    	   varA = arregloOrdenado[j]; //1
	                 	                
	                    boolean bander=true;       
	                         if (varA==varB) {
	                         bander =false;
	                           }  		    	 
	                          if(bander) {
	         		         System.out.print(varA+" ");
	                  }
    		    
    		    	
    		    }
    	  
    	 // }
    		    
    
    	  }        
     }
