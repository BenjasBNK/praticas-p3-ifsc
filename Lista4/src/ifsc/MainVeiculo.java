package ifsc;

import java.util.ArrayList;

public class MainVeiculo {

	public static void main(String[] args) {
	
		ArrayList<Veiculo> carros = new ArrayList<>(3);

		
		Veiculo carro = new Veiculo();
		
		carro.setNome("Impreza");
		carro.setFabricante("Subaro");
		carro.setCor("Azul");
		carro.setAno(2008);
		carro.setNumRodas(4);

		Veiculo carro1 = new Veiculo();
		
		carro1.setNome("Reliant Robin");
		carro1.setFabricante("Reliant Motor Company");
		carro1.setCor("Azul Esverdeado");
		carro1.setAno(1973);
		carro1.setNumRodas(3);
		
		Veiculo carro2 = new Veiculo();
		
		carro2.setNome("Brasilia");
		carro2.setFabricante("volkswagen");
		carro2.setCor("Amarela");
		carro2.setAno(1973);
		carro2.setNumRodas(4);
		
		
		carros.add(carro);
		carros.add(carro1);
		carros.add(carro2);
		
		for (Veiculo veiculo : carros) {
		
			System.out.println(veiculo.getNome());
			System.out.println(veiculo.getFabricante());
			System.out.println(veiculo.getCor());
			System.out.println(veiculo.getAno());
			System.out.println(veiculo.getNumRodas());
			System.out.println("\n");
		}
	}

}
