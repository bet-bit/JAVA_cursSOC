package springMVC;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import springMVC.validation.ValidarDni;

public class Alumne {
	
	@NotNull
	@Size(min = 3,message = "Cal introduir un nom de com a mínim 3 lletres")
	private String nom;

	@ValidarDni
	private String dni;



	@Pattern(regexp="^(.+)@(.+)$",message="Correu incorrectee")
	private String email;
	
	private Map<String, String> llistaBeques;
	private Map<String, String> llistaAssignatures;

	private String beca;
	private String[] assignatures;

//	GETTERS AND SETTERS:
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
		
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Map<String, String> getLlistaBeques() {
		return llistaBeques;
	}
	public void setLlistaBeques(Map<String, String> llistaBeques) {
		this.llistaBeques = llistaBeques;
	}
	public Map<String, String> getLlistaAssignatures() {
		return llistaAssignatures;
	}
	public void setLlistaAssignatures(Map<String, String> llistaAssignatures) {
		this.llistaAssignatures = llistaAssignatures;
	}
	public String getBeca() {
		return beca;
	}
	public void setBeca(String beca) {
		this.beca = beca;
	}
	public String[] getAssignatures() {
		return assignatures;
	}
	public void setAssignatures(String[] assignatures) {
		this.assignatures = assignatures;
	}
	
//	CONSTRUCTOR

	public Alumne() {
		super();
		llistaBeques = new LinkedHashMap<String, String>();
		llistaBeques.put("S", "Sí");
		llistaBeques.put("N", "No");
		
		llistaAssignatures = new LinkedHashMap<String, String>();
		llistaAssignatures.put("PHP", "PHP");
		llistaAssignatures.put("JAVA", "JAVA");
		llistaAssignatures.put("JS", "JS");
		llistaAssignatures.put(".NET", ".NET");


	}
	
}
