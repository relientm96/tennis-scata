object Tennis {

  def incrementScore(playerScore: Int): Int = {
    val isLessThan30 = if (playerScore < 30) true else false
    isLessThan30 match {
      case true => playerScore + 15
      case false => playerScore + 10
    }
  }

  def chooseWinner(playerOneScore: Int, playerTwoScore: Int): String = {
    if (playerOneScore == playerTwoScore)
      throw new Error(
        "Players must have different scores if a winner needs to be chosen"
      )
    if (playerOneScore > playerTwoScore) "Player1"
    else "Player2"
  }

  def scoreGame(gameResults: List[Int]): List[List[Int]] = {
    var player1Score = 0
    var player2Score = 0

    /** The idea here that I have is to
      * Recursively go through each given result and
      * score player 1 and 2 appropriately
      */

  }

}
