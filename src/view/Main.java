package view;

import br.edu.fateczl.lista.listaObj.Lista;
import br.edu.fateczl.pilhaint.*;

public class Main {

	public static void main(String[] args) {
		Lista lista = new Lista();
		int[] vet = { 3, 3, 9, 6, 9, 8, 9, 5, 7, 10, 4, 8, 10, 8 };
		try {
			lista.addFirst(1);
			lista.addLast(2);
			lista.addLast(6);
			lista.addLast(7);
			lista.addLast(8);

			int tamanhoL = lista.size();
			int tamanhoV = vet.length - 1;

			System.out.print("Lista Original: ");
			for (int i = 0; i < tamanhoL; i++) {
				System.out.print(lista.get(i) + " -> ");
			}
			System.out.print("null\n");

			for (int j = 0; j < tamanhoV; j++) {
				for (int i = 0; i < tamanhoL; i++) {
					int v = (int) lista.get(i);
					if (vet[j] == v) {
						lista.addLast(vet[j]);
					}
				}
				if (vet[j] % 2 == 0) {
					lista.add(vet[j], 2);
				} else if (vet[j] % 3 == 0) {
					lista.add(vet[j], 1);
				}
			}

			tamanhoL = lista.size();
			System.out.print("Lista Atual: ");
			for (int i = 0; i < tamanhoL; i++) {
				System.out.print(lista.get(i) + " -> ");
			}
			System.out.print("null\n");

		} catch (

		Exception e) {
			e.printStackTrace();
		}
	}

}
