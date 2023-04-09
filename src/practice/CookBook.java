package practice;

public class CookBook extends Book{
     private boolean coupon;

    public CookBook() {
    }

    public CookBook(String title, String author, String publisher,boolean coupon) {
        super(title, author, publisher);
        this.coupon=coupon;
    }

    public boolean isCoupon() {
        return coupon;
    }

    public void setCoupon(boolean coupon) {
        this.coupon = coupon;
    }
    @Override
    public String info() {
        return String.format
                ("#분류: 요리책, %s, 쿠폰유무 : %s세", super.info(),coupon?"있음":"없음");
    }
}

