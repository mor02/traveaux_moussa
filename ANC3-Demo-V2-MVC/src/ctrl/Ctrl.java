package ctrl;

import model.Text;

public class Ctrl {

    private final Text text;

    public Ctrl(Text text) {
        this.text = text;
    }
   
    public void lineSelection(int numLine) {
        if (numLine >=0 && numLine < text.nbLines())
            text.select(numLine);
        else
            text.unselect();
    }
    
    public void addLine() {
        text.addLine("");
    }
    
    public void updateSelectedLine(String txt) {
        text.updateSelectedLine(txt);
    }
    
}
