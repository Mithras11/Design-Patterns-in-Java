/*
   GoG definition => Provide a surrogate or placeholder for another object to control access to it
*/

import subjects.Proxy;

public class Client {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.registerUser("Sam");
        proxy.registerUser("Johnny");

        proxy.setCurrentUser("Sam");
        proxy.doSomething();

        proxy.setCurrentUser("Jim");
        proxy.doSomething();
    }
}
