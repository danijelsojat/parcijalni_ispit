class Kamion(color: String, year: Int): Vozilo(color, year) {
    override fun vozi() {
        println("Kamion vozi")
    }

    override fun parkiraj() {
        println("Kamion se parkira")
    }

    override fun ubrzaj() {
        println("Kamion ubrzava")
    }

    override fun zaustaviSe() {
        println("Kamion se zaustavlja")
    }
}