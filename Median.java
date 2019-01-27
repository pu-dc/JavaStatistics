public class Median {
    private Integer resultValue = 0;
    private Integer resultFrequency = 0;
    private Integer valueMax, valueMin, frequencyMax, frequencyMin;
    
    public Median(Integer newValueMax, Integer newValueMin, Integer newFrequencyMax, Integer newFrequencyMin) {
        this.valueMax       = newValueMax;
        this.valueMin       = newValueMin;
        this.frequencyMax   = newFrequencyMax;
        this.frequencyMin   = newFrequencyMin;
        calculator();
    }
    @Override
    public String toString() {
        String str = "";
        str += "V: " + resultValue + ", F: " + resultFrequency;
        return str;
    }

    private void calculator() {
        resultValue     = (valueMax + valueMin) / 2;
        resultFrequency = (frequencyMax + frequencyMin) / 2;
    }
}