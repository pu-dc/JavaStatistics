public class RangeQuartil {
    private Integer quartil1, quartil3;
    private Integer result = 0;
    public RangeQuartil(Integer newQuartil1, Integer newQuartil3) {
        this.quartil1 = newQuartil1;
        this.quartil3 = newQuartil3;
        calculator();
    }
    @Override
    public String toString() {
        return "(Q3: " + quartil3 + ") - (Q1: " + quartil1 + ") = " + result;
    }
    private void calculator() {
        result = quartil3 - quartil1;
    }
}