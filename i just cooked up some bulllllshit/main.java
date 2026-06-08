public class main {
    public static void main(String[] args) {
        int i = 6;

        for (;;) {
            if (i == 1) {
                System.out.println("stuck");
                break;
            }
            if ((i % 2) == 1 && (i > -1)) {
                i = i * 3 + 1;
                System.out.println(i);
                }
            else if ((i % 2) == 0 && (i > -1)) {
                i = i / 2;

            }



        }
    }

    }