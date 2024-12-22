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
            println("运行中22")
            delay(6000)
            println("正在运行中，当前时间：")
        }

    }


}




