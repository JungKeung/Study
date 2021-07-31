package javaExProject;



/**
 * Seller에게 상품을 구매하고 금액을 지불한다.
 *
 * 개발 순서 : 멤버 변수 -> Setter Getter -> Method
 * @author Admin
 *
 */
public class Buyer {
    /**
     * 상품 갯수
     */

    private int productNum;

    /**
     * 구매자가 가진 금액
     */

    private int money;

    public Buyer(int productNum, int money){
        System.out.println("구매자 생성자 호출...");
        setProductNum(productNum); // 같은 클래스 메소드명만으로 호출 가능
        setMoney(money);

        // 현황 출력하기 생성자에서 this 호출하면 toString 메소드 호출됨
        // toString Override 되어있지 않으면 객체 메모리 주소 호출됨
        System.out.println(this);

    }

    // 상품 갯수 초기화 또는 갱신
    public void setProductNum(int productNum){
        this.productNum = productNum;
    }

    // 상품 갯수를 반환(출력용)
    public int getProductNum(){
        return this.productNum;
    }

    // 구매자의 가진 돈 초기화 또는 갱신
    public void setMoney(int money){
        this.money = money;
    }

    // 구매자가 가진 돈을 반환함(출력용)
    public int getMoney(){
        return this.money;
    }

    // 구매하기. 구매자가 가진 상품의 개수에 1 더해준다.
    public void buy(Seller seller){
        seller.sell(this);

        this.productNum++;
    }

    /**
     * 지불하기
     * 구매자가 가진 돈에서 지불할 금액을 뺀다.
     * @param money : 지불할 금액
     */
    public void pay(int money){
        this.money -= money;
    }

    /**
     * 구매자 현황 파악하기.
     */
    @Override
    public String toString(){

        String msg = String.format("구매한 상품 갯수 : %d\n구매자가 가진 금액 : %d\n",
                this.productNum, this.money);
        return msg;
    }

}