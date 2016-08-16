package com.company.builder;

/**
 * Simple class that has a lot of field
 */
public class Creature {
    private String head;
    private String hands;
    private int legs;
    private int tailLength;

    public Creature(Builder builder) {
        this.hands = builder.hands;
        this.head = builder.head;
        this.legs = builder.legs;
        this.tailLength = builder.tailLength;
    }

    public static class Builder {
        private String head;
        private String hands = "big hands";
        private int legs = 3;
        private int tailLength = 100;

        public Builder(String head) {
            this.head = head;
        }

        public Builder hands(String hands) {
            this.hands = hands;
            return this;
        }

        public Builder legs(int legsCount) {
            this.legs = legsCount;
            return this;
        }

        public Builder tail(int length) {
            this.tailLength = length;
            return this;
        }

        public Creature build() {
            return new Creature(this);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "head='" + head + '\'' +
                    ", hands='" + hands + '\'' +
                    ", legs=" + legs +
                    ", tailLength=" + tailLength +
                    '}';
        }
    }
}
