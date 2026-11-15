package exo1;

public class Main {

    public static void main(String[] args) {

        // Création de la racine
        ArbreNode<String> html = new ArbreNode<>("html");

        // Création des éléments head et body
        ArbreNode<String> head = new ArbreNode<>("head");
        ArbreNode<String> body = new ArbreNode<>("body");

        // Création des éléments du head
        ArbreNode<String> title = new ArbreNode<>("title");
        ArbreNode<String> texteTitle = new ArbreNode<>("Page test");

        // Création des éléments du body
        ArbreNode<String> h1 = new ArbreNode<>("h1");
        ArbreNode<String> texteH1 = new ArbreNode<>("Titre niveau 1");

        ArbreNode<String> p = new ArbreNode<>("p");
        ArbreNode<String> texteP = new ArbreNode<>("Ceci est un paragraphe");

        // Construction de l'arbre
        html.ajouterEnfant(head);
        html.ajouterEnfant(body);

        head.ajouterEnfant(title);
        title.ajouterEnfant(texteTitle);

        body.ajouterEnfant(h1);
        body.ajouterEnfant(p);

        h1.ajouterEnfant(texteH1);
        p.ajouterEnfant(texteP);

        // Vérification du parcours préfixé
        System.out.println("Parcours prefixe :");
        html.parcoursPrefixe();

        // Affichage de l'arbre
        System.out.println("\nRepresentation de l'arbre :");
        System.out.println(html);
    }
}
