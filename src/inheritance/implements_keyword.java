package src.inheritance;

class client implements Callback { //from src.inheritance.interface_keyword.java
    public void callback(int p) {
        System.out.println("callback called with " + p);
    }
    void nonInfaceMeth() {
        System.out.println("classes that implements interfaces may also define other members too.");
    }
}

class testInterface {
    public static void main(String[] args) {
        Callback c = new client();
        client c1 = new client(); //without interface
        c.callback(12);
        c1.nonInfaceMeth();
    }
}