//WAP to input a number and the find the middle digit if the no does not have any middle digit then calculate avg of the middle 2;
class harsh
{
    void main(int no)
    {
        int n=no;
        int k=0;
       
        while(no!=0)
        {
            ++k;
            no=no/10;
        }
        if(k%2==0)
        {
            no=(int)Math.round(k/2)
            ;
            int k1=no-1;
            double f1=((((n%Math.pow(10,no+1)-n%Math.pow(10,no)))/Math.pow(10,no))+((n%Math.pow(10,k1+1)-n%Math.pow(10,k1))/Math.pow(10,k1)))/2;
            System.out.println(f1);
            
        }
        else
        {
            no=(int)Math.round(k/2);
            int f=(n%(int)Math.pow(10,(no+1))-n%(int)Math.pow(10,no));
            System.out.println(f/(int)Math.pow(10,no));
        }
        
    }
}
        