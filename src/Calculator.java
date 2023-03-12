public class Calculator {
    // global static/class variables
    static int a=10;
    static int b=4;
    static int add,sub,mul,div;

    // no return type no parameter user defined method
    static void add_sub_mul_div (){
        add= a+b;
        sub = a-b;
        mul = a*b;
        div = a/b;
        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
    }
    //main method
    public static void main(String[] args) {
        add_sub_mul_div();
    }
    
}
