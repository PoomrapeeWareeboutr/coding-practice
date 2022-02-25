
public class RectangleInGrid {

    public static void main(String[] args) {
        Integer width = 30;
        Integer height = 10;
        
        Integer x_1 = 3;
        Integer y_1 = 3;
        Integer x_2 = 15;
        Integer y_2 = 10;
        
        System.out.println("# test_case: ");
        
        Integer h = 1;
        while(h <= height) {
            Integer w = 1;
            while(w <= width) {
                if(h == y_1 || h == y_2) {
                    if(w >= x_1 && w <= x_2) {
                        System.out.print("#");
                    } else {
                        System.out.print(".");
                    }
                } else if(h > y_1 && h < y_2) {
                    if(w == x_1 || w == x_2) {
                        System.out.print("#");
                    } else {
                        System.out.print(".");
                    }
                } else {
                    System.out.print(".");
                }
                w++;
            }
            System.out.println();
            h++;
        }
    }    
}
