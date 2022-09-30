package src.inheritance;

interface inF {
    int getNum();
    default String getStr() {
        return "Default String";
    }
}

class inFimp implements inF {
    public int getNum() {
        return 117;
    }
}

class defaultDemo {
    public static void main(String[] args) {
        inFimp def = new inFimp();
        System.out.println(def.getNum());
        System.out.println(def.getStr()); //due to default declaration
    }
}