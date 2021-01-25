package study;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * 問①〜問③まであります。
 * 問②に関しては、コメントを記述してください。
 *
 */
public class Study {

    public static final String SHOP_SHOHIN_00 = "バナナ";
    public static final String SHOP_SHOHIN_01 = "牛乳";
    public static final String SHOP_SHOHIN_02 = "豚肉";
    public static final String SHOP_SHOHIN_03 = "コロッケ";

    public static void main(String args[]) {

        // ① 定数を全て使って、String型のListを記述してください。

        LinkedHashMap<Integer, String> shohinList = new LinkedHashMap<Integer, String>();{
            {
                shohinList.put(0,SHOP_SHOHIN_00);
                shohinList.put(1,SHOP_SHOHIN_01);
                shohinList.put(2,SHOP_SHOHIN_02);
                shohinList.put(3,SHOP_SHOHIN_03);

            }



        // ② 以下の「shopMap.put(shohinList.get(1), 180);」の処理について、コメントを記述してください。
        /*
         * [第１引数のキーとして問題①で２番目にputしたshohihnList.get(1)を設定し、第１引数に紐づいた値として第２引数に数値（商品の金額）を設定している]
         *
         */
        LinkedHashMap<String, Integer> shopMap = new LinkedHashMap<String, Integer>();
        shopMap.put(shohinList.get(0), 125);
        shopMap.put(shohinList.get(1), 180);
        shopMap.put(shohinList.get(2), 350);
        shopMap.put(shohinList.get(3), 100);

        // ③ カリキュラムを参考に拡張for文を使って、課題の画像と同じ表示になるよう記述してください。
        // 「shohinList」と「shopMap」が保持する値を上手く利用しましょう。

        //Set<Map.Entry<String, Integer>> entry = shopMap.entrySet();
        for (Map.Entry<String, Integer> entry : shopMap.entrySet()) {
            System.out.println(entry.getKey()+"="+entry.getValue()+"になります！");
        }
        }
        }
    }

