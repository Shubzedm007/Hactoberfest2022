public class SwapTwoNumbers {


        static void swapValuesUsingThirdVariable(int m, int n)

        {
            // Swapping the values
            int temp = m;
            m = n;
            n = temp;
            System.out.println("Value of m after swapping is " + m
                    + " and Value of n after swapping is " + n);
        }

        // Main driver code
        public static void main(String[] args)
        {
            // Random integer values
            int m = 9, n = 5;

            System.out.println("Value of m is " + m
                    + " and Value of n is " + n);

            // Calling above function to
            // reverse the numbers
            swapValuesUsingThirdVariable(m, n);
        }
    }
