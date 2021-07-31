package javaExProject;

public class Seller {
    /**
     * 상품 가격
     */
    private final int PRICE = 2500; // 상수들은 제일 위에

    /**
     * 판매자가 가진 금액
     */

    private int money;

    /**
     * 판매자가 가진 상품 갯수.
     */

    private int productNum;

    public Seller(int productNum, int money){
        System.out.println("판매자 생성자 호출...");

        setProductNum(productNum);
        setMoney(money);

        System.out.println(this);
    }

    public void setProductNum(int productNum){
        this.productNum = productNum;
    }

    public int getProductNum(){
        return this.productNum;
    }

    public void setMoney(int money){
        this.money = money;
    }

    public int getMoney(){
        return this.money;
    }

    public void sell(Buyer buyer){
        this.productNum--; // 판매자가 가진 상품의 갯수에서 하나를 뺀다

        // 구매자는 돈을 지불한다.
        buyer.pay(PRICE);

        this.money += PRICE; // 판매자가 가진 금액에서 상품의 가격만큼 더한다.
    }

    /**
     * 재고 파악하기
     * @return : boolean 재고가 있으면 false, 재고가 없으면 true
     */

    public boolean isSoldOut(){
        boolean isSoldOut = this.productNum == 0;
        return isSoldOut;
    }

    /**
     * 판매자 현황 파악하기
     */

    @Override
    public String toString(){

        String msg = String.format("판매자의 상품 갯수 : %d\n판매자가 가진 금액 : %d",
                this.productNum, this.money);
        return msg;

    }

}