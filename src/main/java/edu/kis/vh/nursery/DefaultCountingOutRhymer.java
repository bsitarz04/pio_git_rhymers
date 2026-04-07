package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int CAPACITY = 12;
    public static final int EMPTY_RHYMER_INDICATOR = -1;
    public static final int MAX_INDEX = 11;
    private final int[] NUMBERS = new int[CAPACITY];

    private int total = EMPTY_RHYMER_INDICATOR;

    public int getTotal() {
        return total;
    }

    public void countIn(final int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_RHYMER_INDICATOR;
    }

    public boolean isFull() {
        return total == MAX_INDEX;
    }

    protected int peek() {
        if (callCheck())
            return EMPTY_RHYMER_INDICATOR;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY_RHYMER_INDICATOR;
        return NUMBERS[total--];
    }

    public int[] getNUMBERS() {
        return NUMBERS;
    }

}