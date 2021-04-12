object Main extends App {

  val gameResults: List[Int] = List(0, 0, 0)
  val scores1 = Tennis.scoreGame(gameResults) // Returns [0, 40]
  println(s"Game 1 Scores: $scores1")

  val gameResults2: List[Int] = List(1, 1, 1)
  val scores2 = Tennis.scoreGame(gameResults2) // Returns [40, 0]
  println(s"Game 2 Scores: $scores2")

  val gameResults3: List[Int] = List(1, 0, 1, 0, 1)
  val scores3 = Tennis.scoreGame(gameResults3) // Returns [40, 30]
  println(s"Game 3 Scores: $scores3")

  val gameResults4: List[Int] = List(1, 1, 1, 0, 0, 0)
  val scores4 = Tennis.scoreGame(gameResults4) // Returns [40, 40]
  println(s"Game 4 Scores: $scores4")

}
