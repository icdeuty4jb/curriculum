package study;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * 本課題では、基本的な日付操作クラスの使い方を学びましょう。
 *
 * 問①から問③まであります。
 * 問②に関しては、コメントを記述してください。
 *
 * ※この課題に関しては課題実施日によって結果が異なるため、出力結果が個々で異なります。
 */
public class Study {

    public static void main(String args[]) {

        // Dateクラスのインスタンスを生成
        Date now = new Date();

        // 問① ローカル変数「now」を使用し、本日の日付を表示してください。
        System.out.println(now);

        // Calendarクラスのインスタンスを生成
        Calendar calendar = Calendar.getInstance();

        // 問② 「(Calendar.MONTH) + 数値」の処理は、想定していない値となる可能性があります。
        // その理由をコメントへ記述してください。
        // [例えば繰り上げや繰り下げを実装したい場合に、月の値が12を超えてくると13月などの存在しない月が表示されてしまうことがあるため。]
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH) + 1);
        System.out.println(calendar.get(Calendar.DATE));
        // 問③ 上記の「calendar」を使用し、本日から1年2ヶ月15日先の日付を表示しなさい。
        // - この課題に関しては課題実施日によって結果が異なりますので、Wiki課題の画像とは結果が異なります。
        // - また、うるう年の場合は設定内容が正しくとも日付がズレて表示される可能性があります。
        calendar.add(Calendar.YEAR,1);
        calendar.add(Calendar.MONTH,2);
        calendar.add(Calendar.DATE,15);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DATE));


        // うるう年判定
        printLeapYear(calendar.get(Calendar.YEAR));
    }

    /**
     * うるう年判定
     * 問③で日付がズレる可能性があるため補足として出力
     * @param year
     */
    private static void printLeapYear(final int year) {
        System.out.println(year + "年は、うるう年" + (Year.isLeap(year) ? "です。" : "ではありません。"));
    }
}

//以下コンソールに表示する内容
//Wed May 15 14:32:34 JST 2019（課題実施日により結果は異なります）
//2019
//5
//15
//2020
//7
//30
//2020年はうるう年です。
