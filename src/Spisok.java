



public class Spisok {
    Element head;
    Spisok(int znach){
        head=new Element(znach);
    }
    void add(int znach){
        Element b=new Element(znach);
        Element a=head;
        b.setNext(a);
        head=b;
    }
    void remove(){
        Element a=head.getNext();
        head=a;
    }

    public Element getHead() {
        return head;
    }
}
