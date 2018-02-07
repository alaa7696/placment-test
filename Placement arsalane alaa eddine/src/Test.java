import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        triangle(9);
    }



    public static boolean isPalindrome(String chaine){
        char[] tab=chaine.toCharArray();
        int k=tab.length-1;
        for(int i=0;i<tab.length;i++)
            if(tab[k--]!=chaine.charAt(i))
                return false;
        return true;
    }
    public void sortIntegers(int[] tab){
        int temp;
        for(int k = 0; k< tab.length-1; k++) {
            for(int i = 0; i < tab.length-k-1; i++) {
                if(tab[ i ] > tab[ i+1] ) {
                    // here swapping of positions is being done.
                    temp = tab[ i ];
                    tab[ i ] = tab[ i+1 ];
                    tab[ i + 1] = temp;
                }
            }
        }
    }

    public static void triangle(int maxRows) {
        int r, num;
        for (int i = 0; i <= maxRows; i++) {
            num = 1;
            r = i + 1;
            for (int col = 0; col <= i; col++) {
                if (col > 0) {
                    num = num * (r - col) / col;
                }
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    /*
    5- a- 0
        b-2*n
        c-0


        7-geometrie
        a-procedural\geometry.java calculate the perimetre of a specific figure.
        b-it also calculate the perimetre of a specific figure with an oop design.
        c-4 classes
        d-
        Triangle:extends figure and override permiter method
        Circle:extends figure and override permiter method
        Geometry:contain perimeter method which creates a figure wuth respect to the name using the factory pattern
        FigureFactory: a factory pattern that create a figure
        e-the procedural because in this case it contains less code, but still it's a weak solution.
        f-the procedural solution is not a generic solution.
        g-th poo solution is much more efficient if the problem gets bigger, it's a generic solution.
        
     */


}
