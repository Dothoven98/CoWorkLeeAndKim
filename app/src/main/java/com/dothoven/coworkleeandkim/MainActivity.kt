package com.dothoven.coworkleeandkim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        testStringExtension()


        var Child2 = ChildClass2()


        Child2.answered()
        BaseClass2().answered()
        Child2.opened = "hi"





            val num = 3

            for (a in 1..num) {
                var arraystars = Array(a, { item -> ""})
                for (b in 1..a) {
                    var b = b - 1
                    arraystars[b] = "*"
                    var eachstars = arraystars[b]
                    print(eachstars)


                }

            }


        }

    }

    // String 익스텐션 테스트

    fun testStringExtension() {
        var original = "Hello"
        var added = "Guys~"
        //plus 메서드를 사용해서 문자열을 더할 수 있습니다.
        Log.d("Extension", "added를 더한 값은 ${original.plus(added)}입니다.")
    }

    fun String.plus(word: String): String {
        return this + word
    }

    open class BaseClass2 {
        open var opened: String = "I am"
        open fun answered() {
            Log.d("Extension", "${opened}")
        }
    }

    class ChildClass2 : BaseClass2() {
        override var opened: String = "You are"
        override fun answered() {
            Log.d("Extension", "${opened}")
        }
    }






