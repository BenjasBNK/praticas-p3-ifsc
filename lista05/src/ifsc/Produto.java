package ifsc;

public class Produto {
	
	private String nome;
	private long codbarras;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getcodbarras() {
		return codbarras;
	}
	public void setcodbarras(long codbarras) {
		this.codbarras = codbarras;
	}	
	//-----------	
	
	private String fornecedor;
	private Double preco;
	
	
	public String getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
	public Double getpreco() {
		return preco;
	}
	public void setpreco(Double preco) {
		this.preco = preco;
	}
	
}
