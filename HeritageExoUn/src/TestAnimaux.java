public class TestAnimaux {
    public static void main(String[] args){

        // Création d'un animal, un chat et un chien.
        Animal animal = new Animal();
        Chat chat = new Chat();
        Chien chien = new Chien();

        // Affichage des trois animaux (toString)
        System.out.println(animal);
        System.out.println(chat);
        System.out.println(chien);

        // Affichage des cris des animaux
        System.out.println(animal.cri());
        System.out.println(chat.cri());
        System.out.println(chien.cri());
        System.out.println(chien.aboyer());

        // On considère le chat et le chien comme étant des animaux
        Animal achat = chat;
        Animal achien = chien;

        System.out.println(achat);
        System.out.println(achien);

    }
}
