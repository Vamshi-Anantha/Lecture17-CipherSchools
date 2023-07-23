public class JaggedArrays {
    static void printJaggedArrays(int arr[][]) {
        // printing jagged array properly
        // all rows in separate lines
        for (int i = 0; i < arr.length; i++) { // rows
            for (int j = 0; j < arr[i].length; j++) { // coloums
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[][] = new int[3][];
        arr[0] = new int[3];
        arr[1] = new int[2];
        arr[2] = new int[3];
        printJaggedArrays(arr);
        int arr2[][] = new int[3][];
        // we can't use initializer list here, since it doesn't create an object
        // arr[0]={1,2,3};
        // arr[1]={4,5};
        // arr[2]={6,7,8};
        arr2[0] = new int[] { 1, 2, 3 };
        arr2[1] = new int[] { 2, 3 };
        arr2[2] = new int[] { 4, 5, 6 };
        System.out.println("*******________********_______*******");
        printJaggedArrays(arr2);
    }
}