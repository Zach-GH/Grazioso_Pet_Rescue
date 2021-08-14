/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monkeyRegistration;

/**
 *
 * @author Zachary Meisner
 */

public class Monkey extends RescueAnimal {

	// Instance Variables
	private String tailLength;
	private String height;
	private String bodyLength;
	private String species;

	// Add public enum of monkey species
	public enum Species {
		Capuchin, Geunon, Macaque, Marmoset, SquirrelMonkey, Tamarin;
	}
	//New Constructor
	public Monkey(String name, String species, String gender, String age, String weight, String acquisitionDate,
			String acquisitionCountry, String trainingStatus, boolean reserved, String inServiceCountry,
			String tailLength, String height, String bodyLength) {
		setName(name);
		setSpecies(species);
		setGender(gender);
		setAge(age);
		setWeight(weight);
		setAcquisitionDate(acquisitionDate);
		setAcquisitionLocation(acquisitionCountry);
		setTrainingStatus(trainingStatus);
		setReserved(reserved);
		setInServiceCountry(inServiceCountry);
		setTailLength(tailLength);
		setHeight(height);
		setBodyLength(bodyLength);
	}

	// Accessors and Mutators Getters and Setters
	public String getTailLength() {
		return tailLength;
	}

	public void setTailLength(String tailLength) {
		this.tailLength = tailLength;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getBodyLenth() {
		return bodyLength;
	}

	public void setBodyLength(String bodyLength) {
		this.bodyLength = bodyLength;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}
}
