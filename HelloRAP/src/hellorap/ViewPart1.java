package hellorap;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

public class ViewPart1 extends ViewPart {

	public ViewPart1() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		Label label=new Label(parent, SWT.NONE);
		label.setText("very good");
		
		Text text=new Text(parent, SWT.WRAP);
		text.setText("我以为我已经释怀，可以勇敢的回忆一切;却不知，有些事，有些人，一旦走进心里就再难放下");
		text.setFont(new Font(parent.getDisplay(),"黑体",15,SWT.NORMAL));
		text.setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_RED));
		text.setEditable(false);
		
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
