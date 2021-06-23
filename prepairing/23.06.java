class Solution {
    public int reverse(int x) {
        int c = 0;
        int n = x;
        while (n != 0){
            n /= 10;
            c++;
        }
        int[] numberArray = new int[c];
        int j = c;
        
        c = 0;
        n = x;
        
        while (n != 0){
            numberArray[c] = n % 10;
            n /= 10;
            c++;
        }
        
        int z = 0;
        int mu = 10*j;
        for(int i = j-1; i >= j; i--){
            z = z + numberArray[i]*mu;
            mu = mu/10;
        }

        System.out.println(z);
    }
}