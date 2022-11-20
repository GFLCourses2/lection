package src.src.com.berkunskaya.proxy;

import src.src.com.berkunskaya.Client;

public class PrintParametersImpl implements PrintParameters{
    private Client client;

    public PrintParametersImpl(Client client) {
        this.client = client;
        getFromOutSource(client);
    }

    private void getFromOutSource(Client client) {
        System.out.println("Getting " + client.toString());
    }

    @Override
    public void print() {
        System.out.println(client.toString());
    }
}
