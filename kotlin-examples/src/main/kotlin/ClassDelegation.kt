class LowerCaseString(val str: String) : CharSequence by str {

    override fun toString() = str.toLowerCase()

    override fun get(index: Int) = str.get(index).toLowerCase()

}