class Demo6
{
    public static void main(Strng args[])
    {
        StringBuilder sb=new StringBuilder("Hello");
         sb.append("Ramesh");
         System.out.println(sb);
 
         sb.insert(0,"HI");
          System.out.println(sb);
 
          sb.replace(8,15,"Rakesh");
          System.out.println(sb);

          sb.delete(1,5);
          System.out.println(sb.reverse());
      }
} 