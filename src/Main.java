public class Main {
    public static void main(String[] args) {
        //1
        System.out.println("завдання 1");
        int g[] = new int[50];
        for (int i = 1; i < 100; i += 2) {
            g[i / 2] = i;
        }
        for (int i = 0; i < 50; i++) {
            System.out.println(g[i] + " ");
        }
        System.out.println("завдання 2");
        //2
        int g1[] = new int[20];
        for (int i = 0; i < 20; i++) {
            g1[i] = (int) Math.round(Math.random() * 9);
        }
        for (int i = 0; i < 20; i++) {
            System.out.println(g1[i] + " ");
        }
        for (int i = 0; i < 20; i++) {
            if (g1[i] % 2 == 1) {
                g1[i] = 0;
            }
        }
        for (int i : g1) {
            System.out.println(i + " ");
        }
        System.out.println("завдання 3");
        int[] k1 = new int[5];
        int[] k2 = new int[5];
        int[] k3 = new int[5];
        int s1[] = new int[4];


        for (int i = 0; i < 5; i++) {
            k1[i] = (int) Math.round(Math.random() * 5);
            k2[i] = (int) Math.round(Math.random() * 5);
            k3[i] = (int) Math.round(Math.random() * 5);
            s1[1] += k1[i];
            s1[2] += k2[i];
            s1[3] += k3[i];


        }
        if (s1[1] == s1[2] && s1[2] == s1[3]) {
            System.out.println("значення є рівними");
        } else if (s1[1] == s1[2]) {
            System.out.println("значення 1 і 2 є рівними");
        } else if (s1[1] == s1[2]) {
            System.out.println("значення 2 і 3 є рівними");
        } else if (s1[1] == s1[3]) {
            System.out.println("значення 1 і 3 є рівними");
        }
        if (s1[1] > s1[2] && s1[1] > s1[3]) {
            System.out.println("значення 1 є більше");
        }
        if (s1[2] > s1[3] && s1[2] > s1[3]) {
            System.out.println("значення 2 є більше");
        }
        if (s1[1] < s1[3] && s1[2] < s1[3]) {
            System.out.println("значення 3 є більше");
        }
        //  3
        int[] c1 = new int[10];
        int[] c2 = new int[10];
        int[] c3 = new int[10];
        for (int i = 0; i < 5; i++) {
            c1[i] = (int) Math.round(Math.random() * 10);
            c2[i] = (int) Math.round(Math.random() * 10);
            c3[i] = c2[i] + c1[i];
            System.out.println(i + " елемент першого масиву =" + c1[i]);
            System.out.println(i + " елемент другого масиву =" + c2[i]);
            System.out.println(i + " елемент трєтього масиву =" + c3[i]);
        }
        int[] h1 = new int[10];
        int y = 0;
        for (int i = 0; i < 5; i++) {
            h1[i] = (int) Math.round(Math.random() * 10);
            System.out.println(h1[i]);
            if (h1[i] % 2 == 0) {
                y++;
            }
        }
        System.out.println(y);
        //4
        int[][] m1 = new int[15][];
        for (int i = 0; i < 15; i++) {
            if (i > 12) {
                m1[i] = new int[9];

            } else if (i > 8) {
                m1[i] = new int[3];
            } else if (i > 4) {
                m1[i] = new int[8];
            } else {
                m1[i] = new int[5];
            }

        }
        for (int i = 0; i < 15; i++) {
            for (int r = 0; r < 9; r++) {
                if (i > 8 && r < 3) {
                    m1[i][r] =(int) Math.round(Math.random() * 15);
                } else if (i > 4 && i < 8) {
                    m1[i][r] =(int) Math.round(Math.random() * 15);
                } else if (r < 5) {
                    m1[i][r] =(int) Math.round(Math.random() * 15);
                }
            }
        }
    }
}




