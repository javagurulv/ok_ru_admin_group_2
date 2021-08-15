package teacher.lesson_14_refactoring_and_dependency_injection.version8_dependency_injection.core.requests;

public class Ordering {

	private String orderBy;
	private String orderDirection;

	public Ordering(String orderBy, String orderDirection) {
		this.orderBy = orderBy;
		this.orderDirection = orderDirection;
	}

	public String getOrderBy() {
		return orderBy;
	}

	public String getOrderDirection() {
		return orderDirection;
	}
}
