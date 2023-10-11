package ifsc;

import java.util.ArrayList;

public class MainProduto {

	public static void main(String[] args) {
		Desktop pc0 = new Desktop();
		Desktop pc1 = new Desktop();
		Desktop pc2 = new Desktop();

		
		ArrayList<String> pecasPc0 = new ArrayList<>();
		pecasPc0.add("Processador:r AMD Ryzen 9 7950X3D");
		pecasPc0.add("Water Cooler NZXT Kraken Elite 280 RGB");
		pecasPc0.add("Placa Mae AsRock X670E Taichi");
		pecasPc0.add("Memoria Ram: Team Group T-Force Delta, RGB, 96GB (2x48GB), 6800MHz, DDR5,");
		pecasPc0.add("SSD M.2 NVMe:Corsair MP600 PRO NH, 8TB");
		pecasPc0.add("Placa de Video: Galax GeForce RTX 4090 Hydro, 24GB, GDDR6X");
		pecasPc0.add("Fonte: Cougar GEX1050, 1050W, Full-Modular");
		pecasPc0.add("Gabinete: Cooler Master Cosmos Infinity 30th Anniversary Edition");
		pecasPc0.add("Cooler: 3 Kit Gamer uni fan SL-IFN  120");
		pc0.setPecas(pecasPc0);
		pc0.setGamer(true);
		
		ArrayList<String> pecasPc1 = new ArrayList<>();
		pecasPc1.add("Processador:r AMD Ryzen 9 6950X");
		pecasPc1.add("Water Cooler NZXT Kraken Elite 280 RGB");
		pecasPc1.add("Placa Mae AsRock X570E Taichi");
		pecasPc1.add("Memoria Ram: Team Group T-Force Delta, RGB, 96GB (2x48GB), 6800MHz, DDR5,");
		pecasPc1.add("SSD M.2 NVMe:Corsair MP600 PRO NH, 8TB");
		pecasPc1.add("Placa de Video: Galax GeForce RTX 3090 Hydro, 24GB, GDDR6X");
		pecasPc1.add("Fonte: Cougar GEX1050, 1050W, Full-Modular");
		pecasPc1.add("Gabinete: Cooler Master Cosmos Infinity 30th Anniversary Edition");
		pecasPc1.add("Cooler: 3 Kit Gamer uni fan SL-IFN  120");
		pc1.setPecas(pecasPc1);
		pc1.setGamer(true);
		
		ArrayList<String> pecasPc2 = new ArrayList<>();
		pecasPc2.add("Processador:r AMD Ryzen 9 5950X");
		pecasPc2.add("Water Cooler NZXT Kraken Elite 280 RGB");
		pecasPc2.add("Placa Mae AsRock X470E Taichi");
		pecasPc2.add("Memoria Ram: Team Group T-Force Delta, RGB, 96GB (2x48GB), 6800MHz, DDR5,");
		pecasPc2.add("SSD M.2 NVMe:Corsair MP600 PRO NH, 8TB");
		pecasPc2.add("Placa de Video: Galax GeForce RTX 2090 Hydro, 24GB, GDDR6X");
		pecasPc2.add("Fonte: Cougar GEX1050, 1050W, Full-Modular");
		pecasPc2.add("Gabinete: Cooler Master Cosmos Infinity 30th Anniversary Edition");
		pecasPc2.add("Cooler: 3 Kit Gamer uni fan SL-IFN  120");
		pc2.setPecas(pecasPc2);
		pc2.setGamer(true);
		
		ArrayList<Desktop> Pc = new ArrayList<>();
		
		Pc.add(pc0);
		Pc.add(pc1);
		Pc.add(pc2);
		
		//---------------
		Smartphone celular01 = new Smartphone();
		Smartphone celular02 = new Smartphone();
		Smartphone celular03 = new Smartphone();
	
		celular01.setDimensoesTela("¨6.57");
		celular01.setMarca("Xioami");
		
		celular02.setDimensoesTela("6.8");
		celular02.setMarca("Samsung");
		
		celular03.setDimensoesTela("6.6");
		celular03.setMarca("Huawei");
		
		ArrayList<Smartphone> celulares = new ArrayList<>(3);
		
		celulares.add(celular01);
		celulares.add(celular02);
		celulares.add(celular03);
		
		System.out.println("Pcs Desktop");
		for (Desktop PCs : Pc) {
			System.out.println(PCs.getGamer());
			System.out.println(PCs.getPecas());
			
		
		}
		System.out.println("Celulares");
		for (Smartphone CELL : celulares) {
			System.out.println(CELL.getDimensoesTela());
			System.out.println(CELL.getMarca());
		}
		
		
		
		
	}

}
