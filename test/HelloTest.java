import junit.framework.TestCase;

public class HelloTest extends TestCase {

    public void testGetHelloNavn() {
String resultat;
resultat = Hello.getHelloNavn("Laila");
assertEquals("Hello Laila", resultat);

resultat = Hello.getHelloNavn("");
assertEquals("Hello", resultat);

resultat = Hello.getHelloNavn("  Benjamin ");
assertEquals("Hello Benjamin", resultat);

resultat = Hello.getHelloNavn("René");
assertEquals("Hello René", resultat);

resultat = Hello.getHelloNavn("7");
assertEquals("Hello 7", resultat);

resultat = Hello.getHelloNavn("sout");
assertEquals("Hello sout", resultat);

    }
}