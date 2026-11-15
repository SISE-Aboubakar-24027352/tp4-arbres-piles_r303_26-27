package exo1;

import java.util.ArrayList;
import java.util.List;

public class ArbreNode<T> {
	private T element;
	private ArbreNode<T> parent;
	private List<ArbreNode<T>> enfants;

	public ArbreNode(T element) {
        	this.element = element;
        	this.enfants = new ArrayList<>();
    	}

	public void ajouterenfants(ArbreNode<T> enfants){
		enfants.setParent(this);
		this.enfants.add(enfants);
	}

	public void enleverenfants(ArbreNode<T> enfants){
		enfants.setParent(this);
		this.enfants.remove(enfants);
	}

	public T getElement(){
		return element;
	}

	public ArbreNode<T> getParent(){
		return parent;
	}

	public List<ArbreNode<T>> getenfants(){
		return enfants;
	}

	public void setElement(T element){
		this.element = element;
	}

	public void setParent(ArbreNode<T> parent){
		this.parent = parent;
	}


	public boolean estRacine(){
		return this.parent == null;
	}

	public boolean estFeuille(){
		return this.enfants.isEmpty();
	}

	public void parcoursPrefixe(){
		System.out.println(this.element);
		for (ArbreNode<T> enfant : this.enfants){
			enfant.parcoursPrefixe();
		}
	}

	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		toStringPrefixe(sb, 0);
		return sb.toString();
	}

	private void toStringPrefixe(StringBuilder sb, int profondeur) {

		sb.append("  ".repeat(profondeur))
		.append(element)
		.append("\n");

		for (ArbreNode<T> enfant : enfants) {
			enfant.toStringPrefixe(sb, profondeur + 1);
		}
	}
}

