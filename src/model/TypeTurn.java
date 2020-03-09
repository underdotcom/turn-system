package model;

public class TypeTurn implements Comparable<TypeTurn>{

	private float duration;
	private String type;
	
	public TypeTurn(float du, String ty) {
		duration = du;
		type = ty;
	}

	public float getDuration() {
		return duration;
	}

	public String getType() {
		return type;
	}

	@Override
	public int compareTo(TypeTurn t2) {
		return type.compareTo(t2.getType());
	}
}
