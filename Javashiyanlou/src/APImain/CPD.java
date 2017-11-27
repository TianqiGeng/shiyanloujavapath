package APImain;

import java.util.HashSet;
import java.util.Set;

public class CPD {
	public String id;
	public String name;

	public Set<CStudent> students;

	public CPD(String id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.students = new HashSet<CStudent>();
	}
	
}
