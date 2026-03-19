public class exemploOperadores {

    public static void main(String[] args) {

        int n = 100;

        n++; //Incremento a variavel em 1 unidade
        System.out.println(n);
        n--; //Decrementa a variavel em 1 unidade
        System.out.println(n);

        //Somar 10 no n
        n += 10; //n = n + 10; = 110
        System.out.println(n);
        n -= 50; //n = n - 50; = 60
        System.out.println(n);
        n *= 3; //n = n * 3; = 180
        System.out.println(n);
        n /= 2; //n = n / 2; = 90
        System.out.println(n);
        n %= 7; //n = n % 5; = 6
        System.out.println(n);

    }
}
