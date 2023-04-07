import java.util.Scanner;

//wajp to determine oldest and youngest of 3 by age 
class AgeIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age of three people:");
        int user1=sc.nextInt();
        int user2=sc.nextInt();
        int user3=sc.nextInt();
        if((user1>=user2) && (user1>= user3)){
            System.out.println("User1 is oldest");
            if(user2<=user3){
                System.out.println("User2 is Younger");
            }else{
                System.out.println("User3 is Younger");
            }
        }
        else if((user2>user1) && (user2> user3)){
            System.out.println("User2 is oldest");
            if(user1<=user3){
                System.out.println("User1 is Younger");
            }else{
                System.out.println("User3 is Younger");
            }
        }
        else{
            System.out.println("User3 is oldest");
            if(user1<=user2){
                System.out.println("User1 is Younger");
            }else{
                System.out.println("User2 is Younger");
            }
        }
    }
    
}
