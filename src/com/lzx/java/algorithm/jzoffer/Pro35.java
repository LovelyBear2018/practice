package com.lzx.java.algorithm.jzoffer;

/**
 * 复杂链表复制
 * Created by liuzhixiong on 2018/11/8.
 */
public class Pro35 {

    public static void main(String[] args) {
        ComplexNode cn1 = new ComplexNode(1);
        ComplexNode cn2 = new ComplexNode(2);
        ComplexNode cn3 = new ComplexNode(3);
        ComplexNode cn4 = new ComplexNode(4);
        ComplexNode cn5 = new ComplexNode(5);

        cn1.next = cn2;
        cn2.next = cn3;
        cn3.next = cn4;
        cn4.next = cn5;

        cn1.sibling = cn3;
        cn2.sibling = cn5;
        cn4.sibling = cn2;

        ComplexNode complexNode = new Pro35().duplicate(cn1);
        while (complexNode != null) {
            System.out.println(complexNode + " " + complexNode.getVal() + " " + complexNode.getNext() + " " + complexNode.getSibling());
            complexNode = complexNode.next;
        }
    }

    private ComplexNode duplicate(ComplexNode complexNode) {
        ComplexNode tempNode = complexNode;
        while (tempNode != null) {
            ComplexNode node = new ComplexNode(tempNode.getVal());
            node.next = tempNode.next;
            tempNode.next = node;
            tempNode = node.next;
        }

        tempNode = complexNode;
        while (tempNode != null) {
            if(tempNode.sibling != null) {
                tempNode.next.sibling = tempNode.sibling.next;
            }
            tempNode = tempNode.next.next;
        }

        tempNode = complexNode.next;
        while (tempNode != null && tempNode.next != null) {
            tempNode.next = tempNode.next.next;
            tempNode = tempNode.next;
        }

        return complexNode.next;
    }
}

class ComplexNode {

    int val;
    ComplexNode next;
    ComplexNode sibling;

    public ComplexNode(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public ComplexNode getNext() {
        return next;
    }

    public ComplexNode getSibling() {
        return sibling;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public void setNext(ComplexNode next) {
        this.next = next;
    }

    public void setSibling(ComplexNode sibling) {
        this.sibling = sibling;
    }
}
