package solutions.obj_comparision;

public class Hollywood {
	
	String genre;
	String audience;
	int revenue;
	int hitMoviewCount;
	
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getAudience() {
		return audience;
	}
	public void setAudience(String audience) {
		this.audience = audience;
	}
	public int getRevenue() {
		return revenue;
	}
	public void setRevenue(int revenue) {
		this.revenue = revenue;
	}
	public int getHitMoviewCount() {
		return hitMoviewCount;
	}
	public void setHitMoviewCount(int hitMoviewCount) {
		this.hitMoviewCount = hitMoviewCount;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Hollywood [genre=").append(genre).append(", audience=")
				.append(audience).append(", revenue=").append(revenue)
				.append(", hitMoviewCount=").append(hitMoviewCount).append("]");
		return builder.toString();
	}
	
}
