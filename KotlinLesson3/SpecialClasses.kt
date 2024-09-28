package example.myapp.decor

// Step 2: Use destructuring
data class Decoration2(val rocks: String, val wood: String, val diver: String)

fun makeDecorations() {
    val d5 = Decoration2("crystal", "wood", "diver")
    println(d5)

    // Assign all properties to variables.
    val (rock, wood, diver) = d5
    println(rock)
    println(wood)
    println(diver)
}

// Step 3: Recall singleton classes
interface FishColor {
    val color: String
}

object GoldColor : FishColor {
    override val color = "gold"
}

// Step 4: Create an enum
enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF);
}

enum class Direction(val degrees: Int) {
    NORTH(0), SOUTH(180), EAST(90), WEST(270)
}

fun main() {
    println(Direction.EAST.name)
    println(Direction.EAST.ordinal)
    println(Direction.EAST.degrees)
}
