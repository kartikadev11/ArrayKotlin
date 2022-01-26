fun main(){
    val buah :Array<String> = arrayOf("Mangga","pisang","pepaya")
    println(buah.size) // menampilkan size dari array atau jumlah isi array
    println(buah.get(0)) //memanggil array index ke-0
    println(buah[0]) // memanggil array index ke 0
    buah.set(0,"Nangka") // mengubah isi array index ke 0
    buah[1]="Nanas"
    println(buah[0])


    val arrayNuls: Array<Any?> = arrayOfNulls(2)
    arrayNuls[0]="bambang"
    arrayNuls[1]="Udin"
    println(arrayNuls[0])


    val data: Array<Any?> = arrayOfNulls(10)
    data[0]=1
    data[1]=2
    data[2]=3
    data[3]=4
    data[4]=5
    data[5]=6
    data[6]=7
    data[7]=8
    data[8]=9
    data[9]=10
//    println(data.toList())
    val arrayNum: Array<Int> = arrayOf(1,2,3,4,5,6,7,8,9,10)
    println(arrayNum.filter {it>2})
//    println(arrayNum[arrayNum.size-1])
//    println(arrayNum[9])

    //Function Tanpa Nama
    val  lambda= Array<Int>(5){it}
    val  lambda2= Array<Int>(5){it+2}

    //Selisih
    val  lambda3= Array<Int>(5){it+2}
    println(lambda.toList())
    println(lambda2.toList())
    println(lambda3.toList())
    val mylist: List<String> = listOf("Saya","Kamu")
//    List=Immutable
    // arrayList, mutableList = bisa diubah
    val myList2: ArrayList<String> = arrayListOf("saya","kamu")
    myList2[1]="Engkau"
    println(myList2)
    println(mylist)

}