class InteroperabilityKt {

    fun accessMap() {
        val list = ArrayList<String>()
        val value: String? = list.get(0)
    }

    fun accessMutableList() {
        val mutableList: List<String> = Interoperability.mutableList()
        val mutableList2: MutableList<String> = Interoperability.mutableList()
    }

}