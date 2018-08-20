package dzx.sinochem.builder_master;

/**
 * 作者： 敦志轩 on 2018/8/20.
 * 邮箱： 997681136@qq.com
 */
public class Test {

    public static void main(String[] args){
        Builder builder = new CumputerBuilder();
        Director director = new Director(builder);
        director.construct("英特尔主板","三星显示器");
        System.out.print(""+builder.create().toString());
    }
}
