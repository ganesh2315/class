package com.company;

public class Main {

    public static void main(String[] args) {
      Person myperson=new Person("Ganesh",23,4);
      Person secondperson=new Person("Aparna",23,67);
        System.out.println("GetClass:" +myperson.getClass().getSimpleName());
        System.out.println("hashcode:" +myperson.hashCode());

        if (myperson.equals(secondperson)){
            System.out.println("this two are the same");
        }else {
            System.out.println("not the same objects");
        }
        System.out.println("toString :" +myperson.toString());
    }
}
