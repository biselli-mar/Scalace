package models.cardComponent.enums

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers._


class SuitSpec extends AnyWordSpec:
    "A Suit" should {
        "have a color" in {
            Suit.Hearts.color should be(CardColor.Red)
            Suit.Diamonds.color should be(CardColor.Red)
            Suit.Clubs.color should be(CardColor.Black)
            Suit.Spades.color should be(CardColor.Black)
            // Jokers are a special suit with no color
            Suit.Joker.color should be(CardColor.Blank)
        }
        "have a string representation" in {
            Suit.Hearts.toString should be("Hearts")
            Suit.Diamonds.toString should be("Diamonds")
            Suit.Clubs.toString should be("Clubs")
            Suit.Spades.toString should be("Spades")
            Suit.Joker.toString should be("Joker")
        }
        "have a single letter representation" in {
            // These unicode characters are to be used in the console output
            Suit.Hearts.toLetter should be("♥")
            Suit.Diamonds.toLetter should be("♦")
            Suit.Clubs.toLetter should be("♣")
            Suit.Spades.toLetter should be("♠")
            Suit.Joker.toLetter should be("R")
        }
        "have a method to check if it is red" in {
            Suit.Hearts.isRed should be(true)
            Suit.Diamonds.isRed should be(true)
            Suit.Clubs.isRed should be(false)
            Suit.Spades.isRed should be(false)
            Suit.Joker.isRed should be(false)
        }
        "have a method to check if it is black" in {
            Suit.Hearts.isBlack should be(false)
            Suit.Diamonds.isBlack should be(false)
            Suit.Clubs.isBlack should be(true)
            Suit.Spades.isBlack should be(true)
            Suit.Joker.isBlack should be(false)
        }
        "have a method to check if it has no color" in {
            Suit.Hearts.isBlank should be(false)
            Suit.Diamonds.isBlank should be(false)
            Suit.Clubs.isBlank should be(false)
            Suit.Spades.isBlank should be(false)
            Suit.Joker.isBlank should be(true)
        }
        "have a method to check if it is a joker" in {
            Suit.Hearts.isJoker should be(false)
            Suit.Diamonds.isJoker should be(false)
            Suit.Clubs.isJoker should be(false)
            Suit.Spades.isJoker should be(false)
            Suit.Joker.isJoker should be(true)
        }
        "be comparable on equality" in {
            Suit.Hearts.equals(Suit.Hearts) should be(Suit.Hearts == Suit.Hearts)
            Suit.Hearts == Suit.Hearts should be(true)
            Suit.Hearts == Suit.Diamonds should be(false)
            Suit.Hearts == Suit.Clubs should be(false)
            Suit.Hearts == Suit.Spades should be(false)
            Suit.Hearts == Suit.Joker should be(false)

            Suit.Diamonds == Suit.Hearts should be(false)
            Suit.Diamonds == Suit.Diamonds should be(true)
            Suit.Diamonds == Suit.Clubs should be(false)
            Suit.Diamonds == Suit.Spades should be(false)
            Suit.Diamonds == Suit.Joker should be(false)

            Suit.Clubs == Suit.Hearts should be(false)
            Suit.Clubs == Suit.Diamonds should be(false)
            Suit.Clubs == Suit.Clubs should be(true)
            Suit.Clubs == Suit.Spades should be(false)
            Suit.Clubs == Suit.Joker should be(false)

            Suit.Spades == Suit.Hearts should be(false)
            Suit.Spades == Suit.Diamonds should be(false)
            Suit.Spades == Suit.Clubs should be(false)
            Suit.Spades == Suit.Spades should be(true)
            Suit.Spades == Suit.Joker should be(false)

            Suit.Joker == Suit.Hearts should be(false)
            Suit.Joker == Suit.Diamonds should be(false)
            Suit.Joker == Suit.Clubs should be(false)
            Suit.Joker == Suit.Spades should be(false)
            Suit.Joker == Suit.Joker should be(true)
        }
    }
