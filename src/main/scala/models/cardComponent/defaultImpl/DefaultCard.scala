package models
package cardComponent
package defaultImpl

import enums.{Suit,Rank}
import cardComponent.Card


case class DefaultCardImpl(override val suit: Suit, override val rank: Rank) extends Card(suit, rank):
    override def canBePlacedOn(other: Card): Boolean = 
        if (other.rank.value <= this.rank.value) true
        else false

    override def isSpecialCard: Boolean =
        this.rank match
            case Rank.Two | Rank.Ten => true
            case _ => false
