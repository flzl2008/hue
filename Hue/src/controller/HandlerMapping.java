package controller;

public class HandlerMapping {
	private static HandlerMapping instance = new HandlerMapping();
	private HandlerMapping() {}
	
	public static HandlerMapping getInstance() {
		return instance;
	}
	
	public Controller create(String command) {
		Controller c = null;
		
		if(command.equals("update_user")){
			c=new UpdateUserController();
		}else if(command.equals("")) {
			
		}
		
		return c;
	}
}
