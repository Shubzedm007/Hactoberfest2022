public class LCM {
        static int GCD(int u, int v)
        {
            if (u == 0)
                return v;
            return GCD(v % u, u);
        }

        // LCM of two numbers
        static int lcm(int u, int v)
        {
            return (u / GCD(u, v)) * v;
        }

        // The Driver method
        public static void main(String[] args)
        {
            int u = 25, v = 15;
            System.out.println("LCM of " + u + " and " + v
                    + " is " + lcm(u, v));
        }
    }
