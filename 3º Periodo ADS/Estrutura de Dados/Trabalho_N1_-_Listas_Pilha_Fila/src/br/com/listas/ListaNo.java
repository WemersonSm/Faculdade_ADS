package br.com.listas;

public class ListaNo {
	Object data;
	ListaNo proximoNo;

	ListaNo(Object object) {
		this(object, null);
	}

	ListaNo(Object object, ListaNo node) {
		data = object;
		proximoNo = node;
	}

	public void setData(Object data) {
		this.data = data;
	}

	Object getData() {
		return data;
	}

	ListaNo getProximoNo() {
		return proximoNo;
	}

	public void setProximoNo(ListaNo novo) {
		this.proximoNo = novo;
	}
}
