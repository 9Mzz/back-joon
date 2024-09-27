import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br        = new BufferedReader(new InputStreamReader(System.in));
        int            L         = Integer.parseInt(br.readLine());
        String         numString = br.readLine();


        // BigInt 설정하기
        BigInteger bigint = BigInteger.ZERO;
        BigInteger r      = BigInteger.valueOf(31); // r의 값은 26보다 큰 소수인 31로 하고
        BigInteger M      = BigInteger.valueOf(1234567891); // M의 값은 1234567891(놀랍게도 소수이다!!)로 하자.

        for (int i = 0; i < L; i++) {
            int        num     = numString.charAt(i) - 96;
            BigInteger bigNum  = BigInteger.valueOf(num);
            BigInteger squareR = r.pow(i);
            bigint = bigint.add(bigNum.multiply(squareR)).mod(M);

        }
        System.out.println(bigint);


    }
}