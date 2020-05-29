package personne;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Classe définissant un jeu d'essai pour tester la classe Profil
 *
 * @author Marc Baribaud
 * @version 0.01
 */
@DisplayName("Tests de la classe Profil")
class ProfilTest {

    private static Profil profil = new Profil();
    private static int DEFAULT_ID = 1;
    private static String DEFAULT_CODE = "DIR";
    private static String DEFAULT_LABEL = "Directeur";

    @BeforeEach // Avant chaque test : exécute ce qui suit
    void initProfil() {
        profil.setId(DEFAULT_ID);
        profil.setCode(DEFAULT_CODE);
        profil.setLibelle(DEFAULT_LABEL);
    }

    @DisplayName("Vérification de la méthode Profil.getId()")
    @Test
    void TestGetId() {
        assertEquals(DEFAULT_ID, profil.getId());
    }

    @DisplayName("Vérification de la méthode Profil.getCode()")
    @Test
    void TestGetCode() {
        assertEquals(DEFAULT_CODE, profil.getCode());
    }

    @DisplayName("Vérification de la méthode Profil.getLibelle()")
    @Test
    void TestGetLibelle() {
        assertEquals(DEFAULT_LABEL, profil.getLibelle());
    }

    @DisplayName("Vérification de la méthode Profil.setId()")
    @Test
    void TestSetId() {
        int expectedValue = 123;
        profil.setId(expectedValue);
        assertEquals(expectedValue, profil.getId());
    }

    @DisplayName("Vérification de la méthode Profil.setCode()")
    @Test
    void TestSetCode() {
        String expectedValue = "EMP";
        profil.setCode(expectedValue);
        assertEquals(expectedValue, profil.getCode());
    }

    @DisplayName("Vérification de la méthode Profil.setLibelle()")
    @Test
    void TestSetLibelle() {
        String expectedValue = "Employé";
        profil.setLibelle(expectedValue);
        assertEquals(expectedValue, profil.getLibelle());
    }
}