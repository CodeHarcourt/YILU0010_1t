package 后端0010_1;
import java.util.Scanner;
public class Hero {
     public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         HeroNature hero=new HeroNature();
         System.out.println("输入英雄的名字：");
         hero.heroName=sc.nextLine();//要求用户输入英雄名字并系统读入内存
         System.out.println("英雄名字："+hero.heroName);
         System.out.println("初始血量:"+hero.heroHP);
         System.out.println("初始等级:"+hero.level);//显示英雄初始属性
         System.out.println("输入敌方英雄的类型(1为普通英雄；2为高级英雄)：");
         int heroType=sc.nextInt();
         int init_Hp=HeroType(heroType);//调用初始化英雄类型的血量的方法
         Scanner sd=new Scanner(System.in);
         System.out.println("选择绝招类型（输入【系统绝招】对敌方英雄造成100点伤害或【自定义绝招】自定义对敌方英雄造成的伤害）");
         String skill=sd.nextLine();
         boolean match,match1;//这两个参数是用来判断读入绝招的类型
         if(match=skill.equals("系统绝招")){
             init_Hp=FinalHit(init_Hp);//调用系统绝招伤害方法
             System.out.println("敌方当前血量值："+init_Hp);
         }else if(match1=skill.equals("自定义绝招")){
             init_Hp=FinalHit((long)init_Hp);//调用自定义绝招伤害方法
             System.out.println("敌方当前血量值："+init_Hp);
         }
     }
     public static int HeroType(int herotype) {
         int Hp=0;
         if (herotype == 1) {
             Hp=100;
         } else if (herotype == 2) {
             Hp=200;
         }
         return Hp;
     }//此方法用于初始化传入英雄类型的血量
     public static int FinalHit(int HP){
         int rest_HP;
         return rest_HP=HP-100;
     }//此方法为系统绝招造成的伤害
     public static int FinalHit(long HP){
         System.out.println("自定义一个绝招的伤害：");
         Scanner sb=new Scanner (System.in);
         int reduce_HP=sb.nextInt();
         return (int)(HP-reduce_HP);
     }//此方法为自定义绝招造成的伤害
}
