
package pkg;
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.out;
 
public class CoffeeWithHook extends CaffeineBeverageWithHook {
 
    @Override
    protected String addCondiments() {
        return ("Adding sugar and milk");
    }
 
    @Override
    protected String brew() {
        return ("Dripping coffee through filter");
    }
 
    @Override
    public boolean customerWantsCondiments() {
        String answer = getUserInput();
 
        if (answer.toLowerCase().startsWith("y")) {
            return true;
        }
        return false;
    }
 
    private String getUserInput() {
        String answer = null;
 
        out.println("Would you like milk and sugar with your coffee (y/n)?");
 
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
 
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
 
        if (answer == null) {
            return "no";
        }
        return answer;
    }

    
}
