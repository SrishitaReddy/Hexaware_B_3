class Demo3 extends Thread
{
     public static void main(String args[])
      {
           String name1="sri";
           String name2="srishi";
           String name3="sri";
           String name4=new String("sri");
           String name5=new String("sri");
          
           System.out.println(name1==name2);
            System.out.println(name1==name3);
            System.out.println(name1==name4);
             System.out.println(name5==name4);
             System.out.println(name5.equals(name1));
              System.out.println(name5==name1);
       }
}