package com.company;

public class Zoopark {
    private Tiger tiger;
    private Lion lion;
    private Giraffe giraffe;

    public void setTiger(Tiger tiger) {
        this.tiger = tiger;
    }

    public void setLion(Lion lion) {
        this.lion = lion;
    }

    public void setGiraffe(Giraffe giraffe) {
        this.giraffe = giraffe;
    }

    @Override
    public String toString() {
        return "Zoopark{" +
                "tiger=" + tiger +
                ", lion=" + lion +
                ", giraffe=" + giraffe +
                '}';
    }
}
