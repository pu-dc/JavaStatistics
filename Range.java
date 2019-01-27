public class Range {
    private Integer resultValue = 0;
    private Integer resultFrequency = 0;
    private Integer valueMax, valueMin, frequencyMax, frequencyMin;
    public Range(Integer newValueMax, Integer newValueMin, Integer newFrequencyMax, Integer newFrequencyMin) {
        this.valueMax = newValueMax;
        this.valueMin = newValueMin;
        this.frequencyMax = newFrequencyMax;
        this.frequencyMin = newFrequencyMin;
        calculator();
    }
    @Override
    public String toString() {
        return "V: " + resultValue + ", F: " + resultFrequency;
    }

    private void calculator() {
        resultValue = valueMax - valueMin;
        resultFrequency = frequencyMax - frequencyMin;
    }
}