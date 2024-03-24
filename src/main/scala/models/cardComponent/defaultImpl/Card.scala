package models
package cardComponent
package defaultImpl

import enums.{Suit,Rank}
import cardComponent.Card


case class CardImpl(override val suit: Suit, override val rank: Rank) extends Card(suit, rank):
    def canBePlacedOn(other: Card): Boolean = 
        if (this.isJoker) true
        else if (other.value <= this.value) true
        else false

    def isSpecialCard: Boolean =
        this.rank match
            case Rank.Two | Rank.Ten => true
            case _ => false

object CardImpl:
    def Joker: CardImpl = CardImpl(Suit.Joker, Rank.Ace)