package Kotlin_07_MutableListApp

fun main(){


    val tasks = mutableListOf<String>()

    var lock = true

    while (lock){

        println("Insert command: (add, viewlist, modify, delete, exit)")
        val command = readln().lowercase()

        when(command){
            "add" -> {
                println("Add title of task")
                val task = readln()
                tasks.add(task)
                println("The tash $task added successfully")
            }

            "viewlist" -> {
                println("List of tasks: ")
                tasks.forEachIndexed { index, task -> println("$index $task") }
            }

            "modify" -> {
                try{
                    println("Insert index of task you want to modify:")
                    val index = readln().toInt()
                    println("Insert new title of new task:")
                    val newTask = readLine()!!
                    tasks[index] = newTask
                    println("Task updated")
                } catch (e: Exception){
                    println("Index not valid")
                }
            }

            "delete" -> {
                try {
                    println("Insert index of task you want to delete: ")
                    val index = readln().toInt()
                    tasks.removeAt(index)
                    println("Task deleted successfully")
                } catch (e : Exception){
                    println("Index not valid")
                }
            }

            "exit" -> lock = false
            else -> println("Unknown command")
        }

    }


}