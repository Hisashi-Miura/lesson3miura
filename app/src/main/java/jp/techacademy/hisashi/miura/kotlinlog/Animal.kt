package jp.techacademy.hisashi.miura.kotlinlog

import android.util.Log

abstract class Animal {
    // プロパティ
    var name: String
    var age: Int
    //var hobby: String

    // 引数付きコンストラクタ
    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
        //this.hobby = hobby
    }

    // メソッド
    abstract fun say()

}