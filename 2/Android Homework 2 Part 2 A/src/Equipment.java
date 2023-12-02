/**
 * ..
 *
 * @author 2023210515
 * @date 2023/11/5
 * 16:25
 */
public class Equipment {
    public double addHp;
    public double addDefend;
    public double addAttack;
    public double reduceDefend;
    public double reduceAttack;
    public double reduceHp;
    public String name;
    public Equipment(String name, double addHp, double addDefend, double addAttack, double reduceAttack, double reduceDefend, double reduceHp){
        this.name = name;
        this.addAttack = addAttack;
        this.addDefend = addDefend;
        this.addHp = addHp;
        this.reduceAttack = reduceAttack;
        this.reduceHp = reduceHp;
        this.reduceDefend = reduceDefend;
    }
}
class Equipment1 extends Equipment {
    public Equipment1() {
        super("Equ1", 1.5, 1.05, 1.1, 1, 1, 1);
    }

}
class Equipment2 extends Equipment{

    public Equipment2() {
        super("Equ2", 1, 1.25, 1.2, 1, 1, 1);
    }
}
class Equipment3 extends Equipment{

    public Equipment3() {
        super("Equ3", 0.8, 1.3, 0.9, 0.9, 0.9, 0.9);
    }
}
class Equipment4 extends Equipment{

    public Equipment4() {
        super("Equ4", 0.5, 3, 3, 0.5, 0.5, 0.5);
    }
}
class Equipment5 extends Equipment{

    public Equipment5() {
        super("Equ5", 2, 1, 1, 1.1, 1.1, 1.1);
    }
}

class Equipment6 extends Equipment{

    public Equipment6() {
        super("Random", Math.random()*2, Math.random()*2, Math.random()*2, Math.random()*2, Math.random()*2, Math.random()*2);
    }
}

class Equipment0 extends Equipment{
    public Equipment0(){
        super(" ", 1, 1, 1, 1, 1, 1);
    }
}