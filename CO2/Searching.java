package CO2;


class Searching {
    public static void main(String[] args) {
        Search s = new Search();
        s.num();
        s.StrSearch();
    }    
}

class   Search{
    public void num(){
        int[] a = { 1, 4, 6, 7, 8, 9, 10, 12, 14, 15 };
        int key = 10;
        int flag = 0;
        int pos = 0;
        // Program to search for an element in an array
        System.out.println("The array is: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        for (int i = 0; i < a.length; i++) {
            if (key == a[i]) {
                flag = 1;
                pos = i;
                break;
            } else {
                flag = 0;
            }
        }
        if (flag == 1) {
            System.out.println("\nThe element " + key + " is found at position " + pos);
        } else {
            System.out.println("\nThe element " + key + " is not found");
        }
    }

    public void StrSearch(){
        String arr[] = {"A", "B", "C", "D", "E", "F", "G", "H"};
        String key = "D";
        int flag = 0;
        int pos = 0;
        // Program to search for an element in an array
        System.out.println("The array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                flag = 1;
                pos = i;
                break;
            } else {
                flag = 0;
            }
        }
        if (flag == 1) {
            System.out.println("\nThe element " + key + " is found at position " + pos);
        } else {
            System.out.println("\nThe element " + key + " is not found");
        }
    }
}
