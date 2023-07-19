package com.ohgiraffers.section02.extend;

/* 인터페이스 상속 시 implements 키워드가 아닌 extends를 사용한다. */
//public class RabbitFarm <T implements Animal>
//public class RabbitFarm <T extends Animal>
public class RabbitFarm <T extends Rabbit> {

    /* 타입 변수는 아직 어떤 토끼가 될지 모른다. 다만 토끼이거나 토끼의 후손만 가능하다. */
    private T animal;  //아직 animal라는 변수가 뭐가 될지는 모르지만 무조건 토끼나 토끼의 후손이여만 타입으로써 사용가능

    public RabbitFarm() {}

    public RabbitFarm(T animal) {
        this.animal =animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }
}
