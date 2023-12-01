package travail_a_faire;
import java.util.Objects;

public class Machine implements Cloneable, Comparable<Machine> {
	private int code_machine;
	private String nom;
	private String Adress_IP;
	private boolean Portabilite;
	private String Generation;
	private String Marque;
	
	public Machine( int code_machine, String nom, String adress_IP, boolean portabilite, String generation, String marque) {
		super();
		this.code_machine=code_machine;
		this.nom = nom;
		Adress_IP = adress_IP;
		Portabilite = portabilite;
		Generation = generation;
		Marque = marque;
	}

	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		Machine other = (Machine) obj ;
		return Objects.equals(other.code_machine,this.code_machine);
	}

	@Override
	public Machine clone() {
		try {
			return (Machine) super.clone();
		}
		catch(CloneNotSupportedException e){
			System.out.println("Erreur  clonage");
			return null;
			
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdress_IP() {
		return Adress_IP;
	}

	public void setAdress_IP(String adress_IP) {
		Adress_IP = adress_IP;
	}

	public boolean isPortabilite() {
		return Portabilite;
	}

	public void setPortabilite(boolean portabilite) {
		Portabilite = portabilite;
	}

	public String getGeneration() {
		return Generation;
	}

	public void setGeneration(String generation) {
		Generation = generation;
	}

	public String getMarque() {
		return Marque;
	}

	public void setMarque(String marque) {
		Marque = marque;
	}
	
	@Override
	public int compareTo(Machine obj) {
		return Float.compare(this.code_machine, obj.code_machine);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	

}
