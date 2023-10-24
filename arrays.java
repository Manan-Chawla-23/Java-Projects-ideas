public class arrays 
{
 public static void main(String []args)    
 {
    String car[]=new String[5];
    car[0]="Tesla";
    car[1]="Lincoln";
    car[2]="Genisis";
    car[3]="Chrysler";
    car[4]="Dacia";

    for(int i=0;i<car.length;i++)
    {
        System.out.println("Car--->"+car[i]);
    }

    String hero[][]={
        {"Iron man","Captain America","Hulk"},
        {"Black widow","Hawkeye","Wanda"},
        {"QuickSliver","Vision","War Machine"}
    };
    for(int i=0;i<hero.length;i++)
    {
        System.out.println("---------------");
        for(int j=0;j<hero[i].length;j++)
        {
            System.out.println(hero[i][j]+"");
        }
    }
 }
}


