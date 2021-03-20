fun main() {
    /** 装饰器模式 */
    val circle: Shape = Circle()
    val redCircle: ShapeDecorator = RedShapeDecorator(Circle())
    val redRectangle: ShapeDecorator = RedShapeDecorator(Rectangle())
    println( "涛涛姐姐要一个普普通通的圆")
    circle.draw()

    println( "煜姐想要一个好红的圆")
    redCircle.draw()

    println("伟大的哲神说要有红色的长方形，于是有了")
    redRectangle.draw()
}