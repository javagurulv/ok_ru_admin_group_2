package teacher.lesson_14_refactoring_and_dependency_injection.version8_dependency_injection.core.requests;

public class Paging {

	private Integer pageNumber;
	private Integer pageSize;

	public Paging(Integer pageNumber, Integer pageSize) {
		this.pageNumber = pageNumber;
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return pageNumber;
	}

	public Integer getPageSize() {
		return pageSize;
	}
}
