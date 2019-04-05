package listaLambda;


public class elementoConLista {

	private interfazPrueba[] listaDeFunciones2 = {(n) ->{ return (n + 1);},(n) ->{ return (n + 2);},(n) ->{ return (n + 3);}};

	public interfazPrueba[] getListaDeFunciones2() {
		return listaDeFunciones2;
	}

	public void setListaDeFunciones2(interfazPrueba[] listaDeFunciones2) {
		this.listaDeFunciones2 = listaDeFunciones2;
	}
	
}
