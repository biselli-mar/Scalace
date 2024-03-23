package models
package cardComponent
package enums

enum Rank(val value: Int):
  case Two extends Rank(2)
  case Three extends Rank(3)
  case Four extends Rank(4)
  case Five extends Rank(5)
  case Six extends Rank(6)
  case Seven extends Rank(7)
  case Eight extends Rank(8)
  case Nine extends Rank(9)
  case Ten extends Rank(10)
  case Jack extends Rank(11)
  case Queen extends Rank(12)
  case King extends Rank(13)
  case Ace extends Rank(14)
  def isFace: Boolean = this match
    case Jack | Queen | King | Ace => true
    case _                         => false
  def isNumber: Boolean = !isFace
  override def equals(other: Any): Boolean =
    other match
      case that: Rank => this.value == that.value
      case _          => false
  def >(other: Rank): Boolean = this.value > other.value
  def <(other: Rank): Boolean = this.value < other.value
  def >=(other: Rank): Boolean = this.value >= other.value
  def <=(other: Rank): Boolean = this.value <= other.value
  def toLetter: String = this match
    case Two   => "2"
    case Three => "3"
    case Four  => "4"
    case Five  => "5"
    case Six   => "6"
    case Seven => "7"
    case Eight => "8"
    case Nine  => "9"
    case Ten   => "10"
    case Jack  => "J"
    case Queen => "Q"
    case King  => "K"
    case Ace   => "A"
