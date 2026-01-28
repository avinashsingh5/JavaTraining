
/*
Quantifier {n} → exactly n times
Quantifier {m,n} → range (between m and n times)
Alternation | → OR operator
\\d → digit (0–9)        
    + → one or more     
    * → zero or more (must be digit allows empty)
    [A-Z] → uppercase letters only
    [A-Z]* → zero or more uppercase letters
    [a-z] → lowercase letters only
    [a-z]* → zero or more lowercase letters
    (abc)+ → "abc" repeated one or more times
    (abc)* → zero or more repetitions
    ^ and $ → Anchors (start & end)
    ? → zero or one (optional)
    \\w → word characters  \\w = [A-Za-z0-9_]
    \\s → whitespace (space, tab, newline)
    \\s* → zero or more spaces
    Exact length using {n}
    . (dot) Matches any single character except a newline (\n).


*/
public class StringMatching1{
    public static void main(String[] args) {
        // System.out.println("aaa".matches("a{3}"));
		// System.out.println("aa".matches("a{3}"));
		// System.out.println("aaaa".matches("a{3}"));
		
		// System.out.println();
		
		// System.out.println("aaa".matches("a{2,4}"));
		// System.out.println("aa".matches("a{2,4}"));
		// System.out.println("aaaa".matches("a{2,4}"));
		// System.out.println("a".matches("a{2,4}"));
		// System.out.println("aaaaa".matches("a{2,4}"));
		
		// System.out.println();
		
		// System.out.println("cat".matches("cat|dog"));
		// System.out.println("dog".matches("cat|dog"));
		// System.out.println("cow".matches("cat|dog"));

        // System.out.println();

        // System.out.println("123".matches("\\d+")); 
		// System.out.println("9".matches("\\d+"));   
		// System.out.println("".matches("\\d+"));    
		
		// System.out.println("".matches("\\d*"));    
		// System.out.println("123".matches("\\d*")); 
		// System.out.println("a12".matches("\\d*")); 
		
		// System.out.println("ABC".matches("[A-Z]+"));
		// System.out.println("A".matches("[A-Z]+"));   
		// System.out.println("AbC".matches("[A-Z]+")); 
		
		// System.out.println("".matches("[A-Z]*"));    
		// System.out.println("XYZ".matches("[A-Z]*")); 
		// System.out.println("XyZ".matches("[A-Z]*")); 
		
		// System.out.println("abc".matches("[a-z]+")); 
		// System.out.println("a".matches("[a-z]+"));   
		// System.out.println("aBc".matches("[a-z]+")); 
		
		// System.out.println("".matches("[a-z]*"));    
		// System.out.println("xyz".matches("[a-z]*")); 
		// System.out.println("xYz".matches("[a-z]*")); 
		
		// System.out.println("abcabc".matches("(abc)+")); 
		// System.out.println("abc".matches("(abc)+"));   
		// System.out.println("ababc".matches("(abc)+"));  
		
		// System.out.println("".matches("(abc)*")); 


		// System.out.println("A_B9".matches("\\w+"));

    // Write a regular expression to validate a mobile number with the following rules:
	// Must start with 6, 7, 8, or 9
	// Must contain exactly 10 digits

    System.out.println("7234567890".matches("^[6-9]\\d{9}$"));

    }
}