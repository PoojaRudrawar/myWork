import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by PRudrawar on 1/10/2018.
 */
public class RemoveDuplicateFromCharArray {
    public static void main(String[] args) {
        char[] carray="Hello Pooja".toCharArray();

        for(int i=0;i<carray.length;i++){
            //System.out.print(c+" ");

            for(int j=i+1;j<carray.length;j++){
                if(carray[i]==carray[j]){
                    carray[j]=' ';
                }
            }


        }

        System.out.println(carray);
        removeDuplicateString2("FOOOOLLLLLLLLLLLOOOOOOOOOWWWWWWWWWWWWWF UUUUPPPPPPP");
    }

    public static void removeDuplicateString2(final String input) {
        final Set<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < input.length(); i++)
            set.add(input.charAt(i));
        final StringBuilder stringBuilder = new StringBuilder(set.size());
        for (final Character character : set)
            stringBuilder.append(character);
        System.out.println(stringBuilder);
    }
}
