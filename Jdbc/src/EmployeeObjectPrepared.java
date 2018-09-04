
/**
 * @author rohith
 *
 */
public class EmployeeObjectPrepared {
	
	private int e_id;
	private String e_name;
	private String  e_add;
	public int getE_id() {
		return e_id;
	}
	public void setE_id(int e_id) {
		this.e_id = e_id;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public String getE_add() {
		return e_add;
	}
	public void setE_add(String e_add) {
		this.e_add = e_add;
	}
	@Override
	public String toString() {
		return "EmployeeObjectPrepared [e_id=" + e_id + ", e_name=" + e_name + ", e_add=" + e_add + "]";
	}

}
