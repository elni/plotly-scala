package plotly

package layout

import dataclass.data

@data class Grid(
  rows: Option[Int],
  columns: Option[Int],
  pattern: Option[String]
)

object Grid {

  def apply(
    rows: Int = 1,
    columns: Int = 1,
    pattern: String = "independent"
  ): Grid = new Grid(
    Option(rows),
    Option(columns),
    Option(pattern)
  )
}
