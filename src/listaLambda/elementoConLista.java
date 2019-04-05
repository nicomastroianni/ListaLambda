package listaLambda;


public class elementoConLista {

	private interfazPrueba[] listaDeFunciones = {(n) ->{ return (n + 1);},(n) ->{ return (n + 2);},(n) ->{ return (n + 3);}};

	public interfazPrueba[] getListaDeFunciones() {
		return listaDeFunciones;
	}

	public void setListaDeFunciones(interfazPrueba[] listaDeFunciones) {
		this.listaDeFunciones = listaDeFunciones;
	}
	
}
