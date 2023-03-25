package com.uniba.mv.sudokuapp.domain

import java.util.LinkedList
import java.io.Serializable

data class SudokuPuzzle(
    val boundary: Int,
    val difficulty: Difficulty,
   // val graph: LinkedHashMap<Int, LinkedList<SudokuNode>> = buildNewSudoku(boundary, difficulty).graph,
    var elapsedTime: Long = 0L
) : Serializable {
    //fun getValue(): LinkedHashMap<Int, LinkedList<SudokuNode>> = graph
}
