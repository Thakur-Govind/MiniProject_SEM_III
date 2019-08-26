//print the series 1,11,111,1111,......n terms
class pro1
{
    void main(int n)
    {
        int s=0;
        int d=0;
        for(int i=1;i<=n;i++)
        {
            d=d*10+1;
            
            System.out.print(d+",  ");
        }
    }
}
        