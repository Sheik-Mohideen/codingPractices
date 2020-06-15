package datastructure;

public class Stackrunner {
    public static void main(String[] args) {
        Stackarray nums=new Stackarray();
        nums.push(15);
        nums.push(8);
        System.out.println(nums.peek());
        nums.push(10);
        nums.push(78);
        nums.push(87);
        nums.push(8);
        nums.show();
        nums.pop();
        nums.pop();  nums.pop();  nums.pop();  nums.pop();  nums.pop();
    }

}
