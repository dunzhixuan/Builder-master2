package dzx.sinochem.builder_master;

/**
 * 作者： 敦志轩 on 2018/8/20.
 * 邮箱： 997681136@qq.com
 */
public class CumputerBuilder extends Builder{
    private Cumputer cumputer = new MacBook();

    @Override
    public void setBoard(String board) {
        cumputer.setmBoard(board);
    }

    @Override
    public void setDisplay(String display) {
        cumputer.setmDisplay(display);
    }

    @Override
    public void setOS() {
        cumputer.setOS();
    }

    @Override
    public Cumputer create() {
        return cumputer;
    }
}
