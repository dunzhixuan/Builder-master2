package dzx.sinochem.builder_master;

/**
 * 作者： 敦志轩 on 2018/8/20.
 * 邮箱： 997681136@qq.com
 */
public class Director {

    Builder mBuilder = null;

    public Director(Builder builder){
        mBuilder = builder;
    }

    public void construct(String board,String display){
        mBuilder.setBoard(board);
        mBuilder.setDisplay(display);
        mBuilder.setOS();
    }
}
