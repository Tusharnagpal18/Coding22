import java.util.Arrays;
import java.util.Scanner
public class FlippingImage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num of rows: ");
        int rows = in.nextInt();
        System.out.print("Enter num of cols: ");
        int cols = in.nextInt();
        int[][] image = new int[rows][cols];
        for (int i=0; i < rows; i++){
            System.out.print("Enter elements in row "+(i+1)+": ");
            for (int j=0; j < cols; j++) {
                image[i][j] = in.nextInt();
            }
        }
        System.out.println("Original Image: ");
        for (int[] row:image){
            System.out.println(Arrays.toString(row));
        }
        System.out.println("Flipped Image: ");
        image = flipAndInvertImage(image);
        for (int[] row:image){
            System.out.println(Arrays.toString(row));
        }
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        int len = image.length;
        for(int row = 0; row < len; row++){
            int start = 0;
            int end = image[row].length - 1;

            while(start <= end){
                int temp = invert(image[row][start]);
                image[row][start] = invert(image[row][end]);
                image[row][end] = temp;

                start++;
                end--;

            }

        }
        return image;

    }
    public static int invert(int n){
        if (n == 0)
            return 1;
        else
            return 0;
    }
}
