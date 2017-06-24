package jaxRs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/calculoimc")
public class CalculoImcControler {

	@GET
	@Path("/calcular")
	@Produces("application/json")
	public RetornoImc calcular(@QueryParam("altura") float altura, @QueryParam("peso") float peso) {
		
		RetornoImc retorno = new RetornoImc();
		CalculoImc calcula = new CalculoImc();
		
		try{
			
		retorno.setImc(calcula.calculaImc(altura, peso));
		retorno.setResultado(calcula.resultadoImc(retorno.getImc()));
		
		}catch(Exception e){
			retorno.setMsgErro("Erro no calculo do IMC, repita a operacao");
			return retorno;
		}
	  return retorno;
	}
}