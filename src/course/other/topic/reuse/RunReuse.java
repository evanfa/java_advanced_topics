package course.other.topic.reuse;

public class RunReuse
{
    public static void main(String[] args) {
        Tailored jacket = new Tailored();
        jacket.toString();
        jacket.getPriceClothe();
        jacket.getFee();

        Clothing[] items = new Clothing[2];
        items[0] = new Tailored();
        items[1]= new Tailored();

        for(Clothing item: items){
            item.getPriceClothe();
        }

        Clothing[] itemx = {new Tailored(), new Tailored()};
        System.out.println(itemx[1]);

    }
}
