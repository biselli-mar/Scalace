package models
package cardComponent
package enums

enum CardColor:
  case Red, Black

enum Suit(val color: CardColor):
  case Hearts extends Suit(CardColor.Red)
  case Diamonds extends Suit(CardColor.Red)
  case Clubs extends Suit(CardColor.Black)
  case Spades extends Suit(CardColor.Black)
  def isRed: Boolean = this.color == CardColor.Red
  def isBlack: Boolean = this.color == CardColor.Black
  def toLetter: String = this match
    case Hearts   => "♥"
    case Diamonds => "♦"
    case Clubs    => "♣"
    case Spades   => "♠"
