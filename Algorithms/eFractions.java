import java.util.ArrayList;
import java.util.List;

public class Fractions {
	
	List<Long> ds = new ArrayList<Long>();
 
	public static List<Long> build(Long nr, Long dr) {
		
		List<Long> ds = new ArrayList<Long>();
       
        if (dr == 0 || nr == 0) {
            return ds;
        }
 
        
        if (dr % nr == 0) {
            ds.add(dr / nr);
            return ds;
        }
 
       
        if (nr % dr == 0) {
            ds.add(nr / dr);
            
        }
 
        
        if (nr > dr) {
            ds.add(nr / dr);
            build(nr % dr, dr);
            return ds;
        }
 
    // -------------------------
import java.util.ArrayList;
import java.util.List;

public class testing { 
    static void bld(Long numerator, Long denominator, testing fracti) {
        
        if (denominator == 0 || numerator == 0) {
            return;
        }
        
        if (denominator % numerator == 0) {
            
            items.add(denominator/numerator);
            return;
        }
        
        if (numerator % denominator == 0) {
            
            items.add(numerator/denominator);
            return;
        }
        
        if (numerator > denominator) {
            
            items.add(numerator/denominator);
            build(numerator % denominator, denominator, items);
            return;
        }
        
        long n = denominator / numerator + 1;
        
        items.add(n);
        
        build(numerator * n - denominator, denominator * n, items);
    }
    
    public static void printResult(Long numerator, Long denominator) {
        testing fractions = new testing();
        List<Long> ds = fractions.build(numerator, denominator, fractions);
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
        int nr = 6, dr = 14;
        
        List<Integer> items = new ArrayList<Integer>();
        
        build(nr, dr, items);
        
        for(int i = 0; i < items.size(); i++) {
        	System.out.println(items.get(i));
        }
    }
}
 
        
        long n = dr / nr + 1;
        ds.add(n);
 
        // Recur for remaining part
        build(nr * n - dr, dr * n);
        return ds;
    }
 
	public static void printResult(Long numerator, Long denominator) {
        EgyptianFractions fractions = new EgyptianFractions();
        List<Long> ds = fractions.build(numerator, denominator);
        System.out.print(numerator + "/" + denominator + " =");
        for (int i = 0; i < ds.size(); i++) {
            System.out.print(" 1/" + ds.get(i));
           	System.out.println();
            System.out.println(ds.size());
            if (i + 1 < ds.size())
                System.out.print(" +");
            else
                System.out.print("\n");
        }
    }

    public static void main(String[] args) {
    	
        printResult(12l, 13l);
        
    }
}
 
