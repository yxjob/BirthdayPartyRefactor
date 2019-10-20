package scrap.heap.refactor;

public class CakeOrder extends Order {
    private String flavor;
    private String frostingFlavor;
    private String shape;
    private String size;
    
    public CakeOrder(final String flavor, final String frostingFlavor, final String shape, final String size, final String color) {
        this.flavor = flavor;
        this.frostingFlavor = frostingFlavor;
        this.shape = shape;
        this.size = size;
        this.color = color;
    }
    
	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public String getFrostingFlavor() {
		return frostingFlavor;
	}

	public void setFrostingFlavor(String frostingFlavor) {
		this.frostingFlavor = frostingFlavor;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public void processOrder() {
        System.out.println("Cake ordered; " + this.flavor + ", " + this.frostingFlavor + ", " + this.shape + ", " + this.size + ", " + this.color);
	}

}
