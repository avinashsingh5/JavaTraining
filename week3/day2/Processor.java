class Processor {
    int x , y;
    void intialize(int x,int y){
        this.x = x;
        this.y = y;
    }
    void update(int x, int y){
        this.x = x;
        this.y = y;
    }
    void display(){
        System.out.println(this.x);
        System.out.println(this.y);
    }
    void process(){
         this.intialize(0,0);
        this.update(2,7);
        this.display();
    }
    public static void main(String[] args) {
        Processor p1 = new Processor();
       p1.process();
    }
}