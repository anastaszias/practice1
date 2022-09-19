package ru.mirea.kvbo1.khabarova;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;


public class Example {
    public static void main(String[] args){
        int array1[]={5,19, 22,25,36,49,88,78,7,9};
        int sum1 = 0, sum2=0, j=0;
        System.out.println(Array.summa1(array1)+Array.srdn(array1)+" ");
        Scanner input=new Scanner(System.in);
        int size = input.nextInt();
        int array2[]=new int[size];
        System.out.println("\nВведите элементы массива: ");
        for(int i=0;i<size; i++){
            array2[i]=input.nextInt();
        }
        System.out.println("\nЭлементы массива введены");
        System.out.println("\nСумма ведённого массива: "+Array.summ2(array2)+Array.getMin(array2)+Array.getMax(array2));
        for(int i=1;i<11;i++){
            System.out.println(1./i);
        }
        int fact = input.nextInt();
        System.out.println("\nФакториал данного числа:"+Factorial.calculateFactorial(fact));
    }
}
