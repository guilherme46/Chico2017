package pkg;
 

public abstract class CaffeineBeverageWithHook {
 
    final String prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
        return null;
    }
 
    String pourInCup() {
        return ("Pouring into cup");
    }
 
    boolean customerWantsCondiments() {
        return true;
    }
 
    protected abstract String addCondiments();
 
    protected abstract String brew();
 
    private String boilWater() {
        return ("Boiling water");
    }
}