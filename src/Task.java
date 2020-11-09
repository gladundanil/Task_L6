public class Task {

    public static void main(String[] args) {

        int height = 5, width  = 9;

        for (int x = 0; x < height; x++) {

            System.out.print("*");

            for (int y = 0; y < width-1; y++) {
                System.out.print("*");
            }

            if (x != height-1) {
                System.out.print("\n");
            }

        }


    }

}
