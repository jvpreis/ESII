package Exemplo_ESII.Git_Maven_Jenkins;

import javax.swing.JFrame;

/**
 * Simple example for Software Engineering
 *@author José Reis
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Código para testes ES");
    	
    	pieChart();
 
    }
    
    private static void pieChart() {
        JFrame frame = new JFrame();
        frame.getContentPane().add(new MyComponent());
        frame.setSize(300, 300);
        frame.setVisible(true);
		
	}

	/**
     * Calculates the square of a number
     * @param x the incoming number
     * @return the Square of the number
     */
    public int square(int x) {
		return x * x;
	}
	
    /**
     * Compares two strings lexicographically
     * @param s1 the first string
     * @param s2 the second string
     * @return the value 0 if the s1 is equal to s2; a value less than 0 if this string is lexicographically less than the string argument; and a value greater than 0 if this string is lexicographically greater than the string argument.
     */
	public  int compString(String s1,String s2) {
		return (s1.compareTo(s2));
	}

	/**
     * Counts the number of chars "a" or "A" in a string
     * @param palavra the string
     * @return the number of "a" and "A" in the string
     */
	public int countA(String palavra) {
		int count = 0;
		for (int i = 0; i < palavra.length(); i++) {
			if (palavra.charAt(i) == 'a' || palavra.charAt(i) == 'A') {
				count++;
			}			
			
			if (count > 20)
				count = 100;
			else
				count = count;
		}
		return count;
	}
}
