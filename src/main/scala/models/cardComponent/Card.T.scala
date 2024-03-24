package models
package cardComponent

import enums.{Suit,Rank}


/**
  * Represents a card with a suit and a rank.
  * 
  * Depending on variations of the game, a card can have different ranks.
  * By overriding the methods `isSpecialCard` and `canBePlacedOn`
  * you can define the behavior of the cards.
  * 
  * @param suit the cards suit (Hearts, Diamonds, Clubs, Spades, Joker)
  * @param rank the cards rank (Two to Ace)
  **/
trait Card(val suit: Suit, val rank: Rank):
    /**
      * Special cards trigger unique events in the game.
      * @return true if the card is a special card, false otherwise
      */
    def isSpecialCard: Boolean
    /**
      * Determines if the card can be placed on another card.
      * @param other the card to be placed on
      * @return true if the card can be placed on the other card, false otherwise
      */
    def canBePlacedOn(other: Card): Boolean
