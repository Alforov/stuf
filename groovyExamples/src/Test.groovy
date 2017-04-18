/**
 * Created by mikhail_alferov on 12.04.2017.
 */
class Test {
    public static void main(String[] args) {
        def strings = new ArrayList<String>()
        strings.add("1")
        strings.add("2")
        strings.add("3")
        strings.add("4")
        strings.findAll{true}?.each {a->
            if(a == "2") strings.add(strings.indexOf(a),"5")
            println 'size' + strings.size()
            println a
        }
        println strings
    }

}
