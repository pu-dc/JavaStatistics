
public class TestMain {
    public int result;
    public TestMain() {
        calculator();
    }
    public int getResult() {
        return result;
    }

    @Override
    public String toString() {
        String str = "";
        str += getResult();
        return str;
    }
    public static void main(String[] args) {
        System.out.println(new TestMain());
    }

    private void calculator() {
        int[] frequency = new int[10];
        for (int i = 0; i < 10; i++) {
            frequency[i] += i * 2;
        }
        result = frequency[1];
    }
}