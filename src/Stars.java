public class Stars {
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        int thousands = count / 1000;
        int hundreds = (count % 1000) / 100;
        int tens = (count % 100) / 10;
        int ones = count % 10;

        String result = "";

        for (int i = 0; i < thousands; i++) {
            result += "X";
        }

        for (int i = 0; i < hundreds; i++) {
            result += "Y";
        }

        for (int i = 0; i < tens; i++) {
            result += "Z";
        }

        for (int i = 0; i < ones; i++) {
            result += "*";
        }

        return result;
    }
}
