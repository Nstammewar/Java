package interfaceScenarios.methodoverride;

public class Child extends Parent implements  A,B {
    //1.need to override method when have same method in interfaces that are implemented
    //to reproduce error comment show method in child class
    /*
    interfaceScenarios.methodoverride.Child inherits unrelated defaults for show()
    from types interfaceScenarios.methodoverride.A and interfaceScenarios.methodoverride.B*/

    public static void main(String[] args) {
        Child child=new Child();
        child.show();//from Child Class  if(show method not overridden ) then  From parent Class

    }


    @Override
    public void show() {
        A.super.show();//From interface A
        B.super.show();//From interface B
        super.show();//From parent Class
        System.out.println("from Child Class");
    }
}
