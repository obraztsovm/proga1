public class Laba1 {
    public static void main(String[] args) {
        short[] h = new short[9];
        for (int i = 0; i < 9; i++) {
            h[i] = (short) (19 - 2 * i);
        }
        float[] x = new float[16];
        for (int i = 0; i < 16; i++) {
            x[i] = (float) (Math.random() * 16 - 6);
        }
        matrix(dvumern(h, x));
    }


    public static double[][] dvumern(short[] h, float[] x) {
        double[][] p = new double[9][16];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 16; j++) {
                if (h[i] == 11) {
                    p[i][j] = Math.pow(Math.tan(Math.pow(x[j], 2 * x[j])), Math.atan(Math.cos(x[j])) - 1 / 3);
                } else if (h[i] == 5 | h[i] == 7 | h[i] == 15 | h[i] == 17) {
                    p[i][j] = Math.log(Math.exp(Math.exp((x[j] + 2) / 10)));
                } else {
                    p[i][j] = Math.atan(1 / Math.exp(Math.pow(3 * (Math.pow(Math.tan(Math.pow(Math.pow(0.5 / x[j], x[j]), (x[j] / 1) / 2)), 2) + 1), 2)));
                }
            }
        }
        return p;
    }


    public static void matrix(double[][] p) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 16; j++) {
                System.out.printf("%8.4f", (double) p[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
