public class FibbonicSeries {
    /*static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        } else {

            return fib(n - 1) + fib(n - 2);
        }
    }
        public static void main (String[]args){
            int n = 9;
            for (int i = 0; i <n ; i++) {
                System.out.print(fib(i)+ " ");

            }*/


  /*      }
    }*/
    static int fib(int n){
        if (n <= 1){
            return n;

        }
        return fib(n-1)+ fib(n-2);
    }

    public static void main(String[] args) {
        int n = 9;
        for (int i = 0; i <n ; i++)
        {
            System.out.print(fib(i)+ " ");

        }
    }



}

