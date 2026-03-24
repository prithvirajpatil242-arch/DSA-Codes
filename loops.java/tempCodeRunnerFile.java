
    }

    public static void primeinRange(int n){
        for (int i= 2; i<=n ;i++ ){
            if (isPrime(i)){
               System.out.print(i + " ");
            }
        }
        System.out.println();
    }