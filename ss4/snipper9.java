package com.company.ss4;

public class snipper9 {
    enum Cards {Spade, Heart, Diamond, Club}

    public static void main(String[] args) {
        Cards card = Cards.Diamond;
        switch (card) {
            case Spade:
                System.out.println("SPADE");
                break;
            case Heart:
                System.out.println("HEART");
                break;
            case Diamond:
                System.out.println("DIAMOND");
                break;
            case Club:
                System.out.println("CLUB");
                break;
        }
    }
}
