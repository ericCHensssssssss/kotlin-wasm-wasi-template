import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.datetime.Clock



// 使用示例
@WasmExport
fun myTest() {

    println("the time is")


    val job = GlobalScope.launch() {
        while (true){
            println("runing")
            delay(6000)
            println("it is runing：")
        }

    }


}




