/*
 * @author Nida Başer
 * February 2024
 */
public class Main
{
	public static void main(String[] args) {

      // 1'den 10'a çarpım tablosu
	    for(int i = 1; i <= 10; i++) {    
	        for(int j = 1; j <= 10; j++) {        
	            System.out.printf("%d * %d = %d", i, j, i*j);        
	            System.out.println();
	        }
	        System.out.println();
	    }
	}
}
