package labosi6;


public class Test {
    
    public static void main(String[] args){
        
        Direktor d = new Direktor();
        d.setID(2);
        d.setIme("Luka");
        d.setPrezime("Aracic");
        
        
        System.out.println(d.getID());
        System.out.println(d.getIme());
        System.out.println(d.getPrezime());
        
        System.out.println("\n");
        d.radi();
        
        
        
        Tajnica t = new Tajnica();
        t.radi();
        
        
        Vozac v = new Vozac();
        v.radi();
    }
}
