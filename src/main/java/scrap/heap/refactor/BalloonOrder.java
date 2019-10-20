package scrap.heap.refactor;

public class BalloonOrder extends Order {
    private String material;
    private String number;
    
    public BalloonOrder(final String color, final String material, final String number) {
        this.color = color;
        this.material = material;
        this.number = number;
    }

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public void processOrder() {
        System.out.println("Balloons ordered; " + this.color + ", " + this.material + ", " + this.number);		
	}

}
