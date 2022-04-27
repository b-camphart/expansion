class MoveUnit(private val messagePresenter: MessagePresenter) {
    suspend operator fun invoke(distance: Double, angle: Double) {
        messagePresenter.tooFar()
    }
}