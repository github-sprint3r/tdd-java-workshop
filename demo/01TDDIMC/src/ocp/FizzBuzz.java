package ocp;

import rules.FizzBuzzRule;
import rules.FizzRule;
import rules.Rule;

public class FizzBuzz {

    public String say(int number) {
        Rule[] rules = {new FizzBuzzRule(), new FizzRule()};
        
        for(Rule rule : rules) {
            if(rule.check(number))
                return rule.say();
        }
        
        if(isBuzz(number))
            return "Buzz";
        if(isOCP(number))
            return "OCP";
        
        return String.valueOf(number);
    }
 
    public boolean isOCP(int number) {
        return number%7 == 0;
    }

    public boolean isFizzBuzz(int number) {
        return isFizz(number) && isBuzz(number);
    }

    public boolean isBuzz(int number) {
        return number%5 == 0;
    }

    public boolean isFizz(int number) {
        return number%3 == 0;
    }

}
