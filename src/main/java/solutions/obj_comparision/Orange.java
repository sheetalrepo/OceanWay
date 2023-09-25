package solutions.obj_comparision;

public class Orange {

	String id;
	String name;
	String color;
	String taste;
	String state; // new fields than Mango
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Orange [id=").append(id).append(", name=")
				.append(name).append(", color=").append(color)
				.append(", taste=").append(taste).append(", state=")
				.append(state).append("]");
		return builder.toString();
	}

}
