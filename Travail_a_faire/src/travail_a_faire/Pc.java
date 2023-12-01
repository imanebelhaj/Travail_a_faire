//hafssi youssef
package travail_a_faire;

public class Pc extends Machine {
	private String Cpu;
	private String Taille_ram;
	private String Taille_ecran;
	private boolean isLaptop;
    private boolean isDesktop;
    private boolean IsGaming;
    
	public Pc(int code_machine, String nom, String adress_IP, boolean portabilite, String generation, String marque, String cpu,
			String taille_ram, String taille_ecran, boolean isLaptop, boolean isDesktop, boolean isGaming) {
		super(code_machine, nom, adress_IP, portabilite, generation, marque);
		Cpu = cpu;
		Taille_ram = taille_ram;
		Taille_ecran = taille_ecran;
		this.isLaptop = isLaptop;
		this.isDesktop = isDesktop;
		IsGaming = isGaming;
	}

	public String getCpu() {
		return Cpu;
	}

	public void setCpu(String cpu) {
		Cpu = cpu;
	}

	public String getTaille_ram() {
		return Taille_ram;
	}

	public void setTaille_ram(String taille_ram) {
		Taille_ram = taille_ram;
	}

	public String getTaille_ecran() {
		return Taille_ecran;
	}

	public void setTaille_ecran(String taille_ecran) {
		Taille_ecran = taille_ecran;
	}

	public boolean isLaptop() {
		return isLaptop;
	}

	public void setLaptop(boolean isLaptop) {
		this.isLaptop = isLaptop;
	}

	public boolean isDesktop() {
		return isDesktop;
	}

	public void setDesktop(boolean isDesktop) {
		this.isDesktop = isDesktop;
	}

	public boolean isIsGaming() {
		return IsGaming;
	}

	public void setIsGaming(boolean isGaming) {
		IsGaming = isGaming;
	}

	@Override
	public boolean equals(Object obj) {
		
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
   

}

