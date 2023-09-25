package solutions.obj_comparision;

public class Bollywood {
	
	String genre;
	String audience;
	int revenue;
	int hitMoviewCount;
	String topActor; // extra fields
	
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

	public String getTopActor() {
		return topActor;
	}

	public void setTopActor(String topActor) {
		this.topActor = topActor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bollywood [genre=").append(genre).append(", audience=")
				.append(audience).append(", revenue=").append(revenue)
				.append(", hitMoviewCount=").append(hitMoviewCount)
				.append(", topActor=").append(topActor).append("]");
		return builder.toString();
	}
	
	
	
}
