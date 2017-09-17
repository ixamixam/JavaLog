package jp.techacademy.daisuke.kobayashi.javalog;
import android.util.Log;

/**
 * Created by kobayashidaisuke on 2017/09/16.
 */

class Human extends Animal implements Thinkable{

    static String to_jp = "人"; //staticをつけると、クラスから呼び出し可

    String name;
    String hobby;
    int age;

    // コンストラクタ
    public Human(String name,String hobby,int age){
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    // sayメソッド
    public void say(){
        Log.d("javatest","私の名前は" + this.name + "です。年は" + this.age + "歳です");
    }

    // thinkメソッド
    public void think(){
        Log.d("javatest","私は" + this.hobby + "について考える");
    }
}
