package javaExProject;


public class Market {

    public void start(){

        Buyer minwoo = new Buyer(0, 50000);
        Seller mw = new Seller(500, 50000);

        minwoo.buy(mw);

        System.out.println(minwoo);
        System.out.println(mw);


    }

    public static void main(String[] args){

        new Market().start();

    }
}