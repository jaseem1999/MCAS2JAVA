// Program to Sort strings
package CO2;

class SortString {
    public static void main(String[] args) {
        String a = "ABCDEF";
        // Program to Sort strings
        System.out.println("The string is: " + a);
        char[] b = a.toCharArray();
        char temp;
        for (int i = 0; i < b.length; i++) {
            for (int j = i + 1; j < b.length; j++) {
                if (b[i] > b[j]) {
                    temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                }
            }
        }
        System.out.println("The sorted string is: ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
        }     

    }
    
}
