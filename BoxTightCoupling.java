package com.upGrad;

public class BoxTightCoupling {
        public int volume;
        BoxTightCoupling(int length, int width, int height) {
            this.volume = length * width * height;
        }
    public void printVolumne(){
        System.out.println("Box volumne : " + this.volume);
    }
        public static void main(String[] args){
            BoxTightCoupling b = new BoxTightCoupling(10,20,30);
            b.printVolumne();
        }
}

/*
class Box{
    public void printVolumne(int l, int b, int h){
        BoxTightCoupling box = new BoxTightCoupling(l,b,h);
        System.out.println("Box volumne : " + box.volume);
    }
}
*/
