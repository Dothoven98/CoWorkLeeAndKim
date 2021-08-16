package com.dothoven.coworkleeandkim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*

        testStringExtension()


        var Child2 = ChildClass2()


        Child2.answered()
        BaseClass2().answered()
        Child2.opened = "hi"
        */

        var listNum = mutableListOf(7,7,3,5,2,6,1,4)
        var indexNum = 8
        var d = 1
        while (d < indexNum) {
            for (a in 0..(indexNum - d -1)) {
                if (listNum[a] > listNum[a + 1]) {
                    var b = listNum[a]
                    var c = listNum[a + 1]
                    listNum[a] = c
                    listNum[a + 1] = b

                    for (d in 0..(indexNum - 1)) {
                        print(listNum[d])
                    }
                    println()
                }
            }
            d += 1
        }
        for (d in 0..(indexNum - 1)) {
            print(listNum[d])
        }
        println("~~")


/*
        for (d in 0..(indexNum - 1)) {
            print(listNum[d])
        }
        println()
*/



/*
        val num = 3

        for (a in 1..num) {
            var arraystars = Array(a, { item -> "" })
            for (b in 1..a) {
                var b = b - 1
                arraystars[b] = "*"
                var eachstars = arraystars[b]
                print(eachstars)


            }
            println()

        }

*/
    }
}



    // String 익스텐션 테스트
/*
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
*/





