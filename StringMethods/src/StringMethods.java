public class StringMethods
{
    public static void main(String[]args){
        displayManyTimes("vaggelis",3);
    }

    public static boolean appearsIn(String str, char c){

        int i;
        for(i=0;i<str.length();i++){

            if(c == str.charAt(i)){
                return true;
            }
        }

        return false;
    }
    public static int findOccurences(String str, char c){

        int i, counter = 0;
        for(i=0;i<str.length();i++){

            if(c == str.charAt(i)){
                counter++;
            }
        }

        return counter;
    }
    public static void displayManyTimes(String message, int upTo){

        for(int i = 0;i<upTo;i++){
            System.out.println(message);
        }

    }
}