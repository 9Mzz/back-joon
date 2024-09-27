import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String st = br.readLine();
            String stre = new StringBuilder(st).reverse().toString();

            if (list.contains(stre) || st.equals(stre)) {
                System.out.println(st.length() + " " + st.charAt(st.length()/2));
            } else {
                list.add(st);
            }
        }
        br.close();
    }
}