package example

class Access {
  private def m1 = ???
  private[this] def m2 = ???
  private[Access] def m3 = ???
  protected def m4 = ???
  protected[this] def m5 = ???
  protected[example] def m6 = ???
  def m7 = ???

  private val mv1 = ???
  private[this] val mv2 = ???
  private[Access] val mv3 = ???
  protected val mv4 = ???
  protected[this] val mv5 = ???
  protected[example] val mv6 = ???
  val mv7 = ???

  private var mr1 = ???
  private[this] var mr2 = ???
  private[Access] var mr3 = ???
  protected var mr4 = ???
  protected[this] var mr5 = ???
  protected[example] var mr6 = ???
  var mr7 = ???
}
