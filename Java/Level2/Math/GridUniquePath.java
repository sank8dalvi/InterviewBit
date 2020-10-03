// Author : Shreya Prabhu

class GridUniquePath {

    static int numberOfPaths(int m, int n)
    {
        /*
            We have to calculate m+n-2 C n-1 here
            which will be (m+n-2)! / (n-1)! (m-1)!
        */
        int path = 1;
        for (int i = n; i < (m + n - 1); i++) {
            path *= i;
            path /= (i - n + 1);
        }
        return path;
    }

    public static void main(String[] args)
    {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        System.out.println(numberOfPaths(m, n));
    }
}

