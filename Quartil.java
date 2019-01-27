public class Quartil extends MainSpace {
    protected Integer[] valueArray = new Integer[100];
    protected Integer[] frequencyArray = new Integer[100];
    private Integer sum;
    private String resultString = "";
    private int quartilRange1Down, quartilRange3Down = 0;

    public Quartil(Integer[] newValue, Integer[] newFrequency, Integer newSum) {
        this.valueArray     = newValue;
        this.frequencyArray = newFrequency;
        this.sum            = newSum;
        calculator();
    }
    public Integer getQuartil1() {
        return quartilRange1Down;
    }
    public Integer getQuartil3() {
        return quartilRange3Down;
    }
    @Override
    public String toString() {
        String str = "";
        str += resultString;
        return str;
    }
    
    private void calculator() {    
        /* FORMULA
            100 * 2;
            90 * 5;
            80 * 1;

            MOD 2 == 0
                If (quartil.length % 2 == 0) {
                    (1/4 * n) + 1/2
                }

            MOD 2 == 1
                If (quartiln.length % 2 != 0) {
                    1/4 * (n + 1)
                }
        */
        int count = 0;
        Integer[] quartil = new Integer[sum];
        for (int i = 0; i < frequencyArray.length; i++) {
            for(int j = 0; j < frequencyArray[i]; j++) {
                quartil[count] = valueArray[i];
                count++;
            }
        }

        int quartilRange1Up     = 0;
        quartilRange1Down   = sum * 1 / 4;
        int quartilRange2Up     = quartilRange1Down + 1;
        int quartilRange2Down   = sum * 2 / 4;
        int quartilRange3Up     = quartilRange2Down + 1;
        quartilRange3Down   = sum * 3 / 4;
        int quartilRange4Up     = quartilRange3Down +1;
        int quartilRange4Down   = sum;

        resultString += "\n\tQ1 = ";
        for (int i = quartilRange1Up; i < quartilRange1Down; i++) {
            if (i != (quartilRange1Down-1)) {
                resultString += quartil[i] + ", ";
            } else {
                resultString += quartil[i] + ".";
            }
        }
        resultString += "\n\tQ2 = ";
        for (int i = quartilRange2Up; i < quartilRange2Down; i++) {
            if (i != (quartilRange2Down-1)) {
                resultString += quartil[i] + ", ";
            } else {
                resultString += quartil[i] + ".";
            }
        }
        resultString += "\n\tQ3 = ";
        for (int i = quartilRange3Up; i < quartilRange3Down; i++) {
            if (i != (quartilRange3Down-1)) {
                resultString += quartil[i] + ", ";
            } else {
                resultString += quartil[i] + ".";
            }
        }
        resultString += "\n\tQ4 = ";
        for (int i = quartilRange4Up; i < quartilRange4Down; i++) {
            if (i != (quartilRange4Down-1)) {
                resultString += quartil[i] + ", ";
            } else {
                resultString += quartil[i] + ".";
            }
        }     
    }
}