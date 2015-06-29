package rules;

public class FizzRule implements Rule {
    
    public String say() {
        return "Fizz";
    }
    
    public boolean check(int number) {
        return number%3 == 0;
    }
    
    

}
