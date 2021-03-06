package jp.techacademy.hisashi.miura.kotlinlog

import android.util.Log



open class Human: Animal , Thinkable{

    // superで親クラスのコンストラクタを呼ぶ
    constructor(name: String, age: Int, hobby: String): super(name, age, hobby) {
    }

    override fun say() {
        Log.d("kotlintest","私の名前は" + this.name + "です。 年は" + this.age + "です。")
        //Log.d("kotlintest", "私は人間です。")
    }

    override fun think() {
        Log.d("kotlintest","「私は" + this.hobby + "について考える。」")
    }



}