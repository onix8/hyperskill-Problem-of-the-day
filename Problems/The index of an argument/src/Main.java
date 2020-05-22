class Problem {

    public static void main(String[] args) {
        int n = -1;
        for (int i = 0; i < args.length; i++) {
            if ("test".equals(args[i])) {
                n = i;
            }
        }
        System.out.println(n);
    }
}