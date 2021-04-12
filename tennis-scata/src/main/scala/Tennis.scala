object Tennis {

  def incrementScore(playerScore: Int): Int = {
    val isLessThan30 = if (playerScore < 30) true else false
    isLessThan30 match {
      case true => playerScore + 15
      case false => playerScore + 10
    }
  }

  def scoreAPoint(player1Score: Int, player2Score: Int, playerThatScored: Int): Int = {
    playerThatScored match {
      case 0 => incrementScore(player1Score)
      case 1 => incrementScore(player2Score)
      case _ => throw new Error("Can only score a 0 or 1 result")
    }
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
