fun main(args: Array<String>) {
    var nullSafename: String = "Kotlin"
    nullSafename.length // guaranteed to not cause an NPE
    // nullSafename = null // compilation error

    var nullableName: String? = "Kotlin"
    //nullableName.length // compilation error
    nullableName = null

    val company = Company()
    val length: Int? = company?.department?.team?.name?.length

    val name: String? = null
    val nameLength: Int = name?.length ?: -1
}


private class Company {
    var department: Department? = null
}

private class Department {
    var team: Team? = null
}

private class Team {
    var name: String? = null
}