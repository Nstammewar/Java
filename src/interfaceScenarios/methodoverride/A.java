package interfaceScenarios.methodoverride;

public interface A {
    default void show() {
        System.out.println("From interface A");
    }
    /*

    ## give compile time error when trying to override object class methods ##
    default boolean equals(Object o){
        return true;
    }*/
}
