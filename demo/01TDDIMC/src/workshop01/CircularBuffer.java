package workshop01;

public class CircularBuffer {
    
    String[] datas = new String[5];
    int start = 0;
    int oldest = 0;

    public boolean isEmpty() {
        return start == 0;
    }

    public void add(String data) {
        datas[start] = data;
        start++;
       
    }

    public String remove() {
        start--;
        return datas[oldest++];
    }

}
