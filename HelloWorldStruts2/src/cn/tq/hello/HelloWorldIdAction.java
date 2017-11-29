package cn.tq.hello;

public class HelloWorldIdAction {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String execute() throws Exception{
		System.out.print("ddddddddddd");
		if(getName().equals("")|getName()==null) {
			return "error";
		}
		return "success";
	}
	
}
