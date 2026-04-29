import java.sql.SQLOutput;

public class RectangleRunner{
    public RectangleRunner(){}

    public static void main(String[] src ){

        Rectangle var1 = new Rectangle(28,23);
        System.out.println("Area of rect 1 : " + var1.area());
       
        System.out.println("Area of perimeter 2 : " + var1.parimeter());

        Rectangle var2 = new Rectangle(224,3);
        System.out.println("Area of rect 2 : "+ var2.area());
        System.out.println("parimeter of rect 2 : "+ var2.parimeter());


    }
        }