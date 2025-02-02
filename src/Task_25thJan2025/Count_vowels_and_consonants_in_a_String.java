package Task_25thJan2025;

public class Count_vowels_and_consonants_in_a_String {
    public static void main(String[] args) {
        //Count vowels and consonants in a String . -pramod
        //Logic building
        //I/O --> I = Char, O = String
        //Logic
        int  vowels;
        int consonants;
        //Define vowels
        String name = "pramod";
        int i = name.length(); //6

        char vowels_lower[] = {'a', 'e', 'i', 'o', 'u'};
        for (i = 0; i < name.length(); i++) {
            char j = name.charAt(i);
            System.out.println(j);
             for(int k=0;k<vowels_lower.length;k++){
                 if(j==vowels_lower[k]){
                    vowels =+ 1;
                     System.out.println(vowels);

                 }else {
                     consonants = +1;
                     System.out.println(consonants);
                 }
             }


        }



    }
}
