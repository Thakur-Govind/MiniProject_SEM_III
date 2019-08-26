//print seroes 1, 12, 123, 1234....n terms
class pro2
{
    void main(int n)
    {
        int d=1;
        System.out.print(d);
        for(int i=2;i<=n;i++)
        {
            d=d*10+i;
            System.out.print(" "+d);
        }
    }
}