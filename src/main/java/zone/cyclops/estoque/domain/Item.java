package zone.cyclops.estoque.domain;

public class Item {
	
	
	private Long branch;
	
	private Long item;
	
	private Long valor;

	public Long getBranch() {
		return branch;
	}

	public void setBranch(Long branch) {
		this.branch = branch;
	}

	public Long getItem() {
		return item;
	}

	public void setItem(Long item) {
		this.item = item;
	}

	public Long getValor() {
		return valor;
	}

	public void setValor(Long valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Item [branch=" + branch + ", item=" + item + ", valor=" + valor + "]";
	}
	
	

}
