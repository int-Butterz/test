public class Exo1 {
	public static void main(String[] args) {
		if (args.length < 2) {
			System.out.print("Entrez votre nom complet: Prénom Nom");
			return;
		}
		
		String prenom = args[0]; String nom = args[1]; 
		System.out.println("Bonjour " + prenom + " " + nom);
	}
}