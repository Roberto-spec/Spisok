public class Element
{
    public int Value;
    public Element Next;
    Element(int value){
        Value=value;
        Next=null;
    }

    public Element getNext() {
        return Next;
    }

    public int getValue() {
        return Value;
    }

    public void setNext(Element next) {
        Next = next;
    }

    public void setValue(int value) {
        Value = value;
    }
    public void show(){
        System.out.print(Value+" ");
        if(Next!=null){
            Next.show();
        }
    }

}
