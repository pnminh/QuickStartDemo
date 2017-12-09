package com.minh;

class TestRename {
    private int test;
    private boolean isTest=true;

    public boolean isTest() {
        return isTest;
    }

    public void setTest(boolean test) {
        isTest = test;
    }

    public int getTest() {
        return test;
    }

    public void setTest(int test) {
        this.test = test;
    }

    private static String MINH = "Minh";
    public static void main(String[] args) {
	// write your code here
        boolean a = true;
        System.out.printf("My intention is: %s", a);
        System.out.print("Not everyone knows this");
        System.out.println("Hello every one");
        System.out.println("My book is here");
        hello(new Name("Minh", "Ngoc", "Pham"));
        for (int i = 0; i <12 ; i++) {
            System.out.println("Print for "+i+" times");
        }
        String ab;
        try {
            ab = "hello";
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("");
    }
    private static void hello(Name name){
        System.out.printf("Hello %s %s %s%n", name.getFirstName(), name.getMiddleName(), name.getLastName());
    }
}
