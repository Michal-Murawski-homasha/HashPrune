public class HashPrune {
    public static void main(String[] args) {
        int bottom = 8;
        int top = bottom % 2 == 0 ? 2 : 1;
        int height = 0;
        for (int i = bottom; i > 0; i = i - 2) {
            height++;
        }
        int numberRow = top;
        for (int row = 0; row < height; row++) {
            int space = (bottom - numberRow) / 2;
            for (int column = 0; column < bottom - space; column++) {
                System.out.print(column < space ? " " : "#");
            }
            numberRow = numberRow + 2;
            System.out.println();
        }
        System.out.println();
    }
}
