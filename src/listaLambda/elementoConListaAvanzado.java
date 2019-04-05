package listaLambda;

public class elementoConListaAvanzado {
	
	private interfazPrueba[] listaDeFunciones ={(n) ->funcionesPrueba.funcionPrueba1(n),(n) ->funcionesPrueba.funcionPrueba2(n),(n) ->funcionesPrueba.funcionPrueba3(n)};

	public interfazPrueba[] getListaDeFunciones() {
		return listaDeFunciones;
	}

	public void setListaDeFunciones(interfazPrueba[] listaDeFunciones) {
		this.listaDeFunciones = listaDeFunciones;
	}

}
