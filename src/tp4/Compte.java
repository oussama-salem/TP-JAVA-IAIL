package tp4;

public class Compte {
	protected String numero ;
	protected String titulaire ;
	protected double solde ;
	
    public Compte(String numero, String titulaire, double solde) {
        this.numero = numero;
        this.titulaire = titulaire;
        this.solde = solde ;
    }

	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTitulaire() {
		return this.titulaire;
	}

	public void setTitulaire(String titulaire) {
		this.titulaire = titulaire;
	}

	public double getSolde() {
		return this.solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}
	public void  deposer(double montant) {
		if(montant > 0) {
			this.solde = this.solde + montant ;
		}else {
			System.out.println("impossible de deposer");
	}
	}
	public void retirer(double montant) {
		if (this.solde >= montant) {
			this.solde = this.solde - montant ;
		}else {
			System.out.println("solde no suffisant");
		}
		
	}
	public void afficher() {
		System.out.println("numero : " + this.numero + "  titulaire : " + this.titulaire + "  solde :   " + this.solde  );
	}
	
}