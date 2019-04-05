package listaLambda;

public class pruebaMainAvanzado {

	public static void main(String[] args) {

		int a =1;
		int contenedor = 0;
		elementoConListaAvanzado unElemento = new elementoConListaAvanzado();	
		
		for(int i=0;i<unElemento.getListaDeFunciones().length;i++) {
			interfazPrueba unMetodo=  unElemento.getListaDeFunciones()[i];
			contenedor += unMetodo.funcionAuxiliar(a);
		}
		System.out.println(contenedor);
	}

}
