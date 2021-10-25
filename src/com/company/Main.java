package com.company;

public class Main {
    public int array[];
    public Main(int N){
        array=new int[N];
        array[0]=0;
        array[1]=1;
        for (int i=2;i<N;i++)
            array[i]=array[i-1]+array[i-2];
    }
    public String toString(){
        String result="";
        for (int i:array){
            result+=i+" ";
        }
        return result;
    }
    public static void main(String[] args) {
	    int N=30;
        Main fibo=new Main(N);
        String strFibo=fibo.toString();
        System.out.println(strFibo);
    }
}
