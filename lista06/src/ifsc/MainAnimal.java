package ifsc;

public class MainAnimal {

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		
		gato.setRaca("American Shorthair");
		gato.setCor("Mista Shaded");
		gato.setNome("Gato");
		gato.setEcossistema("Minha Casa");
		gato.setComprimento(60);
		gato.setNumPatas(4);
		
		Cachorro dog = new Cachorro();
		
		
		
		dog.setRaca("Pinscher");
		dog.setCor("preta");
		dog.setNome("Ladislau");
		dog.setEcossistema("Minha Casa");
		dog.setComprimento(30);
		dog.setNumPatas(4);
		System.out.println(gato.getRaca());
		System.out.println(gato.getCor());
		System.out.println(gato.getNome());
		System.out.println(gato.getEcossistema());
		System.out.println(gato.getComprimento());
		System.out.println(gato.getNumPatas());
		 gato.mia();
		
		System.out.println("\n");
		System.out.println(dog.getRaca());
		System.out.println(dog.getCor());
		System.out.println(dog.getNome());
		System.out.println(dog.getEcossistema());
		System.out.println(dog.getComprimento());
		System.out.println(dog.getNumPatas());
		
		dog.late();
		
	}

}
