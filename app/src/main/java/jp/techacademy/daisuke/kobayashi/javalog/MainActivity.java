package jp.techacademy.daisuke.kobayashi.javalog;

import android.support.v7.app.AppCompatActivity; //import class名で他クラスを利用
import android.os.Bundle;
import android.util.Log;

//アクセスコントロール classキーワード 新規クラス名 extendsキーワード 継承元のクラス {...}
//MainActiviyクラスは親であるAppCompatActivityクラスの機能を引き継いでいる
public class MainActivity extends AppCompatActivity {

    //@Overrideはオーバーライド（上書き）しているメソッドである
    @Override

    //アクセスコントロール 戻り値の型 関数名(引数) {...},voidは値を返さない
    protected void onCreate(Bundle savedInstanceState) {

        //呼び出し元.関数名(引数),superは継承元クラスの関数を呼び出し
        //superは子クラスのonCreate内で親クラスのonCreateを呼び出すような場合でのみ使用
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human me = new Human("小林","プログラム",35);    //クラス、名前　

        me.say();
        me.think();

    }
}
