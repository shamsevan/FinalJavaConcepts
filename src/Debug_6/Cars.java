package Debug_6;

public class Cars {
	String Owner;
	String Name;
	int Model;
	
	
	//setting Name from other Class 	
		public void setName(String newName) {
			Name=newName;
		}
		
		//Getting Name From Other Class 	
		public String getName() {
			return Name;
		}
		
		
		//Setting Model from Other class
		public void setModel(int NewModel) {
			Model=NewModel;
		}
		
	//get model from other Class :
		public int getModel() {
			return  Model;
		}
		
		//Constructor For Owner Name :
		public Cars(String newOwner) {
			Owner=newOwner;
		}
	

}
