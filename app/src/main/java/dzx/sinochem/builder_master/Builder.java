package dzx.sinochem.builder_master;

/**
 * 作者： 敦志轩 on 2018/8/20.
 * 邮箱： 997681136@qq.com
 */
public abstract class Builder {

    //设置主机
    public abstract void setBoard(String board);

    //设置显示器
    public abstract void setDisplay(String display);

    //设置操作系统
    public abstract void setOS();

    //创建Computer
    public abstract Cumputer create();
}
