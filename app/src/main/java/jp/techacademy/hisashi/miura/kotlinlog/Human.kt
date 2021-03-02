package jp.techacademy.hisashi.miura.kotlinlog

class Human: Animal {

    // superで親クラスのコンストラクタを呼ぶ
    constructor(name: String, age: Int): super(name, age) {
    }

    override fun say() {
        super.say()
    }
}