class Primeupto100
{
    public static void main(String args[])
    {
        int i,j,n=100;
        for(i=2;i<=n;i++)
        {
            int count=0;
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    count++;
                    break;
                }
            }
            if(count==0)
            System.out.println(i+"");
        }
    }
}
