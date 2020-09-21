
package com.itheima.day9_18;
public  enum Season {
    SPRING("春"){
        @Override
        public void show() {
            System.out.println(name);
        }
    },
    SUMMER("夏"){
        @Override
        public void show() {
            System.out.println(name);
        }
    },
    AUTUMN("秋"){
        @Override
        public void show() {
            System.out.println(name);
        }
    },
    WINTER("冬"){
        @Override
        public void show() {
            System.out.println(name);
        }
    };
    public String name;

    private Season(String name){
        this.name=name;
    }
    public abstract void show();
}

