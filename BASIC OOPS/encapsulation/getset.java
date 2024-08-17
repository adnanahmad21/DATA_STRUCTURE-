class student {
    private String uid;
    private String name;
    void setName(String a) {
        this.name = a;
    }
    void setUid(String a) {
        this.uid = a;
    }
    String getName() {
        return this.name;
    }
    String getUid() {
        return this.uid;
    }
}

class getset extends student {
    public static void main(String[] args) {
        getset g1 = new getset();
        g1.setName("Adnan Ahmad");
        g1.setUid("51220131");
        System.out.println(g1.getName()+"\n"+g1.getUid());
        System.out.println(g1.getClass());
    }
}