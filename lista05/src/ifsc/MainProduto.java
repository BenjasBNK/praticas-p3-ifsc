package ifsc;

import java.util.ArrayList;

public class MainProduto {
	
	public static void main(String[] args) {
		ArrayList <Produto> producao = new ArrayList<>();
		
		Produto prod0 = new Produto();	
		Produto prod1 = new Produto();
		Produto prod2 = new Produto();
			
			prod0.setNome("Mini Douglas");
			prod0.setcodbarras(6666666l);
			prod0.setFornecedor("Darcio&Marilene");
			prod0.setpreco(69000000.0);
			
			
			prod1.setNome("Mini Lezio");
			prod1.setcodbarras(88888888l);
			prod1.setFornecedor("Solange&Gilmar");
			prod1.setpreco(7.0);
			
			prod2.setNome("Mini Raico");
			prod2.setcodbarras(17171717171l);
			prod2.setFornecedor("AnaPaula&Jaison");
			prod2.setpreco(690000000.0);
			
			
		producao.add(prod0);
		producao.add(prod1);
		producao.add(prod2);
		
		for (Produto produto : producao) {
			
			System.out.println(produto.getNome());
			System.out.println(produto.getFornecedor());
			System.out.println(produto.getcodbarras());
			System.out.println(produto.getpreco());
			System.out.println("\n");
			
		}
			
			
	}


}


