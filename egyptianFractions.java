import java.util.ArrayList;
import java.util.List;

public class EgyptianFractions { 
	
	
    static void createFractions(long nr, long dr, List<Long> items) {
        
        if (dr == 0 || nr == 0) {
            return;
        }
        
        if (dr % nr == 0) {
            items.add(dr/nr);
            return;
        }
        
        if (nr % dr == 0) {
            items.add(nr/dr);
            return;
        }
        
        if (nr > dr) {
            items.add(nr/dr);
            createFractions(nr % dr, dr, items);
            return;
        }
        
        long n = dr / nr + 1;
        items.add(n);
        
        createFractions(nr * n - dr, dr * n, items);
    }
    
    
	public List<Long> build(Long numerator, Long denominator) { 
	        
	        List<Long> ds = new ArrayList<Long>();
	        createFractions(numerator, denominator, ds);
	        return ds;
	    }
	
    public static void printResult(Long numerator, Long denominator) {
        EgyptianFractions fractions = new EgyptianFractions();
        List<Long> ds = fractions.build(numerator, denominator);
        System.out.print(numerator + "/" + denominator + " =");
        for (int i = 0; i < ds.size(); i++) {
            System.out.print(" 1/" + ds.get(i));
            if (i + 1 < ds.size())
                System.out.print(" +");
            else
                System.out.print("\n");
        }
    }
    
    
    
    public static void main(String[] args) {
    	printResult(2l, 3l);
        printResult(6l, 14l);
        printResult(12l, 13l);
    }
}
