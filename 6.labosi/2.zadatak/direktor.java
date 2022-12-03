package labosi6;

/**
 *
 * @author luka2
 */
public class Direktor extends Zaposlenik{
    @Override
    public void radi(){
        System.out.println("Odlucuje");
    }
    @Override
    public void predstaviSe(){
        super.predstaviSe();
        //PITANJE ZA PROFESORA: Kako ako ovo ukljucim ne printa duple informacije?
        //System.out.println(ID);
        //System.out.println(ime);
        //System.out.println(prezime);
    }
    
}
