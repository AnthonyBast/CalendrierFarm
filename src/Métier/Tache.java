package Métier;

public class Tache {
	private int idTache;
	private String libelle;
	private String description;
	private int dureeMin;
	private Objet objet;
	
	public Tache(){
		this.idTache = 0;
		this.libelle = "";
		this.description = "";
		this.dureeMin = 0;
		this.objet = new Objet();
	}
	
	public Tache(int idTache, String libelle, String description, int dureeMin, Objet objet){
		this.idTache = idTache;
		this.libelle = libelle;
		this.description = description;
		this.dureeMin = dureeMin;
		this.objet = objet;
	}
	
	public int getIdTache() {
		return idTache;
	}
	public void setIdTache(int idTache) {
		this.idTache = idTache;
	}	
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getDureeMin() {
		return dureeMin;
	}
	public void setDureeMin(int dureeMin) {
		this.dureeMin = dureeMin;
	}
	public Objet getObjet() {
		return objet;
	}
	public void setObjet(Objet objet) {
		this.objet = objet;
	}
}
