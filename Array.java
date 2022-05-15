class Array
{
    public static void main(String[] args)
    {
        int i;
        int [] element = {1, 2, 3};
        int [] no= new int [3];
        int [] marks;
        marks = new int [8];
        for( i=0;i<3;i++)
        {
            System.out.print(no[i]);
            
            System.out.print(element[i]);
        }   
        System.out.println(marks[i]);

        int [][] multi = new int [2][3];
        int x,y;
            System.out.print(multi.length);

        for(x=0;x<=2;x++)
        {
            for(y=0;y<=3;y++)
            {
                System.out.print(" "+multi[y]);
            }
            System.out.println(" ");

        }
    }
}