import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        String favBand = "BTS";
        String favBandBRS = new String ("BTS FOREVER");
        char [] favBandArr = {'B','T','S'};
        String favBand1 = new String (favBandArr);

        String [] membersBTS = {"Namjoon", "Jin", "Hoseok", "Namjoon", "Yoongi", "Hoseok", "Taheyng", "Yoongi"};
        System.out.println(Arrays.toString(membersBTS));

        ArrayList<String>membersBTS1 = new ArrayList<>();
        for (int i = 0; i < membersBTS.length; i++) {
            if (!membersBTS1.contains(membersBTS[i])) {
                membersBTS1.add(membersBTS[i]);
            }
        }
        membersBTS = membersBTS1.toArray(new String[membersBTS1.size()]);
        System.out.println(Arrays.toString(membersBTS));

        Set<String> set = new LinkedHashSet<>(Arrays.asList(membersBTS));
        String [] result = set.toArray(set.toArray(new String[set.size()]));
        System.out.println(Arrays.toString(result));

    }
}