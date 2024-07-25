package com.gmail.eamosse.tp2


class LocalStudentManager : StudentManager {
    private val students = mutableListOf(
        Student(name = "John1", code = "A1", sexe = "M", address = "Lilles", age = 20),
        Student(name = "John2", code = "A2", sexe = "F", address = "Lilles", age = 30),
        Student(name = "John3", code = "A3", sexe = "F", address = "Lilles", age = 41),
        Student(name = "John4", code = "A4", sexe = "M", address = "Lilles", age = 42),
        Student(name = "John5", code = "A5", sexe = "M", address = "Lilles", age = 34),
        Student(name = "John6", code = "A6", sexe = "F", address = "Lilles", age = 12),
        Student(name = "John7", code = "A7", sexe = "M", address = "Lilles", age = 28),
        Student(name = "John8", code = "A8", sexe = "M", address = "Lilles", age = 16),
        Student(name = "John9", code = "A9", sexe = "F", address = "Lilles", age = 10),
        Student(name = "John10", code = "A10", sexe ="F", address = "Lilles", age = 56)
    )

    override fun listOf10(): List<Student> {
        return  students
    }

    override fun sortAgeAscDesc(type: String): List<Student> {
        return when(type.lowercase()){
            "asc" -> students.sortedBy { it.age }
            "desc" -> students.sortedByDescending { it.age }
            else -> throw IllegalArgumentException("Le type doit être asc ou desc")
        }
    }

    override fun groupBySex(): Map<String, List<Student>> {
        return students.groupBy { it.sexe }
    }

    override fun boysOrGirls(sexe: String): List<Student> {
        return students.filter { it.sexe.equals(sexe, ignoreCase = true) }
    }

    override fun onlyNames(): List<String> {
        return students.map { it.name }
    }

    override fun deleteBySex(sex: String) {
        students.removeAll { it .sexe.equals(sex, ignoreCase = true) }
    }

    override fun reverse(): List<Student> {
        return students.reversed()
    }

    override fun clear() {
        students.clear()
    }
}