class RedShapeDecorator(decoratedShape: Shape)
    : ShapeDecorator(decoratedShape) {
    override fun draw() {
        super.draw()
        setRedBorder(decoratedShape)
    }

    private fun setRedBorder(decoratedShape: Shape) {
        println( "加点红色")
    }
}