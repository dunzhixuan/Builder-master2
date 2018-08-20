package dzx.sinochem.builder_master;

/**
 * 作者： 敦志轩 on 2018/8/20.
 * 邮箱： 997681136@qq.com
 */
public abstract class Cumputer {

    protected String mBoard;
    protected String mDisplay;
    protected String mOS;

    public void setmBoard(String mBoard) {
        this.mBoard = mBoard;
    }

    public void setmDisplay(String mDisplay) {
        this.mDisplay = mDisplay;
    }

    public abstract void setOS();

    @Override
    public String toString() {
        return "Cumputer{" +
                "mBoard='" + mBoard + '\'' +
                ", mDisplay='" + mDisplay + '\'' +
                ", mOS='" + mOS + '\'' +
                '}';
    }
}
