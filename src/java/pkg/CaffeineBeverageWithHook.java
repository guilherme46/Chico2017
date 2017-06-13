package pkg;
 
import static java.lang.System.out;

public abstract class CaffeineBeverageWithHook {
 
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }
 
    void pourInCup() {
        out.println("Pouring into cup");
    }
 
    boolean customerWantsCondiments() {
        return true;
    }
 
    protected abstract void addCondiments();
 
    protected abstract void brew();
 
    private void boilWater() {
        out.println("Boiling water");
    }
}