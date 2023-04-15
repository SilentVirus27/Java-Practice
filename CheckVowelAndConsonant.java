// write a java program to check given charactor is vowel or consonant
import java.util.Scanner;
class CheckVowelAndConsonant{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter single charactor to check:");
        char str = sc.next().charAt(0);
        if((str>='a' && str<='z')||(str>='A' && str <= 'Z')){
            if(str=='a'||str=='e'||str=='i'||str=='o'||str=='u'||str=='A'||str=='E'||str=='I'||str=='O'||str=='U'){
                System.out.println("Given charactor is vowel");
            }else System.out.println("Given charactor is consonant");
        }else System.out.println("Enter valid data.");
                
    }
}