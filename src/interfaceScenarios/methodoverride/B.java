package interfaceScenarios.methodoverride;

public interface B {
    default void show() {
        System.out.println("From interface B");
    }
}
