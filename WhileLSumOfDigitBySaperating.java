//wajp to find sum of all given digit i.e 1234 => 1+2+3+4=10
class WhileLSumOfDigitBySaperating {
    public static void main(String[] args) {
        int sum=0,num=1234;
        while(num!=0){
        int digit=num%10;
        sum=sum+digit;
        num=num/10;
        }
        System.out.println("Sum: "+sum);
    }
}
