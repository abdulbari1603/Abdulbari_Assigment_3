public class Assign3Q1{
    public static void main(String[] args) {
        char someChar = 'a';
        System.out.println("Char is: " + someChar);
      
        switch (Character.toLowerCase(someChar)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            System.out.println(someChar  + " is a vowel"  );    
                break;
                     
            default:
            System.out.println(someChar  + " is a consonant"  );
                break;
        }
            
    }
}