import kotlinx.datetime.Clock



// 使用示例
@WasmExport
fun myTest() {

    val now = Clock.System.now()
    println("the time is"+now)

  }




