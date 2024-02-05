package org.example

class Data{
    lateinit var name : String
    var age : Int = 0

    fun setData(inname:String,inage:Int){
        name = inname
        age = inage
    }
}