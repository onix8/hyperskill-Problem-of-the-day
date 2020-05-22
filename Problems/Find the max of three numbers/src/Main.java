public static int getNumberOfMaxParam(int a, int b, int c) {
    // write a body here
        if (a >= b && a >= c) {
            return 1;
        }
        if (b >= a && b >= c) {
            return 2;
        } else {
            return 3;
        }
}