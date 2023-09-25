package solutions.obj_comparision;


public class Mango {

	int id;
	String name;
	String color;
	String taste;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	
	
	
	@Override
	public boolean equals(Object callingObject) {
		Mango callingObj;
		if (callingObject instanceof Mango) {
			callingObj = (Mango) callingObject;
		} else {
			return false;
		}
		
		
		boolean result = false;
		if (verifyData(callingObj)) {
			result = true;
		}
		return result;
	}

	/**
	 *  'this' will represent expected obj
	 *  
	 *  Incase double digits come and we want to make sure 1,234.00 is same as 1234.0 
	 *  Double.toString(Double.parseDouble(actual.getAmount().replace(",", "")))
	 */
	public boolean verifyData(Mango callingObj) {
		return callingObj.getId() == this.getId()
			&& callingObj.getName().equals(this.getName())
			&& callingObj.getColor().equals(this.getColor())
			&& callingObj.getTaste().equals(this.getTaste());
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MangoClass [id=").append(id).append(", name=")
				.append(name).append(", color=").append(color)
				.append(", taste=").append(taste).append("]");
		return builder.toString();
	}
	
}
