package jp.techacademy.hisashi.miura.kotlinlog

import android.util.Log



    class Human: Animal , Thinkable{
        var hobby: String //hobbyの追加

        // superで親クラスのコンストラクタを呼ぶ
        constructor(name: String, age: Int,hobby:String ): super(name, age) { //super で　nameとageのコンストラクタを呼ぶ

        this.hobby = hobby  //hobbyの定義
        }


    override fun say() {
        Log.d("kotlintest","私の名前は" + this.name + "です。 年は" + this.age + "です。")
        //Log.d("kotlintest", "私は人間です。")
    }

    override fun think() {

        Log.d("kotlintest","「私は" + this.hobby + "について考える。」")
    }



}