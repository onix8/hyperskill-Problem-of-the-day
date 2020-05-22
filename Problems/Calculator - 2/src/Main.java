// Posted from EduTools plugin
/* Please, do not rename it */
class Problem {

    public static void main(String args[]) {
        String operator = args[0];
        // write your code here
        if ("MAX".equals(operator)) {
            int max = parse(args[1]);
            for (int i = 1; i < args.length; i++) {
                int nextNumber = parse(args[i]);
                if (max < nextNumber) {
                    max = nextNumber;
                }
            }
            System.out.println(max);
        }

        if ("MIN".equals(operator)) {
            int min = parse(args[1]);
            for (int i = 1; i < args.length; i++) {
                int nextNumber = parse(args[i]);
                if (min > nextNumber) {
                    min = nextNumber;
                }
            }
            System.out.println(min);
        }

        if ("SUM".equals(operator)) {
            int sum = 0;
            for (int i = 1; i < args.length; i++) {
                int nextNumber = parse(args[i]);
                sum += nextNumber;
            }
            System.out.println(sum);
        }
    }

    public static int parse(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return 0;
        }
    }
}