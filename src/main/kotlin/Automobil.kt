class Automobil(color: String, year: Int): Vozilo(color, year) {

    companion object{
        var garage = arrayListOf<Automobil>()
        fun minYear(){
            println("Min year of cars in garage is: ${garage.minBy { it.year }.year}")
        }
        fun maxYear(){
            println("Max year of cars in garage is: ${garage.maxBy { it.year }.year}")
        }
        fun avgYear(){
            var sum = 0.0
            for (car in garage){
                sum += car.year
            }
            println("Average year of cars in garage is: ${sum / garage.size}")
        }
    }
    init {
        garage.add(this)
    }
    override fun vozi() {
        println("Auto vozi")
    }

    override fun parkiraj() {
        println("Auto se parkira")
    }

    override fun ubrzaj() {
        println("Auto ubrzava")
    }

    override fun zaustaviSe() {
        println("Auto se zaustavlja")
    }
}