package res;

import javax.swing.JFrame;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.BorderLayout;

public class Tests extends JFrame{
	public Tests() {
		
		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("New JGoodies label");
		getContentPane().add(lblNewJgoodiesLabel, BorderLayout.WEST);
		
		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("New JGoodies title");
		getContentPane().add(lblNewJgoodiesTitle, BorderLayout.CENTER);
	}

}
