package controller;

import java.util.ArrayList;

import model.ItemCompra;

public class ListaDeCompras {

	ArrayList listaCompras = new ArrayList();
	
	public boolean insereItem(String nomeProd, int qtd) {
		
		ItemCompra itemAdd = new ItemCompra(nomeProd, qtd); 
		
		listaCompras.add(itemAdd);
		
		return listaCompras.contains(itemAdd);
	}
	
	public boolean removeItemPorNome(String nomeProduto) {
        for (int i = 0; i < listaCompras.size(); i++) {
            ItemCompra item = (ItemCompra) listaCompras.get(i);
            if (item.getNomeProduto().equalsIgnoreCase(nomeProduto)) {
                listaCompras.remove(i);
                return true;
            }
        }
        return false;
    }
	
	public ItemCompra exibeItemPorNome(String nomePoduto) {
		
		for (int i = 0; i < listaCompras.size(); i++) {
			ItemCompra item = (ItemCompra) listaCompras.get(i);
			if (item.getNomeProduto().equalsIgnoreCase(nomePoduto)) {
				return item;
			}
		}
		return null;
	}
	
	public String exibirLista() {
        if (listaCompras.isEmpty()) {
            return "A lista está vazia.";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < listaCompras.size(); i++) {
            ItemCompra item = (ItemCompra) listaCompras.get(i); 
            sb.append("\nItem #").append(i + 1).append(":").append(item.toString());
        }
        return sb.toString();
    }
	
}
