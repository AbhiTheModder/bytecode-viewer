package the.bytecode.club.bytecodeviewer.translation.components;

import the.bytecode.club.bytecodeviewer.translation.TranslatedComponent;
import the.bytecode.club.bytecodeviewer.translation.Translation;

import javax.swing.*;

/**
 * @author Konloch
 * @since 6/28/2021
 */
public class TranslatedJRadioButtonMenuItem extends JRadioButtonMenuItem
{
	private final TranslatedComponent component;
	
	public TranslatedJRadioButtonMenuItem(String text, Translation translation)
	{
		super(text);
		this.component = translation.getTranslatedComponent();
		this.component.runOnUpdate.add(this::updateText);
	}
	
	public void updateText()
	{
		setText(component.value);
	}
}
