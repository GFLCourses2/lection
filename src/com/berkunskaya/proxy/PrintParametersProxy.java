package src.src.com.berkunskaya.proxy;

import src.src.com.berkunskaya.Client;

/*
Proxy over an implemented interface with one method
that prints the method's parameters to the console.
 */
public class PrintParametersProxy implements PrintParameters {
    private PrintParametersImpl parameters;
    private Client client;

    public PrintParametersProxy(Client client) {
        this.client = client;
    }

    @Override
    public void print() {
        if (parameters ==null){
            parameters = new PrintParametersImpl(client);
        }
        parameters.print();
    }
}
