import kotlin.random.Random

class TruthAndDare {

    private var numberOfPlayers :Int = 0
    private var isTruth : Boolean? = null
    private var isDare : Boolean? = null

    fun play(){
        println("Enter the number of players.")
        numberOfPlayers = readLine()!!.toInt()

        val randomNumber = Random.nextInt(1,numberOfPlayers + 1)
        println("It's player $randomNumber's turn!")

        truthDare()
    }

    private fun truthDare(){

        val random =  Random.nextInt(1,11)
        println("Choose - Truth(T/t) or  Dare(D/d)")
        val n = readLine()

        if (n == "T" || n == "t"){
            isTruth = true
        }
        else if (n == "D" || n == "d"){
            isDare = true
        }
        else{
            println("Try again!")
            truthDare()
        }

        if (isTruth == true){

            when (random){

                1 -> println("Tell us your crush's name.")
                2 -> println("How many babies you want and why?")
                3 -> println("Tell us your your guilty pleasure.")
                4 -> println("What crime you did in your childhood.")
                5 -> println("Who would you choose to be dead from your playmates.")
                6 -> println("What is your deepest secret you haven't told to anyone.")
                7 -> println("Who do you love the most.")
                8 -> println("What is your nick name at home.")
                9 -> println("Tell us your lucky number and why.")
                10 -> println("If you can marry anyone from this world, who would you choose and why?")
            }

        }
        if (isDare == true){

            when (random){


                1 -> println("Do a monkey scratch.")
                2 -> println("Slap the person on your left.")
                3 -> println("Dance like a moron.")
                4 -> println("Do salute to the person on your right.")
                5 -> println("Say 'I am an idiot!'.")
                6 -> println("Spank your ass!")
                7 -> println("Slap yourself.")
                8 -> println("Place your shoes on your head.")
                9 -> println("Smell the socks of the person on you right.")
                10 -> println("Propose anyone.")

            }
        }

        isDare = false
        isTruth = false
    }





}