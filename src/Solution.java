public class Solution {
    public static void main(String[] args) {
        Solution a = new Solution();
        a.numbers();
        a.findMedian(1, 7, 3);

    }
    public void numbers () {
            for (int i = 0; i <= 100; i += 2) {
             //   System.out.println(i);
            }

        }
    public void findMedian(int a, int b, int c) {
        if ((a >= b && a <= c) || (a >= c) && a <= b) System.out.println(a); // if a is median
        else if ((b >= a && b <= c) || (b >= c && b <= a)) System.out.println(b); // if b is median
        else System.out.println(c);{

        }
        // write your code here
    }
    }