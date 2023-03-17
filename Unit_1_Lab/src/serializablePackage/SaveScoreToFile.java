package serializablePackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Player implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int goals;
	
	Player(String name, int goals){
		this.name = name;
		this.goals = goals;
	}
	
	public String toString() {
		return  name+ " scored "+ goals+ " goals";
	}
}

public class SaveScoreToFile {

	public static void main(String[] args) {
		Player p1 = new Player("Haaland", 5);

		File file = new File("PlayersFile.txt");
		
		try {
			FileOutputStream f = new FileOutputStream(file);
			ObjectOutputStream o = new ObjectOutputStream(f);
			
			
			o.writeObject(p1);
			o.close();
			f.close();
			
			
			FileInputStream fi = new FileInputStream(file);
			ObjectInputStream oi = new ObjectInputStream(fi);
			
			
			Player pl = (Player)oi.readObject();
			
			System.out.println(pl.toString());
			o.close();
			f.close();
			

		}catch(Exception ex) {
			System.out.println("Saving and Reading Failed");
		}
		
		

	}

}
