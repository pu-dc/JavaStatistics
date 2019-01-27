import java.util.Arrays;
import java.util.Collections;
public class DataMaxMin {
    protected Integer[] valueArray = new Integer[100];
    protected Integer[] frequencyArray = new Integer[100];
    public DataMaxMin(Integer[] newValue, Integer[] newFrequency) {
        this.valueArray     = newValue;
        this.frequencyArray = newFrequency;
    }
    public Integer getValueMax() {
        return Collections.max(Arrays.asList(valueArray));
    }
    public Integer getValueMin() {
        return Collections.min(Arrays.asList(valueArray));
    }
    public Integer getFrequencyMax() {
        return Collections.max(Arrays.asList(frequencyArray));
    }
    public Integer getFrequencyMin() {
        return Collections.min(Arrays.asList(frequencyArray));
    }
}