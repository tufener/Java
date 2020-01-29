
public class Eleve {
 private String nom;
 private int note;
 private Professeur P;
 
 public Eleve(String  nom){
	 this.nom=nom;
 }
 
 public String toString(){
	 return "La note de "+nom+" est : "+note;
 }
 
 public void setProf(Professeur P){
	 this.P= P;
 }
 
 public void notif(){
	 note= P.getNote();
	 //System.out.println(nom+" : la note a été renseignée par le professeur");
 }
}
