fun main(){
    var name="Akirachix"
    var t=name[0].toString()+name[2]+name[3]
    println(t)
    var y=param("Wanda",22)
    println(y)
    var v=details("wanda")
    println(v.count())
    var b=myself("Elizabeth")

}
fun param(name:String,age:Int):String{
    var h=("Hi,my name is $name and i am $age years old")
    return h
}
fun details(name: String):String{
    var name="wanda"
    return name

}
fun myself(name: String){
    if (name=="Elizabeth")
        println("That's me")
    else
        println("I don't know who that is")
}