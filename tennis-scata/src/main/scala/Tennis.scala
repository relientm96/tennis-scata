object Tennis {

  def incrementScore(playerScore: Int): Int = {
    val isLessThan30 = if (playerScore < 30) true else false
    isLessThan30 match {
      case true  => playerScore + 15
      case false => playerScore + 10
    }
  }

  def scoreGame(gameResults: List[Int]): (Int, Int, String) = {
    val initialScore = 0
    val player1CumulativeScore = gameResults.foldLeft(initialScore) {
      (score, player) => incrementScore(score)
    }
    val player2CumulativeScore = gameResults.foldLeft(initialScore) {
      (score, player) => incrementScore(score)
    }
    val winner =
      if (player1CumulativeScore > player2CumulativeScore) "player1"
      else "player2"
    return (player1CumulativeScore, player2CumulativeScore, s"$winner wins!")

  }
}
