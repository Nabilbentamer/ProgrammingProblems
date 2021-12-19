package codeforces;
import java.math.BigInteger;
import java.util.*;
import java.lang.*;


public class Problem_489C {
    
    public static void main(String args[]){
        
        
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int s = input.nextInt();
        
        
        BigInteger start = power(m-1);
        BigInteger end = power(m);
        
        System.out.println(start);
        
        List<BigInteger> list = new ArrayList<BigInteger>();;

        BigInteger i = end;
        BigInteger s_new = BigInteger.valueOf(s);
        
        
        
        while(i.compareTo(start)==1){
            
            if(sum_digits(i,s).compareTo(BigInteger.valueOf(0))== 0 ){ 
                list.add(i);
            }
            
            i=i.subtract(BigInteger.valueOf(1));
        }
        
        
        if(list.isEmpty()){
            System.out.println(-1+" "+-1);
        }
        else{
            Collections.sort(list);
            System.out.println(list.get(0)+" "+list.get(list.size()-1));
        }
        
        
        

    }
    
    static BigInteger power(int power){
        
        BigInteger number = new BigInteger("1");
        
        
        for(int i=1;i<=power;i++){
            number = number.multiply(BigInteger.valueOf(10));
            //System.out.println(number);
        }
        return number;
    }
    
    static BigInteger sum_digits(BigInteger number, int s){
        
        BigInteger a =BigInteger.valueOf(10);
        
        BigInteger sum = number.remainder(a);
        
        BigInteger next_degits = number.divide(a);
        
        while(next_degits.signum()==1 && sum.compareTo(BigInteger.valueOf(s)) == -1){
            BigInteger first = sum_digits(next_degits,s);
            sum=sum.add(first);
            
        }
        if(sum.compareTo(BigInteger.valueOf(s)) == 0){
            sum=BigInteger.valueOf(0);
        }
        
        if(sum.compareTo(BigInteger.valueOf(s)) == 1){
            sum=BigInteger.valueOf(1);
        }
        return sum;

    }
    
}
