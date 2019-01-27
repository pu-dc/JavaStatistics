public class Average {
    protected Integer[] valueArray = new Integer[100];
    protected Integer[] frequencyArray = new Integer[100];
    private Integer result = 0;
    public Average(Integer[] newValue, Integer[] newFrequency) {
        this.valueArray     = newValue;
        this.frequencyArray = newFrequency;
        calculator();
    }
    @Override
    public String toString() {
        String str = "";
        str += "V: " + result;
        return str;
    }
    private void calculator() {
        Integer sum = 0;
        Integer population = 0;
        for (int i = 0; i < valueArray.length; i++) {
            sum += valueArray[i] * frequencyArray[i];
            population += frequencyArray[i];
        }
        result = sum / population;
    }
}