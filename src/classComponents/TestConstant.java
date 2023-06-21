package classComponents;

public class TestConstant {
    public static void main(String[] args) {
        //oracle local un, pass
        System.out.println("oracle local un, pass : " + Constant.Oracle.Local.username + "\t" + Constant.Oracle.Local.password);
        //oracle dev un, pass
        System.out.println("oracle Dev un, pass : " + Constant.Oracle.Dev.username + "\t" + Constant.Oracle.Dev.password);
        //oracle prod un, pass
        System.out.println("oracle Prod un, pass : " + Constant.Oracle.Prod.username + "\t" + Constant.Oracle.Prod.password);

        //mysql local un, pass
        System.out.println("Mysql local un, pass : " + Constant.Mysql.Local.username + "\t" + Constant.Mysql.Local.password);

        //mysql dev un, pass
        System.out.println("Mysql Dev un, pass : " + Constant.Mysql.Dev.username + "\t" + Constant.Mysql.Dev.password);

        //mysql prod un, pass
        System.out.println("Mysql Prod un, pass : " + Constant.Mysql.Prod.username + "\t" + Constant.Mysql.Prod.password);
    }
}
