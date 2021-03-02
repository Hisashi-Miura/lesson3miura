package jp.techacademy.hisashi.miura.kotlinlog

import android.util.Log

abstract class Animal {
    // プロパティ
    var name: String
    var age: Int

    // 引数付きコンストラクタ
    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }
    // メソッド
    fun say() {
        Log.d("kotlintest","私の名前は" this.name + "です。 年は" + this.age + "です。")
    }
}