package workshop02;

public class PrimeFactor {

    public String getPrime(int number) {
        if(number<2)
            throw new InvalidInputException();
        
        if(number % 2 == 0) {
            String result = "";
            int start = 2;
            while(number>=start) {
                if(number%start == 0)
                    result +=2;
                number = number/start;
            }
            return result;
        }

        return String.valueOf(number);
    }

}
