package travail_a_faire;

import java.util.Arrays;

public class Telephone {
	private Machine[] machines= new Machine[5];
	

   
   
    public Telephone() {
    	machines[0]=new Machine(null, null, false, null, null);
    	machines[1]=new Machine(null, null, false, null, null);
    	machines[2]=new Machine(null, null, false, null, null);
    	machines[3]=new Machine(null, null, false, null, null);
    	machines[4]=new Machine(null, null, false, null, null);

    }
    
    public void trierMachines() {
        Arrays.sort(machines);
    }
   
    
    public void ajouterMachineAvecNouvelleTaille(Machine nouvelleMachine) {
        int nouvelleTaille =machines.length + 1;
        Machine[] nouveauTableau = Arrays.copyOf(machines, nouvelleTaille);
        nouveauTableau[nouvelleTaille - 1] = nouvelleMachine;

        machines = nouveauTableau;
        
    }
    public void supprimerMachine(int index) {
        if (index >= 0 && index < nbrmachine) {
            for (int i = index; i < nbrmachine - 1; i++) {
                machines[i] = machines[i + 1];
            }
            machines[nbrmachine - 1] = null;
            nbrmachine--;
        } else {
            System.out.println("Index invalide. Impossible de supprimer la machine.");
        }
    }
    public int nombreDeMachines() {
        return machines.length;
    }
    public void inverserOrdreMachines() {
        int debut = 0;
        int fin = nbrmachine - 1;

        while (debut < fin) {
            Machine temp = machines[debut];
            machines[debut] = machines[fin];
            machines[fin] = temp;
            debut++;
            fin--;
        }
    }
   
}
