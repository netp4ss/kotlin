// FILE: JavaClass.java
public class JavaClass {
    private String myFoo = "";
    public String getFoo() { return myFoo; }
    public void setFoo(@org.jetbrains.annotations.Nullable String s) { myFoo = s; }
}

// FILE: main.kt
fun main(j: JavaClass) {
    j.foo += "OK"
}