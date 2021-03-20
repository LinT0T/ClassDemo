abstract class ShapeDecorator(var decoratedShape: Shape) : Shape {
    override fun draw() {
        decoratedShape.draw()
    }
}