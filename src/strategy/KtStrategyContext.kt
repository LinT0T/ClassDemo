class KtStrategyContext(internal var strategy: KtStrategy) {
    fun executeStrategy(num1: Int, num2: Int): Int {
        return strategy.doOperation(num1, num2);
    }
}