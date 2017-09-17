package jp.techacademy.daisuke.kobayashi.javalog;
import android.util.Log;


/**
 * Created by kobayashidaisuke on 2017/09/16.
 */

class Dog extends Animal implements Movable{

    static String to_jp = "犬"; //staticをつけると、クラスから呼び出し可

    String name;
    int age;

    // コンストラクタ
    public Dog(String name,int age){
        this.name = name;
        this.age = age;
    }

    public static void introduce() {  //staticをつけると、クラスから呼び出し可
        Log.d("javatest", "これは犬クラスです。");
    }


    // メソッド
    public void say(){
        Log.d("javatest",this.name + "(" + this.age + "歳）" + "ワンワン");

    }

    @Override
    public void move(){
        Log.d("javatest",this.name + "(" + this.age + ")" + "は全力で走った");
    }
}
