package fr.dauphine.ja.leclercthomas.td00;
import java.util.*;

/**
 * Hello world!
 *
 */
public class PrimeCollection 
{
    
    private static ArrayList<Integer> numbers = new ArrayList<>();

    // Constructeur par défaut
    public PrimeCollection() {
        
    }
    
    // Méthode qui permet d'insérer n entiers entre 0 et m dans la collection numbers
    public static void initRandom(int n, int m){
        for(int i = 0 ; i < n ; i++){
            Random rand = new Random(); 
            int valeur = rand.nextInt(m);
            numbers.add(valeur);
        }
    }
    
    private static boolean isPrime(int p){
        int reste;
        boolean test = true;
        
        if(p==0) return false;
        if(p==1) return false;
        
        for(int i=2; i <= p/2; i++){
            reste = p%i;
            if(reste == 0){
                test = false;
                break;
            }
        }

        if(test) return true;
        else return false;
    }
    
    public static void printPrimes(){
        for (int i = 0 ; i < numbers.size() ; i++) {
            if(isPrime(numbers.get(i))==true){
                System.out.println(numbers.get(i));
            }
        }
    }    
    
    public static void main( String[] args )
    {
        System.out.println( "Hello World! Version 3" );
        
        initRandom(100,1000);
        printPrimes();
        
        
    }
}
