package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//BÀI 3
//        Cho chuỗi:
//        Ngôn ngữ lập trình Java ban đầu được phát triển bởi Sun Microsystems do
//        James Gosling khởi xướng và phát hành vào năm 1995. Phiên bản mới nhất
//        của Java Standard Edition là Java SE 8. Với sự tiến bộ của Java và sự phổ
//        biến rộng rãi của nó, nhiều cấu hình đã được xây dựng để phù hợp với
//        nhiều loại nền tảng khác nhau. Ví dụ: J2EE cho các ứng dụng doanh
//        nghiệp, J2ME cho các ứng dụng di động.
//        a) Đếm số lượng từng từ trong đoạn trên (không phân biệt hoa thường):
//        Ví dụ ta có chuỗi “Tôi học lập trình, học lập trình rất hay”
//        Kết quả từ
//        Tôi : 1 từ
//        Học : 2 từ
//        Lập: 2 từ
//        Trình: 2 từ
//        Rất: 1 từ
//        Hay: 1 từ
//        b) Viết hoa chữ đầu trong mỗi từ
//        c) Xóa các nguyên âm trong câu
class Main {
    public static void main(String a[]) {
        char SPACE = ' ';
        char TAB = '\t';
        char BREAK_LINE = '\n';
        String s = "Ngôn ngữ lập trình Java ban đầu được phát triển bởi Sun Microsystems do James Gosling khởi xướng và phát hành vào năm 1995. Phiên bản mới nhất của Java Standard Edition là Java SE 8. Với sự tiến bộ của Java và sự phổ biến rộng rãi của nó, nhiều cấu hình đã được xây dựng để phù hợp với nhiều loại nền tảng khác nhau. Ví dụ: J2EE cho các ứng dụng doanh nghiệp, J2ME cho các ứng dụng di động.";
        s = s.toLowerCase();
        Map<String, Integer> map = new HashMap<String, Integer>();
        String[] chars = s.split(" ");
        for (String ch : chars) {
            String firstLetter = ch.substring(0, 1);
            String remainingLetters = ch.substring(1, ch.length());
            firstLetter = firstLetter.toUpperCase();
            ch = firstLetter + remainingLetters;
            String[] vowel={"a", "ă", "â", "e", "ê", "i", "o", "ô", "ơ", "u", "ư", "y"};
            for(String v:vowel){
                if(ch.contains(v))
                    ch=ch.replaceAll(v, "");
            }
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        Set<String> keys = map.keySet();
        for (String ch : keys) {
                System.out.println("Word: " + ch + ": " + map.get(ch));
            }
        }
    }



