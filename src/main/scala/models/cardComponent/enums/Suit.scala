package models
package cardComponent
package enums

enum CardColor:
  case Red, Black, Blank

enum Suit(val color: CardColor):
  case Hearts extends Suit(CardColor.Red)
  case Diamonds extends Suit(CardColor.Red)
  case Clubs extends Suit(CardColor.Black)
  case Spades extends Suit(CardColor.Black)
  case Joker extends Suit(CardColor.Blank)

  def isRed: Boolean = this.color == CardColor.Red
  def isBlack: Boolean = this.color == CardColor.Black
  def isBlank: Boolean = this.color == CardColor.Blank
  def isJoker: Boolean = this == Joker

  def toLetter: String = this match
    case Hearts   => "♥"
    case Diamonds => "♦"
    case Clubs    => "♣"
    case Spades   => "♠"
    case Joker    => "R"
