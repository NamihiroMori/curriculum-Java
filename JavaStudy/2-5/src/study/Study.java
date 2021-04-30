package study;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 本課題では、コレクションフレームワークのList系クラスとMap系クラスの基本的な記述を学びましょう。
 * 現場で必ず使用するものなので、ポイントをしっかり押さえておきましょう。
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
        List<String> shohinList = new ArrayList<String>() {
            {
                add(SHOP_SHOHIN_00);
                add(SHOP_SHOHIN_01);
                add(SHOP_SHOHIN_02);
                add(SHOP_SHOHIN_03);
            }
        };
        
        // ② 以下の「shopMap.put(shohinList.get(1), 180);」の処理について、コメントを記述してください。
        /*
         * キー(String)と値(Integer)を持つLinkedHashMapのインスタンス shopMap を生成し、
         * キーに shohinList の2番目の要素(=牛乳)を、値に 180 を設定して追加
         *
         */
        LinkedHashMap<String, Integer> shopMap = new LinkedHashMap<String, Integer>();
        shopMap.put(shohinList.get(0), 125);
        shopMap.put(shohinList.get(1), 180);
        shopMap.put(shohinList.get(2), 350);
        shopMap.put(shohinList.get(3), 100);

        // ③ カリキュラムを参考に拡張for文を使って、課題の画像と同じ表示になるよう記述してください。
        // 「shohinList」と「shopMap」が保持する値を上手く利用しましょう。
        for (Map.Entry<String, Integer> shop : shopMap.entrySet()) {
            System.out.println(shop.getKey() + "=" + shop.getValue() + "円になります！");           
        }
    }
}