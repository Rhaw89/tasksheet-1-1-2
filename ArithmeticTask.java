class ArithmeticTask {

    public static void main (String[] args){
          
        int result = 1 + 2; // result is now 3
        System.out.println(result);

        result = result - 1; // result is now 2
        System.out.println(result);

        result = result * 2; // result is now 4
        System.out.println(result);

        result = result / 2; // result is now 2
        System.out.println(result);

        result = result + 8; // result is now 10
        System.out.println(result);
        
        result = result % 7; // result is now 3
        System.out.println(result);
      
        result = result & 10; // result is now 2
        System.out.println(result);
        
        result = result | 15; // result is now 15
        System.out.println(result);
        
        result = result ^ 12; // result is now 3
        System.out.println(result);
        
        result = result << 10; // result is now 3072
        System.out.println(result);
        
        result = result >> 5; // result is now 96
        System.out.println(result);
        
        result = result >>> 15; // result is now 0
        System.out.println(result);

    }
}
