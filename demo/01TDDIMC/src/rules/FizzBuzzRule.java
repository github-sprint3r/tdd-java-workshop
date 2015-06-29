package rules;

public class FizzBuzzRule implements Rule{
    public String say() {
        return "FizzBuzz";
    }
    
    public boolean check(int number) {
        return (number%3==0 && number%5==0);
    }
}
