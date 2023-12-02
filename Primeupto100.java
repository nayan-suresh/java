class primeupto100
{
    public static void main(String args[])
    {
        int n=100;
        int i,j,count=0;
        for(i=2;i<=n;i++)
        {
            count=0;
        }
        for(j=2;j<i;j++)
        {
            if(i%j==0)
            {
                count++;
            }
        }
        if(count==0)
        {
            System.out.println(i+"");
        }

    }
}