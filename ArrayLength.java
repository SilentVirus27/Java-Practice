//wajp to find count of number of element in array without using inbuilt function
class ArrayLength {
public static void main(String[] args) {
    int a[]={2,5,-2,8,9};
    int count=0;
    for (int i : a) {
        count++;
    }
    System.out.println("number of element:"+count);    
}    
}
