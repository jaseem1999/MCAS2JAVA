package CO2;
// Perform string manipulations
class StringManipulations {
    public static void main(String[] args) {
        String str = "Java Programming";
        System.out.println("The string is: " + str);
        System.out.println("The length of the string is: " + str.length());
        System.out.println("The character at position 5 is: " + str.charAt(5));
        System.out.println("The substring from 5 to 10 is: " + str.substring(5, 10));
        System.out.println("The index of character 'P': " + str.indexOf('P'));
        System.out.println("The concatenation of string is: " + str.concat(" Lab"));
        System.out.println("The string in uppercase is: " + str.toUpperCase());
        System.out.println("The string in lowercase is: " + str.toLowerCase());
        System.out.println("The string without spaces is: " + str.trim());
        System.out.println("The string replaced is: " + str.replace('a', 'e'));   
    }    
}
