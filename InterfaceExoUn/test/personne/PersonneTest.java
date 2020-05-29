package personne;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Classe définissant un jeu d'essai pour tester la classe Personne
 *
 * @author Marc Baribaud
 * @version 0.01
 */
@DisplayName("Tests de la classe Personne")
public class PersonneTest {

    private static Personne personne = new Personne();
    private static int DEFAULT_ID = 1;

    @BeforeEach // Avant chaque test : exécute ce qui suit
    void initPersonne() {
        personne.setId(DEFAULT_ID);
//        personne.setCode(DEFAULT_CODE);
//        personne.setLibelle(DEFAULT_LABEL);
    }

    @DisplayName("Vérification de la méthode Personne.getId()")
    @Test
    void TestGetId() {
        assertEquals(DEFAULT_ID, personne.getId());
    }
}
