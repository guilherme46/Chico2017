package pkg;
 
import static java.lang.System.out;

public class BeverageTestDrive {
 
    public static void main(String[] args) {
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
 
        out.println("Making coffee");
        coffeeWithHook.prepareRecipe();
    }
}