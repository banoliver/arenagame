package arenagame.character;

import arenagame.items.WearableItem;

public class Body {

    private WearableItem head;

    private WearableItem chest;

    private WearableItem leftHand;

    private WearableItem rightHand;

    private WearableItem legs;

    private WearableItem feet;

    private WearableItem miscellaneous;

    public Body(WearableItem head, WearableItem chest, WearableItem leftHand, WearableItem rightHand,
                WearableItem legs, WearableItem feet, WearableItem miscellaneous) {
        this.head = head;
        this.chest = chest;
        this.leftHand = leftHand;
        this.rightHand = rightHand;
        this.legs = legs;
        this.feet = feet;
        this.miscellaneous = miscellaneous;
    }

    public WearableItem getHead() {
        return head;
    }

    public void setHead(WearableItem head) {
        this.head = head;
    }

    public WearableItem getChest() {
        return chest;
    }

    public void setChest(WearableItem chest) {
        this.chest = chest;
    }

    public WearableItem getLeftHand() {
        return leftHand;
    }

    public void setLeftHand(WearableItem leftHand) {
        this.leftHand = leftHand;
    }

    public WearableItem getRightHand() {
        return rightHand;
    }

    public void setRightHand(WearableItem rightHand) {
        this.rightHand = rightHand;
    }

    public WearableItem getLegs() {
        return legs;
    }

    public void setLegs(WearableItem legs) {
        this.legs = legs;
    }

    public WearableItem getFeet() {
        return feet;
    }

    public void setFeet(WearableItem feet) {
        this.feet = feet;
    }

    public WearableItem getMiscellaneous() {
        return miscellaneous;
    }

    public void setMiscellaneous(WearableItem miscellaneous) {
        this.miscellaneous = miscellaneous;
    }

    @Override
    public String toString() {
        return "Body{" +
                "head=" + head +
                ", chest=" + chest +
                ", leftHand=" + leftHand +
                ", rightHand=" + rightHand +
                ", legs=" + legs +
                ", feet=" + feet +
                ", miscellaneous=" + miscellaneous +
                '}';
    }
}
