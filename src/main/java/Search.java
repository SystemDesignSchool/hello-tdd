public class Search {
    public static int search(int[] values, int key){

        for (int i = 0; i < values.length; i++){
            if (values[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
