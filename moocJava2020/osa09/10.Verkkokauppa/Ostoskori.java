
import java.util.HashMap;
import java.util.Map;



/**
 *
 * @author lnxbusdrvr
 */
public class Ostoskori {
    
    private Map<String, Ostos> ostoskori;

    public Ostoskori() {
        this.ostoskori = new HashMap<>();
    }
    
    public void lisaa(String tuote, int hinta) {
        // lisää ostoskoriin ostoksen joka vastaa 
        // parametrina olevaa tuotetta ja jolla on 
        // parametrina annettu hinta.
        this.ostoskori.put(tuote, new Ostos(tuote, 1, hinta));
    }
    
    public int hinta() {
        // palauttaa ostoskorin kokonaishinnan
        int summa = 0;
        for(Ostos tuote : this.ostoskori.values()) {
            summa += tuote.hinta();
        }
        return summa;
    }
    
    
    
}
