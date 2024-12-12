

fun test(vararg persons:Person){
    println("test")
}


fun add(vararg persons: Any){

    val persons = persons[0] as Array<Person>


    // this call is ok
//    test(*persons)
//
//    // the method call will fail during the compilation
//    test(*(persons)[0] as Array<Person>)
}



// 使用示例
@WasmExport
fun myCustomEntryPoint() {

    add(arrayOf(Person("Tom", 20), Person("Jerry", 30)))

  }




