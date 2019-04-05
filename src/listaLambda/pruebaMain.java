package listaLambda;


public class pruebaMain {

	public static void main(String[] args) {

		int a =5;
		int contenedor = 0;
		elementoConLista unElemento = new elementoConLista();	
		
		for(int i=0;i<unElemento.getListaDeFunciones().length;i++) {
			interfazPrueba unMetodo=  unElemento.getListaDeFunciones()[i];
			contenedor += unMetodo.funcionAuxiliar(a);
		}
		System.out.println(contenedor);
	}

}
