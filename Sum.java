public class Sum extends MainSpace {
    protected Integer[] frequencyArray = new Integer[100];
    private Integer result = 0;
    public Sum(Integer[] newFrequency) {
        this.frequencyArray = newFrequency;
        calculator();
    }
    public Integer result() {
        return result;
    }
    @Override
    public String toString() {
        String str = "";
        str += "F: " + result();
        return str;
    }

    private void calculator() {
        for (int i = 0; i < frequencyArray.length; i++) {
            result += frequencyArray[i];
        }
    }
}