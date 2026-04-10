package org.APCSLowell;

import java.util.ArrayList;

public class Digits {
    /** The list of digits from the number used to construct this object.
     *  The digits appear in the list in the same order in which they appear in the original number
     */
    public ArrayList<Integer> digits;

    /** Constructs a `Digits` object that represents `num`.
     *  *Precondition*: `num >= 0`
     */
    public Digits(int num) {
        digits = new ArrayList<Integer>();
        while (num != 0) {
            digits.add(num % 10);
            num /= 10;
        }
        ArrayList<Integer> reverse = new ArrayList<Integer>();
        for (int i = digits.size() - 1; i >= 0; i--) {
            reverse.add(digits.get(i));
        }
        digits = reverse;
        // throw new UnsupportedOperationException();
    }

    /** Returns `true` if the digits in this `Digits` object are in strictly increasing order;
     *      `false` otherwise.
     */
    public boolean isStrictlyIncreasing() {
        for (int i = 0; i < digits.size() - 1; i++) {
            if (digits.get(i) >= digits.get(i+1)) {
                return false;
            }
        }
        return true;
        // throw new UnsupportedOperationException();
    }
}
