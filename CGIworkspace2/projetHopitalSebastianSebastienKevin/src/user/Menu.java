package user;
import java.io.IOException;
import java.sql.SQLException;

import model.*;

public abstract class Menu {
	protected boolean run;
	protected Employe user;
	protected Menu(Employe user){
		this.user=user;
	}
	public abstract void affMenu() throws IOException, ClassNotFoundException, SQLException;
	public abstract boolean choix(int choix) throws IOException, ClassNotFoundException, SQLException;
	protected void clearConsole(){for(int i=0;i<100;i++)System.out.println("");}
}
