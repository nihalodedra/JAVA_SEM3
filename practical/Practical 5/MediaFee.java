abstract class Media{
    int days;
    Media(int d){
        days=d;
    }
    abstract int fee();
}





class Book extends Media{
    Book(int d){
        super(d);
    }
    int fee(){
        return (days*5);
    }
}

class DVD extends Media{
    DVD(int d){
        super(d);
    }
    int fee(){
        return (days*10);
    }
}



class Magazine extends Media{ 
    Magazine(int d){
        super(d);
    }
    int fee(){
        return (days*3);
    }
}



public class MediaFee{
    public static void main(String[] args){
        Media[]m={
            new Book(2),
            new DVD(3),
            new Magazine(4)
        };
        int total=0;
        System.out.println("25AIML039");
        for (Media x:m){
            int f=x.fee();
            System.out.println("Fee= "+f);
            total=total+f;
        }
        System.out.println("Total Fee="+total);
    }
}