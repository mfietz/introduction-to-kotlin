class LowerCaseString(val str: String) : CharSequence by str {

    override fun toString(): String {
        return str.toLowerCase()
    }
}