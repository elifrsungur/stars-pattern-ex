public class pattern {

    public static void main(String args[])
    {
//satiri i ile sutunu j ile temsil edelim

        int i, j, row=12;

        for(i=0; i<row; i+=2)
        {

            for(j=0; j<=i; j+=2)
            {
//yildizlari yazmak için
                System.out.print("* ");
            }
//yildiz satirlari arasinda challange 'da ki bosluk gorunumu elde etmek için
            System.out.println();
            System.out.println();
        }
    }
}

