public class Discount {
    public double CalculateDiscount(String book_typp, double price) {
        double discount_price = -1;

        if (book_typp == null || book_typp=="") {
            System.out.println("图书类型为空");
            return -1;
        }
        if (price < 0) {
            System.out.println("图书价格:" + price + "不合理");
            return -1;
        }
        if (book_typp.equals("新书")) {
            discount_price = price * 1.2;
            System.out.println("图书价格:" + discount_price);
        } else if (book_typp.equals("常规图书")) {
            discount_price = price * 1.0;
            System.out.println("图书价格:" + discount_price);
        } else if (book_typp.equals("滞销图书")) {
            discount_price = price * 0.6;
            System.out.println("图书价格:" + discount_price);
        } else {
            System.out.println("无该种类型的图书：" + book_typp);
        }
        return discount_price;
    }
}
