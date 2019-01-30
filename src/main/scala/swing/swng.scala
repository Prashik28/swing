package swing

import scala.swing.{Button, Dimension, MainFrame}

object swng extends App {
  val frame = new MainFrame {
    title = "My first GUI"
    contents = b
    size = new Dimension(500, 500)
    centerOnScreen()
  }

  frame.visible=true
}


