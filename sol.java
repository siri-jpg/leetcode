/**day -1 
 * problem -1
 * when a integer is given the output must be a roman number
 * i have used the switch case for the characters
 * The main algorithm used is a Greedy Traversal (or Greedy Scan) with a simple comparison between adjacent characters.

Here's the intuition:

Traverse the Roman numeral from left to right.
Convert each Roman symbol into its integer value.
Compare the current value with the next value:
If the current value is less than the next value, subtract it.
Otherwise, add it.
 */

public class sol {

    public static int romanToInt(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int current = value(s.charAt(i));

            if (i < s.length() - 1 && current < value(s.charAt(i + 1))) {
                result -= current;
            } else {
                result += current;
            }
        }

        return result;
    }

    public static int value(char ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));      // 3
        System.out.println(romanToInt("LVIII"));    // 58
        System.out.println(romanToInt("MCMXCIV"));  // 1994
    }
}