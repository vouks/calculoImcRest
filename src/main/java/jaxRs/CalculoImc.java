package jaxRs;

import static java.lang.System.out;

public class CalculoImc {

	public CalculoImc() {}
         
	public float calculaImc(float altura, float peso) {          
            Float imc = peso/ (altura*altura);
            return imc;  
    }
	
    public String resultadoImc (float imc){ 
    	String resultado = "";
    	            
        if(imc < 18.5)  { 
        	resultado = "Abaixo do peso";   
        }
        else  if(imc >= 18.5 && imc < 25) {  
        	resultado = "Peso normal";         
        }  
        else  if(imc >= 25 && imc < 30)  {  
        	resultado = "Acima do peso";         
        }  
        else  if(imc >= 30)  {  
        	resultado = "Obesidade";  
        }
        
        return resultado;    
        
    }
               
}