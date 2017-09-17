package jp.techacademy.daisuke.kobayashi.javalog;

/**
 * Created by kobayashidaisuke on 2017/09/17.
 */

import android.util.Log;



class BigDog extends Dog{

    static String to_jp = "大型犬";

    public BigDog(String name,int age){
        super(name,age);
    }

    public static void introduce(){
        Log.d("javatest","これは大型犬くらすです");
    }
}
