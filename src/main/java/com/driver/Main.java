package com.driver;

public class Main {

    public void main(String[] args) {
        Product p = new Product();

        p.product(5,6);
        p.product(6,3,4);
        p.product(5.2,5.2);
    }
    class Product{
        public int product(int x, int y) {
            return x*y;
        }
        public int product(int x, int y, int z) {
            return x*y*z;
        }
        public double product(double x, double y) {
            return x*y;
        }
    }
}