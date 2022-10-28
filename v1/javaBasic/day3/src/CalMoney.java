import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
//Bài 6:
//        Cần có tổng 200.000đ từ 3 loại giấy bạc 1000đ, 2000đ, và 5000đ.
//        Lập
//        chương tình để tìm tất cả các phương án có thể.
public class CalMoney {
    private Integer money;
    public String formatMoneyVN(Integer money) {
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat vn = NumberFormat.getInstance(localeVN);
        return vn.format(money);
    }
    public int calMoneyType(List<Integer> money_types, Integer money) {
        int min = money_types.get(0);
        for (int i = 1; i < money_types.size(); i++) {
            if (min > money_types.get(0)) {
                min = money_types.get(i);
            }
        }
        int right = (money / min);
        int count = 0;
        for (int x = 0; x <= right; x++) {
            for (int y = 0; y <= right; y++) {
                for (int z = 0; z <= right; z++) {
                    if (money_types.get(0)*x+ money_types.get(1)*y + money_types.get(2)*z == money)
                    {
                        count = count + 1;
                    }
                }
            }
        }
        return count;
    }
            public static void main (String[]args){
                CalMoney m = new CalMoney();
                List<Integer> moneyTypes = new ArrayList<Integer>();
                moneyTypes.add(1000);
                moneyTypes.add(2000);
                moneyTypes.add(5000);
                System.out.println(m.calMoneyType(moneyTypes, 5000));
            }
        }
