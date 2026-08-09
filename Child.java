class Parent{
	int a;
	public int display(int val){
	    a=val;
	    return a;
	}
}


public class Child extends Parent{
	public static void main(String...val){
	Child ch=new Child();
	ch.a=20;
	//System.out.println(ch.display(ch.a));
	System.out.println(Child.class.isInstance(ch));
	System.out.println(Parent.class.isInstance(ch));
	}
}