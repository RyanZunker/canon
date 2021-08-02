public class Counter implements iCounter{
    int value;
    public Counter(){
        value = 0;
    }

    @Override
    public void increment() {
        value++;
    }

    @Override
    public int getValue() {
        return value;
    }
}
