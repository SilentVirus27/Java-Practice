//wajp to swap two floating point number without using tmp 
class SwapTwoIntegerWithoutTemp {
    public static void main(String[] args) {
        float a=13.0f,b=20.5f;
        System.out.println("Before Swapping : a= "+a+" b= "+b);
        a=a-b;b=a+b;a=b-a;
        System.out.println("After Swapping : a= "+a+" b= "+b);

    }
}
